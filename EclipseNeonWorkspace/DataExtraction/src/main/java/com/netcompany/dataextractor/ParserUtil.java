package com.netcompany.dataextractor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ParserUtil {
	public enum Headers {
		CPR, STATUS, OPRETTET, BREVE, ANDRE_COLUMN, ANDRE_COLUMN_VEARDI
	}

	static char A_SEP = '@';
	static String BASE_FOLDER = "C:\\Users\\BAM\\Desktop\\files\\";
	static String FTM_FOLDER = BASE_FOLDER + "BreveFTM";
	static String BREVE_TXT = BASE_FOLDER + "breve.txt";
	static String RESULT_FOLDER = BASE_FOLDER + "result\\";

	public static void main(String[] args) throws IOException {
		new ParserUtil().parse();
	}

	/**
	 * Parse breve.txt CSV file med apache commons CSV 
	 * @throws IOException
	 */
	public void parse() throws IOException {
		File all = new File(FTM_FOLDER);
		File[] files = all.listFiles();
		Reader in = new FileReader(BREVE_TXT);
		Iterable<CSVRecord> breveTxtrecords = CSVFormat.newFormat(A_SEP).withHeader(Headers.class).parse(in);

		List<String> cprTextList = new ArrayList<>();
		for (CSVRecord record : breveTxtrecords) {
			String brevTxtCPR = record.get(Headers.CPR);
			cprTextList.add(brevTxtCPR);
		}

		for (File file : files) {
			checkFTM(file, cprTextList);
		}
	}

	/**
	 * 
	 * @param breveFTM BREVXXXX.FTM
	 * @param brevCprList : CPR.nr list fra breve.txt
	 * @throws IOException
	 */
	public void checkFTM(File breveFTM, List<String> brevCprList) throws IOException {
		System.out.println("Tjeck file : " + breveFTM.getName());
		int startIndex = 8 + 43 + 34 + 34 + 34 + 34 + 34 + 8;

		Stream<String> lines = Files.lines(Paths.get(breveFTM.getAbsolutePath()), Charset.forName("windows-1252")); 																										
		Iterator<String> itr = lines.iterator();
		List<String> ftmCprList = new ArrayList<>();

		while (itr.hasNext()) {
			String line = itr.next();
			String ftmCPR = line.substring(startIndex, startIndex + 11);
			ftmCprList.add(ftmCPR);
		}

		List<String> cprNotInBrevTxt = new ArrayList<String>();
		for (String cpr : ftmCprList) {
			if (!brevCprList.contains(cpr)) {
				cprNotInBrevTxt.add(cpr);
			}
		}

		String resultFileName = breveFTM.getName().replace("BREV", "RESULT").replace(".FTM", ".txt");
		writeToResultFile(RESULT_FOLDER + "\\" + resultFileName, cprNotInBrevTxt);

	}

	public void writeToResultFile(String filePath, List<String> cprList) throws IOException {
		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
		}
		PrintWriter pw = new PrintWriter(new FileWriter(filePath));
		for (String cpr : cprList) {
			pw.println(cpr);
		}
		pw.close();

	}
}
