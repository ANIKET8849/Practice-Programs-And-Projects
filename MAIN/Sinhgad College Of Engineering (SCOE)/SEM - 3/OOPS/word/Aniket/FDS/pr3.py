res=[[0,0,0],[0,0,0],[0,0,0]]

def add(a,b):
    for i in range(len(a)):
        for j in range(len(b)):
            res[i][j]=a[i][j]+b[i][j]
    print("Addition of two matrix is ",res)

def sub(a,b):
    for i in range(len(a)):
        for j in range(len(b)):
            res[i][j]=a[i][j]-b[i][j]
    print("Subtraction of two matrix is ",res)

def mul(a,b):
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
             res[i][j]+=a[i][k]*b[k][j]
    print("Multiplication of two matrix is ",res)

def trans(a):
    for i in range(len(a)):
        for j in range(len(a[0])):
            res[i][j]=a[j][i]
    print("Subtraction of two matrix is ",res)

a=[[1,2,3],[4,5,6],[7,8,9]]
b=[[1,2,3],[4,5,6],[7,8,9]]

while(1):
    print("***Matrix Computation***")
    print("1. Addition ")
    print("2. Subtraction")
    print("3. Multiplication ")
    print("4. Transpose ")
    ch=int(input("Enter ur choice : "))
    if(ch==1):
        add(a,b)
    elif(ch==2):
        sub(a,b)
    elif(ch==3):
        mul(a,b)
    elif(ch==4):
        trans(a)
    else:
        break