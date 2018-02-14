import time
import numpy as np
import pylab as pl

def Fibo_Recur(n):
    if n==0 :
        return 0
    if n==1 :
        return 1
    return Fibo_Recur(n-1)+Fibo_Recur(n-2)

listatemp = []

Tiempo_ini = time.clock()
for i in range (0, 40, 1):
    resultado = Fibo_Recur(i)
    Tiempo_fin = time.clock()
    listatemp.append(Tiempo_fin-Tiempo_ini)

print("N=", i, "FibbRecursivo(", i, ")= ", resultado, "Tiempo", Tiempo_fin-Tiempo_ini, "Tiempo del proceso en segundos")

def fibM(n):
    memo = {}
    def fib(n):
        if n==0 :
            return 0
        if n==1 :
            return 1
        if (n-2) not in memo:
            memo[n-2] = fib(n-2)
        if (n-1) not in memo:
            memo[n-1] = fib(n-1)
        return memo[n-1] + memo[n-2]
    return fib(n)

listatemp2 = []

Inicial_Time= time.clock()
for i in range(0, 40, 1):
    resultado2 = fibM(i)
    Final_Time = time.clock()
    listatemp2.append(Final_Time - Inicial_Time)

print("N=", i, "FibbIterativo(", i, ")= ", resultado2, "Tiempo", Final_Time - Inicial_Time, "Tiempo del proceso en segundos")

numeros = np.arange(0, 40, 1)
pl.ylabel("Tiempo")
pl.xlabel("Numero")
pl.title("Tiempos Fibonacci")
pl.plot(numeros, listatemp)
pl.plot(listatemp2)
pl.show()