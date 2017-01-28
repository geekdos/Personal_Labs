#with the format specifier
area = 0
height = 10
width = 20

area = (height * width) / 2
#calculat the area of the triangle
print("the area of the triangle is %f " % area)
#%d ==> decimal number (integer)
#%3d ==> the length of 3 numbers
#%f ==> float number
#%.2f ==> 2 decimal after the point
#%.xf ==> x decimal after the point

#make just tow decimal numbers after
print("the area of the triangle is %.2f " % area)

#useing the .format function

print("the height of the triangle is {0:d} ".format(height))
print("the width of the triangle is {0:d} ".format(width))
print("the area of the triangle is {0:.2f} ".format(area))

#I use the \ to continue on the next line
print("This is the first number {0:d}, " \
    "the second is {1:f} and the third is {2:.2f} \
    ".format(1,2.2548,8.2565))

#I use the + to concatenate the strings
print("This is the first number {0:d}, "+
    "the second is {1:f} and the third is {2:.2f} "+
    "".format(1,2.2548,8.2565))