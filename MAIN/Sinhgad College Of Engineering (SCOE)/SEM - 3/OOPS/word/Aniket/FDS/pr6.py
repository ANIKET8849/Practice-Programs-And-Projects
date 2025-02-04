def quicksort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[0]
    left = []
    right = []

    for i in arr[1:]:
        if i < pivot:
            left.append(i)
        else:
            right.append(i)

    return quicksort(left) + [pivot] + quicksort(right)

def top_five_marks(arr):
    print("Top five marks are:")
    print(*arr[-5:][::-1], sep="\n")

arr=[]
m=int(input("Enter number of elements:"))
for i in range(m):
    element=float(input("Enter the First Year Percentage : "))
    arr.append(element)
print("Percentage before Sorting= ",arr)
arr=quicksort(arr)
print(arr)
top_five_marks(arr)
    

