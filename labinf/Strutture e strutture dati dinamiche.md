Una **struttura** è una collezione di variabili, _semanticamente collegate_, aggregate _sotto un unico nome_.
Esse, a differenza degli array, sono **eterogenee**, possono cioè contenere dati di natura diversa.
Si tratta di tipi di dato **derivati**, cioè composte da altri tipi.
Utilizzando struct e gestione dinamica della memoria possiamo implementare le **strutture dati dinamiche**, la cui dimensione può cambiare durante l'esecuzione del programma.
## Liste concatenate
Una **sequenza di nodi** collegati fra loro, _non necessariamente_ contigui in memoria, caratterizzato da:
- dati (di qualunque tipo);
- un puntatore al nodo successivo.
Una lista concatenata inizia con un nodo principale (la "testa") e termina con un nodo che punta a **NULL**, indicando la fine. Lo scorrimento all'interno di una lista concatenata è **sequenziale**.
### Definizione di un nodo:
``` C
typedef struct Node {
	int data;
	struct Node* next;
} Node;
```
**Nota**: una struttura non può contenere un'istanza di sé stessa; Tuttavia, può contenere un puntatore a una variabile del suo stesso tipo.
## Pila
Possiamo, attraverso le liste concatenate, implementare altre strutture dati dinamiche, come la **pila**.
Una pila è una struttura **LIFO** (**Last In**, **First Out**), cioè che l'_ultimo elemento inserito_ è anche _il primo a essere rimosso_.
Possiamo svolgere due tipi di operazioni:
- Push (aggiunta di un nodo);
- Pop (rimozione di un nodo).
