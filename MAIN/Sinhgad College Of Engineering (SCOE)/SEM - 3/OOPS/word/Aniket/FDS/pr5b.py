def bubble():
    n=len(list)
    for i in range(n-1):
        for j in range(n-i-1):
            if(list[j]>list[j+1]):
                list[j],list[j+1]=list[j+1],list[j]
    print("Percentage after sorting : ",list) 
    print("Top five scores are : ")
    print(list[-5:][::-1])     

list=[]

c=int(input("Enter the number of element to be eneterd :  "))
for i in range(c):
    per=float(input("Enter the percentage"))
    list.append(per)
print(list)

print("Percentage before sorting : ",list)
bubble()