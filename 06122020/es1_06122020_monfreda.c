#include <stdio.h>
#include <stdbool.h>

struct alunno 
{
    char cognome[20];
    char nome[20];
    int classe;
    char sezione;
    char sesso;
    bool ripetente;
    float mediaVoti;

};

int main()
{

  int n, i;
  char temp;

  printf("\nInserisci numero Alunni: ");
  scanf("%d", &n);

  struct alunno alunno[n]; 

  for(i = 0; i < n; i++) 
  {
    printf("\nInserisci cognome Alunno: ");
    scanf("%s", alunno[i].cognome);

    printf("\nInserisci nome Alunno: ");
    scanf("%s", alunno[i].nome);

    printf("\nInserisci classe Alunno: ");
    scanf("%d", &alunno[i].classe);

    printf("\nInserisci sezione Alunno: ");
    scanf(" %c", &alunno[i].sezione);

    printf("\nInserisci sesso Alunno: ");
    scanf(" %c", &alunno[i].sesso);

    while(1) 
    {
    printf("\nRipetente Si/No: ");
    scanf(" %c", &temp);
      if(temp == 'S' || temp == 's') 
      {
        alunno[i].ripetente = true;
        break;
      }
      else if (temp == 'N' || temp == 'n') 
      {
        alunno[i].ripetente = false;
        break;
      }
      else
      {
        printf("\nNon hai inserito Si o No");
      }
    }
    getchar();

    printf("\nInserisci media Alunno: ");
    scanf("%f", &alunno[i].mediaVoti);
  }

  for (i = 0; i < n; i++) 
  {
    printf("\nAlunno %d\n", i+1);
    printf("\nNome e cognome: %s %s", alunno[i].nome, alunno[i].cognome);
    printf("\nClasse: %d", alunno[i].classe);
    printf("\nSezione: %c", alunno[i].sezione);
    printf("\nSesso: %c", alunno[i].sesso);
    printf("\nRimandato: ");
    if (alunno[i].ripetente == true) 
    {
      printf("Si");
    } else 
    {
      printf("No");
    }
    printf("\nMedia: %f\n", alunno[i].mediaVoti);
  }

  return 0;
}
