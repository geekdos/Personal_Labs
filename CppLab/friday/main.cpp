/*
ID: oussama6
LANG: C++
TASK: friday
PROG: friday
*/

#include <iostream>
#include <cstdio>

using namespace std;

bool isLeap(int year){
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        return true;
    else
        return false;
}

int main()
{
    int N = 0;
    int years[12]  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int lyears[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days[7] = {0};

    freopen ("friday.in", "r", stdin);
    //freopen ("friday.out", "w", stdout);

    scanf("%d",&N);

    printf("%d", N);

    if(isLeap(2000)){
        printf("Good");
    }else{
        printf("Not good");
    }

    return 0;
}
