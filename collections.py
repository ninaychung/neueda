from readline import set_pre_input_hook


a = 1
b = 'words'
c = 3.14
d = True
things_list = [a,b,c]
things_list.pop() # remove from the RIGHT
things_list.append([5,4,3]) # adds to the RIGHT
print(things_list[1:6:2]) # start:stop-before:set_pre_input_hook
# lists re mutable
#things_list[3] = 'altered'

# tuple
my_tuple = (b,a,c, True, 'immutable', things_list) # tuples are immutalbe
for item in my_tuple:
    print(item)

# string - an ordinal immutable collection of characters
s = 'strings are immutable'
# s[3] = 'X' # nope
print(s[4:12:3])


# dictionary
d = {'name': 'Floella', 'age': 72, 'airtime': 1967}
d['here'] = True
print(d)
# dictionary is made out of key value pairs
for k,v in d.items():
    print(k,v)

# fun with casting types
codes_str = 'ATVI, ADBE, AAPL, BA, CPB, DAL, EA, EL, GPS, INTC, MRK, NFLX, NVDA, PFE, RHT, UA'
names_str = 'Activision, Adobe, Apple, Boeing, Campbell Soup, Delta Air Lines, Electronic Arts, Gap, Intel, Merk, Netflix, Nvidia, Pfizer, Red Hat, Under Armour'
names_l = names_str.split(', ')
codes_l = codes_str.split(', ')
print(names_l)
#print(codes_str[2:18:2])

# Python has a 'zip' operator : zip collections together
# predates compression

stock = dict(zip(codes_l, names_l))
print(stock)


