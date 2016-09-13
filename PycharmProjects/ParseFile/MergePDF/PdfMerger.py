# -*- coding: utf-8-*-
from PyPDF2 import PdfFileMerger, PdfFileReader
import os
'''
Simple program to merge all pdf in a directory
'''
BASE_PATH=r'C:\Users\BAM\Desktop\books\Professional AngularJS'
merger=PdfFileMerger()
files=os.listdir(BASE_PATH)
for pdf in files:
    merger.append(PdfFileReader(os.path.join(BASE_PATH,pdf),'rb'))

merger.write("Professional AngularJS.pdf")

