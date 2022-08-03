# we may grab data from...
# a database
# an API e.g. http://ooblywoobly.com
# python start-up variable
# read/write files (any file)
# when we look at Data Analysis we will open csv and xlsx
# sensors, e.g. temperature. motion.. .
# user input

c_str = input('Stock Code: ') # EVERY input is always a string
print(c_str, type(c_str), c_str.isnumeric())
invalidQty = True
while invalidQty:
    q_str = input('Stock Quantity: ')
    try:
        q_int = int(float(q_str)) # good practice,  cannot make an int out of 43.2
        invalidQty = False
    except ValueError:
        pass
