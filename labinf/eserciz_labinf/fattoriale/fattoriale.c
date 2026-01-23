#include <stdio.h>

int main() {
	float num, fact = 1;
	
	printf("Inserisci il numero di cui calcolare il fattoriale: ");
	scanf("%f", &num);
	
	for (int i = 1; i <= num; i++) {
		fact *= i;
	}
	
	printf("Fattoriale: %f", fact);
	
	return 0;
}
