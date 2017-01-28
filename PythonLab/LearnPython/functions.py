#Functions declaration
#def ==> define
def printHelloWorld():
    print("Hello World")
    return

printHelloWorld()

def printMessage(message) :
    print(message)
    return

printMessage('Hello World 2')

def somme(a, b):
    s = int(a) + int(b)
    print("La somme de {0:d} + {1:d} = {2:d}".format(a, b, s))
    return
somme(20,25)