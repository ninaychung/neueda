import random

def main():
    d = input('''Welcome to the guessing game! Select your preferred range (ig: 100 would be from 1 to 100).
    -1 to quit: ''')

    while not d.isnumeric() or int(d) < 1:
        if int(d) == -1:
            exit()

        d = input('''Sorry, that was an invalid character. Please try again:
        Select your preferred range (ig: 100 would be from 1 to 100): 
        ''')
    
    startGame(int(d))

def startGame(d):
    r = random.randint(1,d)

    user_input = input('''Enter a guess between 1 to {0}. 
    -1 to quit. -2 for a hint: '''.format(int(d)))



    guess = 1

    while int(user_input) != r:
        guess += 1
        if int(user_input) == -1:
            exit()
        elif int(user_input) == -2:
            generateHint(r)
            user_input = input('Try again: ')

        
        elif int(user_input) < r: 
            user_input = input('Too low, try again: ') 
        else:

            user_input = input('Too high, try again: ')  

    if int(user_input) == r:
        print('CONGRATS {0} is the right number! You used {1} guess(es)'.format(int(user_input), guess))

def generateHint(r):
    if r % 2 == 0:
        hint = 'even'
    else:
        hint = 'odd'
    print('HINT: the number is ' + hint)

if __name__ == "__main__":
    main()