#Sys the module how has the error handling
import sys
#To catch an exception

#Devision by zero
try:
    firstNumber = float(input("Enter the first number: "))
    secondNumber = float(input("Enter the second number: "))
    result = firstNumber / secondNumber

    print("The result of {0:f} / {1:f} = {2:f} ".format(firstNumber,secondNumber,result))

except ZeroDivisionError:
    print("The answer is infinity because you try to devise by zero")

except:
    error = sys.exc_info()[0] #to find the error
    print(error)
    print("Sorry something went wrong")

finally:
    print("This code always run")