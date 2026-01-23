#include <stdio.h>

int main() {
	int num;
	
	printf("Inserisci un numero: ");
	scanf("%d", &num);
	
	if (num % 2 == 0) {
		printf("\nNumero pari!\n");
	}
	else {
		printf("\nNumero dispari!\n");
	}
	
	return 0;
}
