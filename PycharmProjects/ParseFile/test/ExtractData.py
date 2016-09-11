# -*- coding: utf-8-*-
import os

BASE_FOLDER = r'C:\Users\BAM\Desktop\files'
BREV_TXT_FILE = os.path.join(BASE_FOLDER, 'breve.txt')
BREV_TXT_SPECIAL_FILE = os.path.join(BASE_FOLDER, 'breve_speciel.txt')
BREV_FTM_FOLDER = os.path.join(BASE_FOLDER, 'BreveFTM')
RESULT_FOLDER = os.path.join(BASE_FOLDER, 'result')
LINE_SEP = os.linesep
resultFileMap = {}
resultFileSpecialMap={}

'''
1-Read breve.txt or breve_special.txt file
2-Extract all CPR-nr
3- Return CPR-nr list
'''


def ExtractCPRFromTextFile(filePath):
    file = open(filePath, 'r')
    lines = file.readlines()
    brevCPR = []
    for line in lines:
        lineTokkens = line.split('@')
        brevCPR.append(lineTokkens[0])
    return brevCPR


'''
1-Read a BREVXXX.FTM file
2-Extract CPR in each line
3-Return CPR-nr in a list
'''


def ExtractCPRFromFTMFile(filePath):
    ftmCPRList = []
    startIndex = 8 + 43 + 34 + 34 + 34 + 34 + 34 + 8
    endIndex = startIndex + 11
    ftm_file = open(filePath, 'r')
    allLines = ftm_file.readlines()
    for line in allLines:
        ftmCPRList.append(line[startIndex:endIndex])

    return ftmCPRList


'''
1-Remove all result files (RESULTXXXX.txt) from result folder
2- List all files in breveFTM folder and for each BREVXXX.FTM
create a result file in the result folder
'''


def CreateResultFiles():
    Result_Fiels = os.listdir(RESULT_FOLDER)
    if len(Result_Fiels) != 0:
        for result in Result_Fiels:
            os.remove(os.path.join(RESULT_FOLDER, result))
    FTM_FILES = os.listdir(BREV_FTM_FOLDER)
    for ftmFile in FTM_FILES:
        resultFileName = ftmFile.replace('BREV', 'RESULT').replace('.FTM', '.txt')
        resultFileWithSuffix=ftmFile.replace('BREV', 'RESULT_SPECIAL').replace('.FTM', '.txt')
        resultFilePath = os.path.join(RESULT_FOLDER, resultFileName)
        specialResultFilePath=os.path.join(RESULT_FOLDER, resultFileWithSuffix)
        open(resultFilePath, 'w').close()
        open(specialResultFilePath,'w')
        resultFileMap[ftmFile] = resultFilePath
        resultFileSpecialMap[ftmFile]=specialResultFilePath


def MainMethod():
    CreateResultFiles()
    breve_cpr_list = ExtractCPRFromTextFile(BREV_TXT_FILE)
    breve_special_cpr_list=ExtractCPRFromTextFile(BREV_TXT_SPECIAL_FILE)
    ftm_file_list = os.listdir(BREV_FTM_FOLDER)
    for ftmFile in ftm_file_list:
        resultFile = open(resultFileMap[ftmFile], 'a')
        resultSpecialFile=open(resultFileSpecialMap[ftmFile], 'a')
        ftm_cpr_list = ExtractCPRFromFTMFile(os.path.join(BREV_FTM_FOLDER, ftmFile))
        for cpr in ftm_cpr_list:
            if cpr not in breve_cpr_list:
                resultFile.write(cpr + os.linesep)
            if cpr not in breve_special_cpr_list:
                resultSpecialFile.write(cpr+os.linesep)
        resultFile.close()
        resultSpecialFile.close()

MainMethod()