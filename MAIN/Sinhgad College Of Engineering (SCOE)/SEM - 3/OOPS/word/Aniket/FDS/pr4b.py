def ss(list,key,size):
    list.append(key)
    i=0
    while(list[i]!=key):
        i=i+1


    if(i==size):
        print("Element not found")
    else:
        print("Element found")
list=[]

A=int(input("Enter no. of element to be inserted : "))
for i in range(A):
    c=int(input("Enter Number : "))
    list.append(c)
    print(list)

key=int(input("Enter the key to be search : "))
ss(list,key,A)