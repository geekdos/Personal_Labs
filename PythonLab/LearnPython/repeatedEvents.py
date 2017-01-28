import turtle
#turtle.color('red')
#turtle.forward(100)
#turtle.right(90)
#turtle.forward(100)
#turtle.right(90)
#turtle.forward(100)
#turtle.right(90)
#turtle.forward(100)
#
##using the loops
#
#for steps in range(4) :
#    turtle.forward(100)
#    turtle.right(90)
#    for subSteps in range(4) :
#        turtle.forward(50)
#        turtle.right(90)


#normal loop start from 0
print("Normal loop start from 0")
for steps in range(4) :
    print(steps)

#Normal loop start from 1 end on 3
print("Normal loop start from 1 end on 3")
for steps in range(1,4) :
    print(steps)

#Normal loop start from 1 end on 9 an go by 2
print("Normal loop start from 1 end on 9 an go by 2")
for steps in range(1,10,2):
    print(steps)

# Normal loop start from 1 end on 4 (foreach)
print("Normal loop start from 1 end on 4 using the array notation")
for steps in  [1, 2, 3, 4]:
    print(steps)

#for color in ['red', 'green', 'blue', 'black'] :
#    turtle.color(color)
#    turtle.forward(100)
#    turtle.right(360/4)

#while loop

answer = 0
while answer != '4' :
    answer = input("Whats is 2 + 2 ?")
print("Yes the result is 4")

#counter = 0
#while counter < 4 :
#    turtle.color(color)
#    turtle.forward(100)
#    turtle.right(360/4)
#    counter += 1 

#numberOfSides = int(input("Give me the number of your chip sides :"))
#
#for steps in range(numberOfSides) :
#    turtle.forward(100)
#    turtle.right(360/numberOfSides)
#    for subSteps in range(numberOfSides) :
#        turtle.forward(50)
#        turtle.right(360/numberOfSides)
#        for subSubSteps in range(numberOfSides):
#            turtle.forward(25)
#            turtle.right(360 / numberOfSides)
#
#input("")