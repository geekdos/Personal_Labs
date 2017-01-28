import datetime

#storing the current date on the currentDate variable
currentDate = datetime.date.today()

#Display the current date, the day, the month and the year
print(currentDate)
print(currentDate.day)
print(currentDate.month)
print(currentDate.year)

#formating datetime of the current date
print(datetime.datetime.strftime(currentDate, "%d/%m/%Y"))

#Take the user input (the birthday)
userInput = input("Please inter you Birthday like 02/04/1991 : ")
birthday = datetime.datetime.strptime(userInput, "%d/%m/%Y").date()
print(birthday)

dayNumbers = birthday - currentDate

print(dayNumbers)

#challange

user_deadline = input("Give me the deadline of your project : ")
deadline = datetime.datetime.strptime(user_deadline, "%d/%m/%Y").date()

days = deadline - currentDate

print(days.days)
print(days.days / 7)
print(days.days / 7)










