#include <stdio.h>
#include <stdlib.h>

typedef char* string;

int main()
{
    string s;
    printf("Donne la chain : ");
    scanf("%s", &s);
    printf("Hello %s\n", s);
    return 0;
}
