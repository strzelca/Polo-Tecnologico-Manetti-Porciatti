#include <stdio.h>

int *join(int *arr1, int *arr2, int S1, int S2);

int main(int argc, char **argv)
{
  int SIZE_1, SIZE_2;

  printf("\nInserisci la dimensione del vettore 1: ");
  scanf("%d", &SIZE_1);

  printf("\nInserisci la dimensione del vettore 2: ");
  scanf("%d", &SIZE_2);

  int arr1[SIZE_1], arr2[SIZE_2];
  int i;

  for (i = 0; i < SIZE_1; ++i)
  {
    printf("\nInserisci valore %d nel vettore 1: ", i);
    scanf("%d", &arr1[i]);
  }

  for (i = 0; i < SIZE_2; ++i)
  {
    printf("\nInserisci valore %d nel vettore 2: ", i);
    scanf("%d", &arr2[i]);
  }

  int *arr3 = join(arr1, arr2, SIZE_1, SIZE_2);

  printf("\narr3 = [");
  for (i = 0; i < SIZE_1+SIZE_2; ++i) 
    printf(" %d", arr3[i]);
  
  printf(" ]\n\n");

}

int *join(int *arr1, int *arr2, int S1, int S2)
{ 
  int res[S1+S2];
  int i;

  for (i = 0; i < S1; ++i) res[i] = arr1[i];

  for (i = S1; i < S1+S2; ++i) res[i] = arr2[i-S1];
 
  return res;
}

