def up_low(s):
    lowercase=0
    uppercase=0
    for char in s:
        if char.isupper():
            uppercase+=1
        elif char.islower():
            lowercase+=1
        else:
            pass
    print(f'original string is {s}')
    print(f'no. of lower case are {lowercase}')
    print(f'no. of upper case are {uppercase}')