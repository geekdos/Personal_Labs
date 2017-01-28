import csv

fileName = "demo.csv"
READ = "r"

with open(fileName, READ) as myCsvFile :
    #Read the file content
    dataFromFile = csv.reader(myCsvFile)
    for dataRow in dataFromFile :
        print(', '.join(dataRow))
        for singleRow in dataRow :
            print(singleRow)