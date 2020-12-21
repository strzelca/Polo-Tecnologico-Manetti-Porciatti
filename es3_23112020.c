#include <stdio.h>

int main() {
  int DIM1, DIM2;

  printf("\nInserisci dimensione del vet1: ");
  scanf("%d", &DIM1);

  printf("\nInserisci dimensione del vet2: ");
  scanf("%d", &DIM2);

  int i;
  int vet1[DIM1], vet2[DIM2];

  for (i = 0; i < DIM1; ++i){
    printf("\nInserisci vet1(%d) ", i);
    scanf("%d", &vet1[i]);
  }

  for (i = 0; i < DIM2; ++i){
    printf("\nInserisci vet2(%i): ", i);
    scanf("%d", &vet2[i]);
  }

  int vet3[DIM1+DIM2];

  for (i = 0; i < DIM1; ++i){
    vet3[i] = vet1[i];
  }

  for (i = DIM1; i < DIM1+DIM2; ++i){
    vet3[i] = vet2[i-DIM1];
  }

  for (i = 0; i < DIM1+DIM2; ++i) {
    printf("\nVet3(%d) =  %d", i+1, vet3[i]);
  }

  printf("\n\n");
  getchar();

  return 0;
}
