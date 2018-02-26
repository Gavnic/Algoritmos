#include <iostream>

using namespace std;
//Las variables Overflow son el número en el que produce el overflow
short Fibo_short(short n){
    if(n==0){
        return 0;
    }
    short a=0;
    short b=1;
    for(short i = 1;i<n;i++ ){
        b=(a+b);
        a=(b-a);
    }
    return b;
}

int Fibo_int(int n){
    if(n==0){
        return 0;
    }
    int a=0;
    int b=1;
    for(int i = 1;i<n;i++ ){
        b=	(a+b);
        a=(b-a);
    }
    return b;
}

long Fibo_long(long n){
    if(n==0){
        return 0;
    }
    long a=0;
    long b=1;
    for(long i = 1;i<n;i++ ){
        b=(a+b);
        a=(b-a);
    }
    return b;
}

long long Fibo_long_long(long long n){
    if(n==0){
        return 0;
    }
    long long a=0;
    long long b=1;
    for(long long i = 1;i<n;i++ ){
        b=a+b;
        a=b-a;
    }
    return b;
}

int main(){
    short Overflow_short=85;
    int Overflow_int=47;
    long Overflow_long=93;
    long long Overflow_long_long=93;

    cout<< Fibo_short(Overflow_short)<<endl;
    cout<< Fibo_int(Overflow_int)<<endl;
    cout<< Fibo_long(Overflow_long)<<endl;
    cout<< Fibo_long_long(Overflow_long_long)<<endl;


    return 0;
}


