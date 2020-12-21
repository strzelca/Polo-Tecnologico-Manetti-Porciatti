#include <stdio.h>

#define M_SIZE 20

#define true 1
#define false 0
typedef char bool_t;

#define clrbf() getchar();

/*
 *
 * Niccolò Martiri
 * 3AIA
 * 06 Dicembre 2020
 * 
 * Esercitazione record e tabelle
 *
 */

struct Alunno {

    char        cognome[M_SIZE];
    char        nome[M_SIZE];
    int         classe;
    char        sezione;
    char        sesso;
    bool_t      ripetente;
    float       mediaVoti;

} alunno;

int main(int argc, char **argv) {

  int size, tmp;

  printf("\nInserisci numero Alunni: ");
  scanf("%d", &size);

  struct Alunno alunno[size]; 

  for(int i = 0; i < size; ++i) {

    // Inserisci cognome
    printf("\nInserisci cognome Alunno: ");
    scanf("%s", alunno[i].cognome);

    // Inserisci nome
    printf("\nInserisci nome Alunno: ");
    scanf("%s", alunno[i].nome);

    // Inserisci classe
    printf("\nInserisci classe Alunno %s %s: ",
           alunno[i].nome,
           alunno[i].cognome);
    scanf("%d", &alunno[i].classe);

    // Inserisci sezione
    printf("\nInserisci sezione Alunno %s %s: ",
           alunno[i].nome,
           alunno[i].cognome);
    scanf(" %c", &alunno[i].sezione);

    // Inserisci sesso
    printf("\nInserisci sesso Alunno %s %s: ",
           alunno[i].nome,
           alunno[i].cognome);
    scanf(" %c", &alunno[i].sesso);

    clrbf();

    for(;;) {
    printf("\nE' ripetente? (S/N): ");
      if((tmp=getchar()) == 'S') {
        alunno[i].ripetente = true;
        break;
      }
      else if (tmp == 'N') {
        alunno[i].ripetente = false;
        break;
      }
      else{
        printf("\nNon hai inserito S o N");
      }
    }

    // Inserisci media
    printf("\nInserisci media Alunno %s %s: ",
           alunno[i].nome,
           alunno[i].cognome);
    scanf("%f", &alunno[i].mediaVoti);
  }

  for (int i = 0; i < size; ++i) {
    printf("\n\nAlunno %d\n", i+1);
    printf("\nNome: %s %s", alunno[i].nome, 
                            alunno[i].cognome);
    printf("\nClasse: %d%c", alunno[i].classe,
                             alunno[i].sezione);
    printf("\nSesso: %c", alunno[i].sesso);
    printf("\nRimandata/o: %s\n\t|-Media: %f\n",
           alunno[i].ripetente ? "Si" : "No", 
           alunno[i].mediaVoti);
  }

  return 0;
}
