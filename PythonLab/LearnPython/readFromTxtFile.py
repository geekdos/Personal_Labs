#Open the file
myFile = open('demo.txt', 'r')

#Get all the content from the file
allFileContent = myFile.read()

#Display the file content
print(allFileContent)

#OR don't mix the tow of it

#Read line by line
theFirstLine = myFile.readline()
print(theFirstLine)

theSecondLine = myFile.readline()
print(theSecondLine)

#Close the file
myFile.close()