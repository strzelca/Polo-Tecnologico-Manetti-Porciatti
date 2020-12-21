#include <stdio.h>
struct s_libreria
{
	char titolo[30];
	char autore[30];
	char editore[30];
	float prezzo;
	float prezzofin;
	int giorno;
	int mese;
	int anno;
	float peso;
} s_libreria;

int main()
{
	int n,i,per;
	printf("Inserire numero libri da registrare: ");
	scanf("%d", &n);
	printf("\nInserire percentuale: ");
	scanf("%d", &per);
	struct s_libreria libreria[n];
	for(i=0;i<n;i++)
	{
		printf("\nInserire titolo libro %d: ",i+1);
		scanf("%s", libreria[i].titolo);
		
		printf("\nInserire autore libro %d: ",i+1);
		scanf("%s", libreria[i].autore);
		
		printf("\nInserire casa editrice libro %d: ",i+1);
		scanf("%s", libreria[i].editore);
		
		printf("\nInserire prezzo libro %d: ",i+1);
		scanf(" %f", &libreria[i].prezzo);
		
		printf("\nInserire giorno di uscita del libro %d: ",i+1);
		scanf(" %d", &libreria[i].giorno);
		
		printf("\nInserire mese di uscita del libro %d: ",i+1);
		scanf(" %d", &libreria[i].mese);
		
		printf("\nInserire anno di uscita del libro %d: ",i+1);
		scanf(" %d", &libreria[i].anno);
		
		printf("\nInserire peso libro %d: ",i+1);
		scanf(" %f", &libreria[i].peso);
	}
	for(i=0;i<n;i++)
	{
		printf("\n\nLibro numero %d",i+1);
		printf("\nTitolo: %s", libreria[i].titolo);
		printf("\nAutore: %s", libreria[i].autore);
		printf("\nCasa editrice %s", libreria[i].editore);
		printf("\nPrezzo: %0.2f", libreria[i].prezzo);
		libreria[i].prezzofin=libreria[i].prezzo+(libreria[i].prezzo/100)*20;
		printf("\nPrezzo vendita: %0.2f", libreria[i].prezzofin);
		printf("\nData di uscita: %d/%d/%d",libreria[i].giorno, libreria[i].mese, libreria[i].anno);
		printf("\nPeso: %0.2f", libreria[i].peso);
		}
	return 0;
}
