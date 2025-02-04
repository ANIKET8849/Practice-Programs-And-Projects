def binary(L,U,list,key):
    mid=(L+U)//2
    if list[mid]==key:
        print("Element found")
    elif list[mid]>key:
        binary(list[0],mid-1,list,key)
    elif list[mid]<key:
        binary(mid+1,len(list)-1,list,key)
    else:
        print("Element not found")

list=[]

A=int(input("Enter no. of element to be inserted : "))
for i in range(A):
    c=int(input("Enter Number : "))
    list.append(c)
    print(list)

key=int(input("Enter the key to be search : "))
binary(list[0],len(list)-1,list,key)