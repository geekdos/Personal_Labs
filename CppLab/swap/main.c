#include <stdio.h>
#include <stdlib.h>

void swap(int *a, int *b);

int main()
{
    int x = 1, y = 2;
    printf("x is %d\n", x);
    printf("y is %d\n", y);
    printf("Swapping ...\n");
    swap(&x, &y);
    printf("x is %d\n", x);
    printf("y is %d\n", y);
    return 0;
}

void swap(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
