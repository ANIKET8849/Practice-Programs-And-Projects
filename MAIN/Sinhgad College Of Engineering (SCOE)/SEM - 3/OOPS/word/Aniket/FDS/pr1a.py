def f1():
    print("Students who play both cricket and badminton : ",{i for i in lista if i in listb})

def f2():
    c=[i for i in lista if not i in listb]
    d=[i for i in listb if not i in lista]
    print("Students who play either cricket or badminton but not both : ",{i for i in c+d})

lista=[]
listb=[]

A=int(input("Enter the number of count for A: "))
for i in range(A):
    name=input("Enter name : ")
    lista.append(name)
    print(lista)

B=int(input("Enter the number of count : for B"))
for i in range(B):
    name=input("Enter name : ")
    listb.append(name)
    print(listb)

while(1):
    print("1. Students who play both cricket and badminton")
    print("2. Students who play either cricket or badminton but not both")
    ch=int(input("Enter you choice : "))

    if(ch==1):
        f1()
    elif(ch==2):
        f2()
    else:
        print("Invalid choice")