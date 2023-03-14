#include<stdio.h>

int main(){
    char *p;
    char c[11]="hOLa munDO";
    printf("a \n");
    p=&c[0];
    printf("a \n");
    while (!(*p=='\0'))
    {
        if ((*p>97)&&(*p<=122))
        {
            *p=*p-32;
        }
        p+1;
        
    }
    printf("%s \n",c);
    return 0;
}