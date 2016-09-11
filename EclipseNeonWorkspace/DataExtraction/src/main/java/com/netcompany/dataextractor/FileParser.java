package com.netcompany.dataextractor;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class FileParser {
	public enum Headers {
	    ID,Name
	}
	public Stream<String> ReadAllLines(String filePath) throws IOException{
		Stream<String> lines= Files.lines(Paths.get(filePath));
		return lines;

	}
	public void parseExcelCVSFile(String filePath) throws IOException{
		Reader in=new FileReader(filePath);
		Iterable<CSVRecord> records=CSVFormat.EXCEL.parse(in);
		records.forEach(record->{
			String value=record.get("Name of column");
			
		});
	}
	public void columnValueByIndex(String filePath) throws IOException{
		Reader in=new FileReader(filePath);
		Iterable<CSVRecord> records=CSVFormat.RFC4180.parse(in);
		records.forEach(record->{
			String columnOne=record.get(0);
			System.out.println(columnOne);
		});
		
	}
	/**
	 * Indices may not be the most intuitive way to access record values. For this reason it is possible 
	 * to assign names to each column in the file:
	 * @param filePath
	 * @throws IOException
	 */
	public void customHeader(String filePath) throws IOException{
		Reader in = new FileReader(filePath);
		String ID="ID";
		String NAME="Name";
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader(ID,NAME).parse(in);
		records.forEach(record->{
			String id=record.get(ID);
			String name=record.get(NAME);
			System.out.println(id+" "+name);
			
		});
		
	}
	
	public void usingEnumHeadr(String filePath) throws IOException{

		Reader in = new FileReader(filePath);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader(Headers.class).parse(in);
		records.forEach(record->{
			String id=record.get(Headers.ID);
			String name=record.get(Headers.Name);
			System.out.println(id+" "+name);
		});
	}
	
	public void firstRowAsHeader(String filePath) throws IOException{
		Reader in = new FileReader(filePath);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
		    String id = record.get("ID");
		    String name = record.get("NAME");
		    System.out.println(id+" "+name);
		}
	}
	

}
