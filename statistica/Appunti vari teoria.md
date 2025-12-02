# Combinatoria
- *Combinazioni*:$$C^m_n = \binom{m}{n} = \frac{m!}{n! (m - n)!}$$Utile per: estrazioni **SENZA** ripetizione, **NO** ordine.

- *Disposizioni semplici (senza ripetizione):* $$D^m_n = \frac{m!}{(m - n)!}$$Utile per: estrazioni **SENZA** ripetizione, **CON** ordine.

- *Disposizioni con ripetizione:* $$m^n$$Utile per: estrazioni **CON** ripetizione, **CON** ordine.
- *Permutazioni*:$$m!$$Utile per: estrazioni **SENZA** ripetizione, **CON** ordine.

# Probabilità
- *Definizione classica di probabilità:*$$P(E) = \frac{|E|}{|\Omega|}$$Dove $E$ sono gli **eventi favorevoli**, $\Omega$ è lo spazio dei campioni (**tutti gli eventi possibili**). Questa definizione è utilizzabile nel caso in cui gli **eventi elementari sono equiprobabili** e $\Omega$ ha **cardinalità finita**.

- *Probabilità condizionale di $A$ da in $B$*$$P(A | B) = \frac{P(A \cap B)}{P(B)}$$Restituisce la **probabilità** di $A$ quando sappiamo che $B$ si è **verificato**. È come se $B$ diventasse spazio dei campioni.

- *Formula delle probabilità totali:* siano $A, B_1, ..., B_n \in \mathcal{F}$ t.c. i vari $B$ sono a 2-2 disgiunti, allora$$P(A) = \sum_{i = 1}^n P(A | B_i) P(B_i)$$Utile per **calcolare le probabilità di un evento** ($A$) sapendo che **esistono diversi scenari** ($B_i$) in cui esso può accadere.
- *Teorema di Bayes:* nelle stesse ipotesi precedenti$$P(B_i | A) = \frac{P(A | B_i) P(B_i)}{\sum_{i = 1}^n P(A | B_i) P(B_i)}$$O, nel caso di una sola ipotesi:$$P(B|A) = \frac{P(A|B) P(B)}{P(A)}$$
Utile a calcolare le **probabilità di una causa**, **sapendo l'effetto**.


## Indicazioni operative varie
1) Se hai un esercizio in cui sai che hai a che fare con probabilità condizionata, guarda il tipo di esercizio:
	- se **costruisci un evento passo passo** (es: pesco una cosa, POI pesco un'altra) allora usare una formula del tipo $P(A) \cdot P(B|A)$ dove $P(B|A)$ la si intuisce al volo;
	- se possiedi i dati già in principio e devi solo **filtrare una cosa specifica**, allora usa la formula della divisione $\frac{P(A\cap B)}{P(B)}$.
2) Fai molta attenzione alla traccia, **non cascare in errori dovuti alla comprensione** sbagliata. Es:
	- "Qual è la probabilità che la 5ª chiave sia quella giusta?"
	- "Ho già provato 4 chiavi e non andavano. Qual è la probabilità che la 5ª sia giusta?"
	sono domande diverse, quindi soluzioni diverse.



# Variabili aleatorie
Associano ad ogni evento un numero reale ($E \in \Omega \rightarrow x \in \mathbb{R}$). Possono essere **discrete** (quando la $x$ può assumere un insieme finito e numerabile di valori tale che$\sum_{i=1}^n P_i = 1$) o **continue** (quando le probabilità si esprimono in termini di area).

Alle variabili aleatorie *discrete* si associa:
- una **funzione di probabilità** $P(x_i)$: restituisce la probabilità per una $x_i$);
- **funzione di ripartizione** (o accumulazione) $F(x_i)$: somma tutte le varie probabilità fino ad ottenere 1.

Alle variabili aleatorie *continue* si associa:
- una **funzione di probabilità** $P(x_i)$;
- una **funzione di densità di probabilità** $f(x)$: equivalente della funzione di accumulazione;

Esempi di v.a. discrete: *Bernoulli, binomiale, geometrica*;
Esempi di v.a. continue: *Normale, t-Student, Chi-quadro, Uniforme, Fisher*.

## V.A. di Bernoulli
Utile per casi di tipo successo-insuccesso (S-I).
$$
X = \begin{cases}
1 \text{ se ho S} \\
0 \text{ se ho I}
\end{cases} \ \ \ \ \ \
cod(X) = \{0, 1\}$$
dove:
- $P(X = 1) = p$
- $P(X = 0) = 1 - p$

si scrive $X \sim b(1, p)$ e si dice *v.a. di Bernoulli con parametro* $p$.

## V.A. binomiale
Utile per i casi di ripetizioni (indipendenti) di esperimenti di tipo S-I dove la probabilità di S è pari e $p \in (0, 1)$. Voglio determinare la v.a. $X$ che conta il numero di S nelle $n$ prove, pertanto $cod(X) = \{0, 1,..., n\}$. Se $k = 0, ..., n$ $P(X = k)$ è la probabilità che ci siano esattamente $k$ successi, quindi:
$$
P(X = k) = \binom{n}{k} p^k (1-p)^{n - k}
$$
si scrive $X = b(n, p)$ e si dice *v.a. a legge binomiale di parametri* $n, p$.