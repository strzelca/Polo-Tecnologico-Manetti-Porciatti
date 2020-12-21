#include <stdio.h>

int main(int argc, char **argv) 
{
  int SIZE, i;

  printf("\nInserire dimensione del vettore: ");
  scanf("%d", &SIZE);

  int arr[SIZE], arr_pari[SIZE];

  for (i = 0; i < SIZE; ++i) 
  {
    printf("\nInserisci il valore %d del vettore: ", i+1);
    scanf("%d", &arr[i]);
    if (arr[i] % 2 == 0) arr_pari[i] = arr[i];
    else arr_pari[i] = NULL;
  }

  printf("\npos -- arr -- arr_pari");
  for (i = 0; i < SIZE; ++i)
  {
    if (arr_pari[i] != NULL) printf("\n%d  ->   %d\t %d", i, arr[i], arr_pari[i]);
    else printf("\n%d  ->   %d", i, arr[i]);
  }

  printf("\n\n");

  return 0;
}
