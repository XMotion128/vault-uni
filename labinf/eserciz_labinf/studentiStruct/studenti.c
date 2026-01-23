#include <stdio.h>
#define NUM_STUDENTI 50

typedef struct {
	char nome[50];
	char cognome[50];
	int matricola;
	float punteggio_medio;
} Studente;

int main() {
	char* nomi[] = {"Luca", "Marco", "Giulia", "Sara", "Andrea", "Paolo", "Elena", "Francesco", "Matteo", "Anna"};
    char* cognomi[] = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli", "Marroni", "Bianchi", "Ferrari", "Conti", "Esposito"};
	Studente registro[NUM_STUDENTI];

    srand(time(NULL));

    // Riempimento del registro con i dati degli studenti
    for (int i = 0; i < NUM_STUDENTI; i++) {
        int nome_index = rand() % 10;
        int cognome_index = rand() % 10;

        sprintf(registro[i].nome, "%s", nomi[nome_index]);
        sprintf(registro[i].cognome, "%s", cognomi[cognome_index]);
        
        // Genera una matricola casuale
        registro[i].matricola = rand() % 900000 + 100000;
        
        // Genera un punteggio medio casuale tra 18 e 30
        registro[i].punteggio_medio = (rand() % 1201 + 1800) / 100.0;
    }

    printf("Registro Studenti:\n");
    for (int i = 0; i < NUM_STUDENTI; i++) {
        printf("Matricola: %d, Nome: %s, Cognome: %s, Punteggio Medio: %.2f\n",
        registro[i].matricola, registro[i].nome, registro[i].cognome, registro[i].punteggio_medio);
    }

    return 0;
}
