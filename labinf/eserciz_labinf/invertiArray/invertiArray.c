#include <stdio.h>
#include <stdlib.h>

// invertire un array inserito tramite input con i puntatori

void printArray(int* arr_ptr, int length);
void inverti(int* v, int N);

int main() {
	int* arr = NULL;
	int length = 0;
	
	printf("Inserisci quanti numeri salvare nel vettore: ");
	scanf("%d", &length);
	
	arr = (int*) malloc(length * sizeof(int));
	
	for (int i = 0; i < length; i++) {
		scanf("%d", (arr + i));
	}
	
	printArray(arr, length);
	inverti(arr, length);
	printArray(arr, length);
		
	free(arr);
	return 0;
}

void printArray(int* arr_ptr, int length) {
	for (int i = 0; i < length; i++) {
		printf("%d ", *(arr_ptr + i));
	}
	printf("\n");
}

void inverti(int* v, int N) {
	int* s_ptr = v;
	int* d_ptr = (v + N - 1);
	int temp = 0;
	
	for (int i = 0; i < N / 2; i++) {
		temp = *s_ptr;
        *s_ptr= *d_ptr;
        *d_ptr = temp;
        
		s_ptr++;
		d_ptr--;
	}
}
