
def f1():
    c=[i for i in listc if not i in lista]
    d=[i for i in c if not i in list(listb)]
    print("Students who play neither cricket nor badminton : ",set(d))

def f2():
    c=[i for i in lista if not i in listc]
    d=[i for i in c if not i in list(listb)]
    print("Students who play cricket and football but not badminton : ",(lista|listc)-listb)

lista=set()
listb=set()
listc=set()

A=int(input("Enter the number of count for A: "))
for i in range(A):
    name=input("Enter name : ")
    lista.add(name)
    print(lista)

B=int(input("Enter the number of count for B : "))
for i in range(B):
    name=input("Enter name : ")
    listb.add(name)
    print(listb)

C=int(input("Enter the number of count for C : "))
for i in range(B):
    name=input("Enter name : ")
    listc.add(name)
    print(listc)

while(1):
    print("1. Students who play neither cricket nor badminton")
    print("2. Students who play cricket and football but not badminton")
    ch=int(input("Enter you choice : "))

    if(ch==1):
        f1()
    elif(ch==2):
        f2()
    else:
        print("Invalid choice")