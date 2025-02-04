def f1():
    ws=s.split()
    print("Splitted string is : ",ws)
    lon=max(ws,key=len)
    print("Word with longest length is : ",lon)

def f2():
    res={i:s.count(i) for i in set(s)}
    ch=input("Enter the character to know the freqeuncy : ")
    print("The frequency of occurrence of character in the string is ",res[ch])

s=input("Enter String : ")

while(1):
    print("1. Display word with the longest length")
    print("2. The frequency of occurrence of particular character in the string")
    ch=int(input("Enter choice : "))

    if ch==1:
        f1()
    elif ch==2:
        f2()
    else:
        break
