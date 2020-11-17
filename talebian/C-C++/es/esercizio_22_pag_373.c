#include <stdio.h>

int main()
{
    int n;

    printf("\nInserisci un numero: ");
    scanf("%d", &n);

    if (n >= -5 && n <= 10)
        printf("OK");
    else
        printf("Dato fuori intervallo");

    return 0;
}
