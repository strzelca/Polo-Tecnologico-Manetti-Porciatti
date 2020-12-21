#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define M_SIZE_STR 40

struct Materia 
{

  char nome[M_SIZE_STR];
  float voti[3];
  float media;
  struct Materia *ptr_next;

} Materia;

struct Alunni 
{

  char nome[M_SIZE_STR];
  struct Materia mat;
  struct Alunni *ptr_next;

} Alunni;

char *check(float *voti, int size);

int main(int argc, char **argv) 
{

  struct Alunni al;
  struct Alunni *cur = &al;
  struct Materia *mat = &(cur->mat);
  int n_al, i, m;

  cur->ptr_next = NULL;
  cur->mat.ptr_next = NULL;

  printf("\nInserisci alunni: ");
  scanf("%d", &n_al); getchar();

  for (i = 0; i < n_al; ++i) 
  {
    printf("\nInserisci nome: ");
    fgets(cur->nome, M_SIZE_STR, stdin);
    cur->ptr_next = (struct Alunni*) malloc(sizeof(struct Alunni));
    cur = cur->ptr_next;
    cur->ptr_next = NULL;
  }

  cur = &al;

  printf("\n\nInserisci i voti\n\n");

  while (cur->ptr_next != NULL) 
  {
     while(1) 
     {
      mat->media=0;
      printf("\n\nInserisci il nome di una materia di cui definire i voti per l\'alunno %s\n%s",
            cur->nome,
           "(lasciare vuoto per terminare l'inserimento): ");

      fgets(mat->nome, M_SIZE_STR, stdin);

      if (mat->nome[0] == '\n' || mat->nome[0] == '\0') 
      {
        mat->ptr_next = NULL;
        break; 
      }

      printf("\n[1] Inserisci voti scritto, %s %s %s",
               "[2] orale,",
               "[3] laboratorio dell'alunno\n",cur->nome);

      for (m = 0; m < 3; ++m) 
      {
        printf("\n[%d] ", m+1);
        scanf("%f", &(mat->voti[m]));
        mat->media+=mat->voti[m];
      } getchar();

      mat->media/=3;
      mat->ptr_next = (struct Materia*) malloc(sizeof(struct Materia));
      mat = mat->ptr_next;
    }
    cur = cur->ptr_next;
    mat = &(cur->mat);
  }

  cur = &al;
  mat = &(cur->mat);

  printf("\n\n------------------\n\n");

  while(cur->ptr_next != NULL) 
  {
    printf("\n\nAlunno: %s", cur->nome);
    while (mat->ptr_next != NULL) 
    {
      printf("\n\nMateria: %s", mat->nome);
      for (m = 0; m < 3; ++m) 
      {
        printf("\n[%d] %.1f ", m+1, mat->voti[m]);
      }
      printf("\nMedia: %.1f ", mat->media);
      printf("\nGiudizio Finale: %s", check(mat->voti, 3));
      mat = mat->ptr_next; 
    }  
    cur = cur->ptr_next;
    mat = &(cur->mat);
  }

  printf("\n\n");

  return 0;
}

char *check(float *voti, int size)
{
  int i, t = 0;
  for (i = 0; i < size; ++i) 
    if (voti[i] > 5) t+=1;
  if (t == size) return "[Promosso]";
  else return "[Rimandato]";
}
