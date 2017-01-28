#Empty list
guests = []
scoors = []

#Liste
guests = ['Dina', 'Oussama', 'Ayoub', 'Wael']
scoors = [18, 20, 16, 15]

print(guests[0])
print(guests[-1])
print(guests[-2])

#Remove from the list
print('The value was '+guests[-2])
guests[-2] = 'Lahkim'
print('The value now is '+guests[-2])

#Add items to the list
guests.append('Araabab')
print('The added value is '+guests[-1])
guests.append('Nada')
print('The added value is '+guests[-1])

#Remove using the value from the list
guests.remove('Lahkim')

#remove using the index (position)
del guests[0]

#Return the position
print(guests.index('Oussama'))

#Display all the values inside the guests list using the for loop
for name in guests :
    print(name)
#Challange

guestsNumber = int(input("Give me the total number of guests : "))
number = 0
partyGuests = []
while number < guestsNumber :
    partyGuests.append(input("Inter thn name of the guests : "))
    number += 1

partyGuests.sort()
for name in partyGuests :
    print(name)