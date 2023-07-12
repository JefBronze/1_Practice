# Python program to calculate the first hundred numbers of the Fibonacci sequence

def fibo(n):
    if n <= 1:
        return n
    else:
        return (fibo(n - 1) + fibo(n - 2))

number_of_n = 100
for i in range(number_of_n):
    print(fibo(i))

result = fibo(10)
print('fibo(10) = ' + str(result))