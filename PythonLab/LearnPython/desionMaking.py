favourite_team = input("You favourite team is the RCA ")

if favourite_team.upper() == 'YES' :
    print("You are a RAJAOUI !!")
else:
    print("You are not a RAJAOUI !!")

print("Have a nice day !!")

#challange

amount = float(input("Inter your amount : "))

if amount < 50 :
    total = amount + 10
else:
    total = amount + 0

print("The total including shipping coast is %.3f$ " % total)