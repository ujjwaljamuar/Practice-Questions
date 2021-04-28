import string
def ispangram(str1, alphabet=string.ascii_lowercase):
    alphaset=set(alphabet)
    str1=str1.replace(' ','')
    str1=str1.lower()
    str1=set(str1)
    return print(str1==alphaset)
ispangram('The quick brown fox jumps over the lazy dog')
ispangram('my name is ujjwal jamuar')

#another method
def pangram(s):
    s=set(s)
    s.discard(" ")
    return " :-It is a pangram " if len(s)==26 else 'not a pangram'
print('input your text : ')
print(pangram(input().lower()))