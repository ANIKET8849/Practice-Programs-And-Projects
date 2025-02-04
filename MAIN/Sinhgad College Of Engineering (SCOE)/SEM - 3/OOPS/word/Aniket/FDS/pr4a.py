def linear(list,key):
    for i in range(len(list)):
        if(list[i]==key):
            flag=1
        else:
            flag=0

    if(flag==1):
        print("Element found")
    else:
        print("Element not found")
list=[]

A=int(input("Enter no. of element to be inserted : "))
for i in range(A):
    c=int(input("Enter Number : "))
    list.append(c)
    print(list)

key=int(input("Enter the key to be search : "))
linear(list,key)