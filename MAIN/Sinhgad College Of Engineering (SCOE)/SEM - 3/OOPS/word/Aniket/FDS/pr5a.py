def selection():
    n=len(list)
    for i in range(n):
        for j in range(i+1,n):
            if(list[j]<list[i]):
                temp=list[i]
                list[i]=list[j]
                list[j]=temp 
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
selection()