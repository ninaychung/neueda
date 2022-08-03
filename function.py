# encapsulate resusable code

def addInterest(amount, rate=0.1):
    '''This is a doc string
    new line characters are permitted within triple quotes
    '''
    return amount * (1+rate)

def makeSquares(n=10):
    '''Take a single parameter and return all the squares
    of numbers from 1 to that parameter'''
    squares=[]
    for i in range(1, n+1):
        squares.append(i*i)
    return squares

# use our functions
sq_l = makeSquares()
print(sq_l)

# use our function
c = 100
r = 0.1
total = addInterest(c, r)

# we should leave accuracy during calculations and only collapse when outputting
print('Adding {1}% to {0} gives a total of {2:0.2f}'.format(c,r,total))