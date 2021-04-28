def isPalindrome(s):
    return s == s[::-1]
 
 
# Driver code
s = "121"
ans = isPalindrome(s)
 
if ans:
    print("Palindrome")
else:
    print("Not a Palindrome.")