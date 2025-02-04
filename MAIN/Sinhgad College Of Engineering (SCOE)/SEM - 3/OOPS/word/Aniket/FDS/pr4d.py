def fibonacci_search(arr, x):
    n = len(arr)
    
    fib_m_minus_2 = 0
    fib_m_minus_1 = 1
    fib = fib_m_minus_1 + fib_m_minus_2
    
    while (fib < n):
        fib_m_minus_2 = fib_m_minus_1
        fib_m_minus_1 = fib
        fib = fib_m_minus_1 + fib_m_minus_2
    
    offset = -1
    
    while (fib > 1):
        i = min(offset + fib_m_minus_2, n - 1)
        
        if (arr[i] < x):
            fib = fib_m_minus_1
            fib_m_minus_1 = fib_m_minus_2
            fib_m_minus_2 = fib - fib_m_minus_1
            offset = i
        
        elif (arr[i] > x):
            fib = fib_m_minus_2
            fib_m_minus_1 = fib_m_minus_1 - fib_m_minus_2
            fib_m_minus_2 = fib - fib_m_minus_1
        
        else:
            return i
    
    if (fib_m_minus_1 and arr[offset + 1] == x):
        return offset + 1
    
    return -1

sorted_array = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
search_element = 10

result = fibonacci_search(sorted_array, search_element)

if result != -1:
    print(f"Element {search_element} is present at index {result}")
else:
    print(f"Element {search_element} is not present in the array")
