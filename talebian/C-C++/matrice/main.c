#include <stdio.h>

int main() {

    /* dichiarazione e inizializzazione variabili */
    int l,c,j,k; // l -> Righe, c -> Colonne, j -> Contatore Righe, k -> Contatore Colonne

    printf("\nInserisci il numero delle righe: ");
    scanf("%d", &l);

    printf("\nInserisci il numero delle colonne: ");
    scanf("%d", &c);

    int matf[l][c];

    /* inserimento dati nella matrice */
    for(j=1;j<=l;j++) {
        for (k=1;k<=c;k++) {
            printf("\nInserisci il valore per la matrice a posizione matf(%d,%d): ", j, k);
            scanf("%d", &matf[j][k]);
        }
    }

    /* stampa della matrice inserita */
    printf("\nHai inserito la matrice:\n");
    for(j=1;j<=l;j++) {
        for (k=1;k<=c;k++) {
            printf("\t(%d,%d)=%d",j, k, matf[j][k]);
        }
        printf("\n");
    }

    return 0;
}
