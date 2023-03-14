#include<stdio.h>

int main(){
    int n,x;
    n=684;
    x=2;
    while (!(n<x))
    {
        while ((n/x)!=0)
        {
            printf("%i \n",x);
            n=n/x;
        }
        x++;
    }
    return 0;

}