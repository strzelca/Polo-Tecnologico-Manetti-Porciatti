#include <stdio.h>

int main(int argc, char **argv)
{
  int SIZE, i;
  printf("Inserire dimensione del vettore: ");
  scanf("%d", &SIZE);
  
  int arr[SIZE], sum = 0;

  for (i = 1; i <= SIZE; ++i) 
  {
    printf("\nInserirsci il valore %d dell\'array: ", i);
    scanf("%d", &arr[i]);
  }

  for (i = 1; i <= SIZE; ++i)
    if (i % 2 == 0) sum+=arr[i];

  printf("\nLa somma dei valori in posizioni pari e\' %d\n\n", sum);

  return 0;
}
