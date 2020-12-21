#include <stdio.h>
#include <string.h>

struct Alunno{
		char  nome    [20];
		char  cognome [20];
		int   nascita;
		char  classe  [3];
}	Alunno;

int main () {	
	int size 			 = 0,
         i    	 = 0;
	char classe[3] = { ' ' };

	printf("\ninserisci dimensione: ");
	scanf("%d", &size);

	printf("\nInserisci classe: ");
	scanf("%s", classe);

  struct Alunno alunni[size];

	for(i=0; i<size; ++i){
		printf("\ninserisci nome alunno %d: ", i+1);
		scanf("%s", alunni[i].nome);
		
		printf("\ninserisci cognome alunno %d: ", i+1);
		scanf("%s", alunni[i].cognome);
		
		printf("\ninserisci anno di nascita alunno %d: ", i+1);
		scanf("%d", &alunni[i].nascita);
		
		printf("\ninserisci classe alunno %d: ", i+1);
		scanf("%s", alunni[i].classe);
	}
	
	
	for(i=0; i<size; i++){
		if(strcmp(alunni[i].classe, classe) == 0){
			printf("\n\nAlunno %d:", i+1);
			printf("\n\t- nome:           \t%s", alunni[i].nome);
			printf("\n\t- cognome         \t%s", alunni[i].cognome);
			printf("\n\t- anno di nascita:\t%d", alunni[i].nascita);
			printf("\n\t- classe:         \t%s\n", alunni[i].classe);
		}
	}

  return 0;
}
