def f1():
    if(s==s[::-1]):
        print("String is palindrome")
    else:
        print("String is not palindrome")

def f2():
    substr=input("Enter substring : ")
    print("first appearance of the substring is ",s.find(substr))

s=input("Enter String : ")

while(1):
    print("1. Check whether given string is palindrome or not")
    print("2. Display index of first appearance of the substring")
    ch=int(input("Enter choice : "))

    if ch==1:
        f1()
    elif ch==2:
        f2()
    else:
        break
