**Grammatica**: *complesso di regole* necessarie alla costruzione di *frasi, sintagmi e parole* di un determinato linguaggio.
**Correttezza** (**sintattica**): una stringa è *corretta* se *può essere generata* (*derivata*) applicando le *regole della grammatica*. 
**Derivazione**: il processo di *generazione* di una *frase* usando la *grammatica*.
**Linguaggio formale**: insieme di *tutte le stringhe* che possono essere *derivate* dalle *regole della grammatica*, <u>a prescindere dal significato</u>.

**Alfabeto**: un insieme $X$ *finito* e *non vuoto* di simboli.
**Parola**: sequenza **finita** $x_1 x_2...x_n$ , dove ogni $x_i$ è preso da uno *stesso alfabeto* $X$. Si ottiene *concatenando* o *giustapponendo* simboli dello stesso alfabeto.
**$X^*$**: l'insieme di *tutte le stringhe* di lunghezza finita sull'alfabeto $X$ (comprende $\lambda$). Ha un numero di elementi che è un *infinito numerabile* (cioè è possibile *elencarli*).
**Concatenazione**:  sia $\alpha \in X^*$ una stringa di lunghezza $m$ e $\beta \in X^*$ una stringa di lunghezza $n$, la concatenazione di $\alpha$ e $\beta$, denotata con $\alpha\beta$ o $\alpha\cdot\beta$, è definita come la stringa di lunghezza $m + n$, i cui primi $m$ simboli costituiscono una stringa uguale a $\alpha$ ed i cui ultimi $n$ simboli costituiscono una stringa uguale a $\beta$. La concatenazione è un'operazione binaria su $X^*$:
$$\cdot: X^* \times X^* \rightarrow X^*$$
**Prefisso, suffisso**: se $\gamma \in X^*$ è della forma $\gamma = \alpha\beta$, ove $\alpha, \beta \in X^*$, allora $\alpha$ è prefisso di $\gamma$ e $\beta$ è suffisso di $\gamma$.