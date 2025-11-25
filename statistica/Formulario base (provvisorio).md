# Combinatoria
- *Combinazioni*:$$C^m_n = \binom{m}{n} = \frac{m!}{n! (m - n)}$$Utile per: estrazioni **SENZA** ripetizione, **NO** ordine.

- *Disposizioni semplici (senza ripetizione):* $$D^m_n = \frac{m!}{n! (m - n)!}$$Utile per: estrazioni **SENZA** ripetizione, **CON** ordine.

- *Disposizioni con ripetizione:* $$m^n$$Utile per: estrazioni **CON** ripetizione, **CON** ordine.

# Probabilità
- *Definizione classica di probabilità:*$$P(E) = \frac{|E|}{|\Omega|}$$Dove $E$ sono gli **eventi favorevoli**, $\Omega$ è lo spazio dei campioni (**tutti gli eventi possibili**). Questa definizione è utilizzabile nel caso in cui gli **eventi elementari sono equiprobabili** e $\Omega$ ha **cardinalità finita**.

- *Probabilità condizionale di $A$ da in $B$*$$P(A | B) = \frac{P(A \cap B)}{P(B)}$$Restituisce la **probabilità** di $A$ quando sappiamo che $B$ si è **verificato**. È come se $B$ diventasse spazio dei campioni.

- *Formula delle probabilità totali:* siano $A, B_1, ..., B_n \in \mathcal{F}$ t.c. i vari $B$ sono a 2-2 disgiunti, allora$$P(A) = \sum_{i = 1}^n P(A | B_i) P(B_i)$$Utile per **calcolare le probabilità di un evento** ($A$) sapendo che **esistono diversi scenari** ($B_i$) in cui esso può accadere.
- *Teorema di Bayes:* nelle stesse ipotesi precedenti$$P(B_i | A) = \frac{P(A | B_i) P(B_i)}{\sum_{i = 1}^n P(A | B_i) P(B_i)}$$Utile a calcolare le **probabilità di una causa**, **sapendo l'effetto**.


# Indicazioni operative varie
1) Se hai un esercizio in cui sai che hai a che fare con probabilità condizionata, guarda il tipo di esercizio:
	- se costruisci un evento passo passo (es: pesco una cosa, POI pesco un'altra) allora usare una formula del tipo $P(A) \cdot P(B|A)$ dove $P(B|A)$ la si intuisce al volo;
	- se possiedi i dati già in principio e devi solo filtrare una cosa specifica, allora usa la formula della divisione $\frac{P(A\cap B)}{P(B)}$.