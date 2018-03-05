import time
import numpy as np
import pylab as pl

def fib(n):
    a=0
    b=1
    if n==0 :
        return 0
    else :
        for i in range(1,n):
            a = b
            b = a + b
        return b

dato=5000

eje_X = []

Inicial_Time = time.clock()

for i in range(1, dato, 1):
    resultado2 = fib(i)
    Final_Time = time.clock()
    eje_X.append(Final_Time - Inicial_Time)
print("N=", i, "FibbIterativo(", i, ")= ", resultado2, "Tiempo", Final_Time - Inicial_Time, "Tiempo del proceso en segundos")

eje_Y = np.arange(1, dato, 1)
pl.ylabel("Tiempo")
pl.xlabel("Numero")
pl.title("Tiempos Fibonacci")

pl.plot(eje_Y, eje_X)
pl.show()
