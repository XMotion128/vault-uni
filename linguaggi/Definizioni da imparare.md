**Grammatica**: *complesso di regole* necessarie alla costruzione di *frasi, sintagmi e parole* di un determinato linguaggio.
**Correttezza** (**sintattica**): una stringa è *corretta* se *può essere generata* (*derivata*) applicando le *regole della grammatica*. 
**Derivazione**: il processo di *generazione* di una *frase* usando la *grammatica*.
**Linguaggio formale**: insieme di *tutte le stringhe* che possono essere *derivate* dalle *regole della grammatica*, <u>a prescindere dal significato</u>.

**Alfabeto**: un insieme $X$ *finito* e *non vuoto* di simboli.
**Parola**: sequenza **finita** $x_1 x_2...x_n$ , dove ogni $x_i$ è preso da uno *stesso alfabeto* $X$. Si ottiene *concatenando* o *giustapponendo* simboli dello stesso alfabeto.
**$X^*$**: l'insieme di *tutte le stringhe* di lunghezza finita sull'alfabeto $X$ (comprende $\lambda$). Ha un numero di elementi che è un *infinito numerabile* (cioè è possibile *elencarli*).
**Concatenazione**:  sia $\alpha \in X^*$ una stringa di lunghezza $m$ e $\beta \in X^*$ una stringa di lunghezza $n$, la concatenazione di $\alpha$ e $\beta$, denotata con $\alpha\beta$ o $\alpha\cdot\beta$, è definita come la stringa di lunghezza $m + n$, i cui primi $m$ simboli costituiscono una *stringa uguale* a $\alpha$ ed i cui ultimi $n$ simboli costituiscono una _stringa uguale_ a $\beta$. La concatenazione è un'_operazione binaria_ su $X^*$:
$$\cdot: X^* \times X^* \rightarrow X^*$$
**Prefisso, suffisso**: se $\gamma \in X^*$ è della forma $$\gamma = \alpha\beta$$ove $\alpha, \beta \in X^*$, allora $\alpha$ è *prefisso* di $\gamma$ e $\beta$ è *suffisso* di $\gamma$.
**Sottostringa**: se $\delta,\beta \in X^*$ e $\delta$ è della forma $$\delta = \alpha\beta\gamma$$ove $\alpha, \beta \in X^*$ allora $\beta$ è una *sottostringa* di $\delta$.
**Potenza di una stringa**: Data una stringa $\alpha$ su $X$, la *potenza h-esima* di $\alpha$ è definita (induttivamente) come segue:
$$
\alpha^h =
\begin{cases}
\lambda &\text{se h = 0} \\\\
\alpha\alpha^h-1 &\text{altrimenti}
\end{cases}
$$
è un tipo speciale di concatenazione, poiché è ottenuta concatenando la stringa $h$ volte con se stessa.
**Potenza di un alfabeto**: definizione ricorsiva:
$$
X^h = 
\begin{cases}
\{\lambda\} &\text{se h = 0} \\\\
X \cdot X^{h-1} &\text{altrimenti}
\end{cases}
$$
$X^k$ indica l'insieme di tutte le stringhe di lunghezza $k$. Unendo tutti i possibili $X^k$, con $k > 0$ ottengo un nuovo insieme $X^+$:
$$
X^+ = \bigcup_{i=1}^{+\infty} X^i
$$
 ovvero l'insieme di **tutte le stringhe di lunghezza maggiore di 0** costruibili a partire dall'alfabeto $X$, (quindi escludendo $\lambda$).
Dato $X^+$ possiamo ricavare anche $X^*$:
$$
X^* = \{\lambda\} \cup X^*
$$

**Linguaggio formale**: un linguaggio formale $L$ su un alfabeto $X$ è un sottoinsieme di $X^*$:
$$
L \subseteq X^*
$$
Un linguaggio $L$ infatti è l'insieme di stringhe di lunghezza arbitraria *ben costruiti sintatticamente* (che rispettano le regole di una grammatica $G$).
