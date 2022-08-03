# variables, simple types, basic mathematics
# loosely typed languages
# will dynamically alter data type depending on what you're doing

a = True # False, also None

b = 'hello'
b = 0.3 #BODMAS
print(type(a))
c = 1 # int
print(type(b + c))
print(b**0.5)

# conditional
if b > 1: # > < == <=, etc...
    print('b is greater than 1') # indentation matters
    # could do other stuff
elif b < 0:
    print('b is negative')
    pass # does nothing
else:
    print('b is not negative but is less than 1')

# a block ends when we no longer indent the code