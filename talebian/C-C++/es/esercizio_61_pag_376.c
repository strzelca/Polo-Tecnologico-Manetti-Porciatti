#include <stdio.h>

#define GIORNI 22

int main()
{
    int i;
    int stipendio = 10; // assegnamo fin da subito lo stipendio il primo giorno

    for (i=1; i<=GIORNI; i++) // partiamo da 1, quindi il primo giorno ( i = 0 ) verrà saltato essendo già stato assegnato
    {
        printf("\nGiorno %d: %d", i, stipendio);
        stipendio+=stipendio; // o stipendio*=2
    }

    return 0;
}