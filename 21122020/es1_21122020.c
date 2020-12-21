#include <stdio.h>

#define SIZE 30

void clrbf() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

struct Libro {

  char   titolo[SIZE];
  char   autore[SIZE];
  char   casa[SIZE];
  float  prezzo;
  int    percentuale;
  float  prezzo_f;
  int    anno;
  float  peso;

} Libro;

int main(int argc, char **argv) {

  int size = 0, 
      i = 0;

  printf("\nInserisci il numero di Libri: ");
  scanf("%d", &size);

  struct Libro libri[size];

  for (i = 0; i < size; ++i) {
    clrbf(); // Clear buffer (per usare correttamente fgets)
    printf("\nInserire titolo libro %d: ", i+1);
    fgets(libri[i].titolo, SIZE, stdin);

    printf("\nInserire autore libro %d: ", i+1);
    fgets(libri[i].autore, SIZE, stdin);

    printf("\nInserire casa editrice libro %d: ", i+1);
    fgets(libri[i].casa, SIZE, stdin);

    printf("\nInserire prezzo libro %d: ", i+1);
    scanf(" %f", &(libri[i].prezzo));

    printf("\nInserire percentuale aggiunta al prezzo finale al libro %d%s: ", i+1, 
           "\n(senza inserire il simbolo \%)");
    scanf(" %d", &(libri[i].percentuale));

    printf("\nInserire anno libro %d: ", i+1);
    scanf(" %d", &(libri[i].anno));

    printf("\nInserire peso del libro (in g) %d: ", i+1);
    scanf(" %f", &(libri[i].peso));

    libri[i].prezzo_f = (float) libri[i].prezzo + (libri[i].prezzo * ((float) libri[i].percentuale/100));
  }
  
  for (i = 0; i < size; ++i) {
    printf("\n\nLibro %d", i+1);
    printf("\n\t|-Titolo: %s", libri[i].titolo);
    printf("\t|-Autore: %s", libri[i].autore);
    printf("\t|-Casa: %s", libri[i].casa);
    printf("\t|-Prezzo: %.2fE", libri[i].prezzo);
    printf("\n\t|-Prezzo finale (+%d%c): %.2fE", libri[i].percentuale, '%', libri[i].prezzo_f);
    printf("\n\t|-Anno: %d", libri[i].anno);
    printf("\n\t|-Peso: %.2fg", libri[i].peso);
  }

  puts("\n");

  return 0;
}
