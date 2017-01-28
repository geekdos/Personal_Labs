fileNameTxt = 'demo.txt'
fileNameCsv = 'demo.csv'

WRITE = 'w'
READE = 'r'
READE_WRITE = 'w+'
APPEND = 'a'

#image, video or audio files
BINARY = 'b'

file = open(fileNameTxt, mode = WRITE)
file.write('This is the first line\n')
file.write('This is the second line')
file.close()

guestsNumber = int(input("Give me the total number of guests : "))
number = 0
file = open(fileNameCsv, mode = WRITE)
while number < guestsNumber :
    file.write(input("Inter the name of the guests : "))
    file.write(',')
    file.write(input("Inter the age of the guests : "))
    file.write('\n')
    number += 1
file.close()

