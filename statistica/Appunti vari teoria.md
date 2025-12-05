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
# V.A. Discrete
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

- $E(X) = p$
- $V(X) = p(1-p)$

## V.A. binomiale
Utile per i casi di ripetizioni (indipendenti) di esperimenti di tipo S-I dove la probabilità di S è pari e $p \in (0, 1)$. Voglio determinare la v.a. $X$ che **conta il numero di S nelle $n$ prove**, pertanto $cod(X) = \{0, 1,..., n\}$. Se $k = 0, ..., n$ $P(X = k)$ è la **probabilità che ci siano esattamente $k$ successi**, quindi:
$$
P(X = k) = \binom{n}{k} p^k (1-p)^{n - k}
$$
si scrive $X = b(n, p)$ e si dice *v.a. a legge binomiale di parametri* $n, p$.

- $E(X) = np$
- $V(X) = np(1-p)$

## V.A. Geometrica
Utile per casi di ripetizioni (indipendenti) di esperimenti di tipo S-I per un numero imprecisato di volte, dove $p \in (0, 1)$ è la probabilità di S in ogni singola prova, e vogliamo sapere quale v.a. $X$ descrive le **probabilità di primo successo**. Se $k = 1, 2, ...$ $P(X = k)$ è la probabilità che il primo successo si verifichi esattamente alla $k$-esima prova, pertanto $cod(X) = \{1,2,3,...\}$.
$$
P(X = k) = p (1-p)^{k - 1}, \ \ \ k\geq 1
$$
si scrive $X \sim geo(p)$ e si dice *v.a. geometrica di parametro* $p$.

- $E(X) = \frac{1}{p}$
- $V(X) = \frac{1-p}{p^2}$

## V.A. Poisson
Una v.a. si dice che ha **legge di Poisson di parametro** $\lambda$ ($\lambda > 0$), e si scrive $X \sim P(\lambda)$ se:
- $cod(X) = \mathbb{N} \cup \{0\} = \{0,1,2,...\}$;
- $P(X=k) = e^{-\lambda} \frac{\lambda^k}{k!}, k \geq 0$.

Questa v.a. è **associabile alla binomiale** se, data $X \sim b(n,p)$ **con $n$ "grande" e $p$ piccola** t.c. $np = \lambda$, allora $X$ si può approssimare con una Poisson di parametro $\lambda$ ($X \approx P(\lambda), \lambda = np$). Utile per **semplificare i calcoli**.

- $E(X) = \lambda$
- $V(X) = \lambda$

# V.A. Continue
## V.A. Uniforme
Siano $a, b \in \mathbb{R}, a < b$. Si dice che una v.a. $X$ ha *legge uniforme di parametri $a, b$* e si scrive $X \sim U(a, b)$ se $X$ è assolutamente continua e con funzione di densità di probabilità ($pdf$):
$$
f_X(x) := \begin{cases}
\frac{1}{b-a} \ \ a \leq x \leq b \\
0 \text{ altrimenti}
\end{cases}
$$
Essa ha funzione di distribuzione ($FdD$):
$$
F_X(x) = \int^x_{-\infty} f_X(t) dt = \begin{cases}
0 \ \ \text{se }x < a \\
\frac{x-a}{b-a} \ \ \text{se } a \leq x \leq b \\
1 \ \ \text{se }x > b
\end{cases}
$$

La probabilità che prende valori in un intervallo **dipende solo dalla sua ampiezza**, NON da dove si trova l'intervallo stesso, ecco perché si dice *uniforme*.

- $E(X) = \frac{1}{2} (a + b)$
- $V(X) = \frac{(b-a)^2}{12}$

## V.A. Gaussiana (o normale)
Siano $\mu \in \mathbb{R}$ e $\sigma > 0$. Si dice che una v.a. $X$ ha *legge gaussiana di parametri $\mu$ e $\sigma^2$* e si scrive $X \sim N(\mu, \sigma^2)$ se $X$ è assolutamente continua con funzione di densità di probabilità ($pdf$):
$$
	f_X(x) := \frac{1}{\sqrt{2\pi} \sigma} e^{-\frac{(x-\mu)^2}{2\sigma^2}}
$$

Essa ha funzione di distribuzione ($FdD$):
$$
F_X(x) = \int^x_{-\infty} f_X (t) dt
$$


la più importante legge gaussiana è quella per cui $\mu = 0, \sigma^2 = 1$, cioè $X \sim N(0,1)$; in tal caso si dice che $X$ ha **legge normale standard**. la $FdD$ di una normale standard si denota con $\Phi(x)$.
Oss: $\Phi(-x) = 1 - \Phi(x)$

Proposizione:
$$
aX + b \sim N(a\mu + b, a^2 \sigma^2)
$$

### Come convertiamo una normale ad una normale standard?
Sia $X \sim N(\mu, \sigma^2)$. Allora
$$
\frac{X-\mu}{\sigma} \sim N(0,1)
$$
### Se abbiamo i parametri $\mu$ e $\sigma$, come convertiamo una normale standard a una normale con quei parametri?
Se $X \sim N(0,1)$, allora, se $\mu \in \mathbb{R}, \sigma > 0$:
$$
\sigma X + \mu \sim N(\mu, \sigma^2)
$$

Se $X \sim N(0,1)$:
- $E(X) = \mu = 0$
- $V(X) = \sigma^2 = 1$

Se $Y \sim N(\mu, \sigma^2)$ e $X \sim N(0,1)$, allora:
- $E(Y) = E(\sigma X + \mu) = \sigma E(X) + \mu$
- $V(Y) = E(\sigma X + \mu) = \sigma^2 V(X)$
## V.A. Chi-quadro
Siano $X_1, ..., X_n$ v.a. indipendenti, $X_i \sim n(0,1) \ \forall i = 1,...,n$. Allora, detta $X = X^2_1 + X^2_2 + ... + X^2_n$, si dice che $X$ ha *legge Chi-quadro con $n$ gradi di libertà (o di parametro $n$)* e si scrive $X \sim \chi^2_n$.
Oss:
$$
X \sim N(0,1) \Rightarrow X^2 \sim \chi^2_1
$$

- $E(X) = n$
- $V(X) = 2n$

## V.A. t-student
Siano $X \sim N(0,1)$ e $Y \sim \chi^2_n$ indipendenti. La v.a. $$T := \frac{X}{\sqrt{\frac{Y}{n}}}$$ si dice a *legge t-student con $n$ gradi di libertà*, e si scrive $T \sim t_n$.
Oss: è surrogato della normale, la sua $pdf$ è simile alla funzione di Gauss.

- $E(X) = 0$
- $V(X) = \frac{n}{n-2}$

## V.A. Fisher
Siano $X \sim \chi^2_n$ e $Y \sim \chi^2_m$ indipendenti. La v.a.
$$
F:= \frac{X/n}{Y/m}
$$
si dice a *legge di Fisher con $n, m$ gradi di libertà, e si scrive $F \sim F_{n,m}$.

lasciamo stare $E(X)$ e $V(X)$ AHAHAHAHAHAH

## Medie, varianze e operazioni su esse
Il **valore atteso** di $X$ $E(X)$ è definito come segue:
- per v.a. discrete avremo: $$:=\begin{cases} \
\sum_{k \in cod(X)} k P(X=k) \ \ \text{ se tale somma è finita} \\ \\
+\infty \text{ altrimenti}\end{cases}$$
- per v.a. continue avremo:$$:=\begin{cases}
\int^{+\infty}_{-\infty} t f_X (t) dt \ \text{ se tale integrale è definito} \\ \\
+\infty \ \text{ altrimenti}\end{cases}$$
Proposizioni varie:
- $E(aX + b) = aE(X) + b$
- se $X_1,...,X_n$ v.a. t.c. $E(X_i) < +\infty \ \forall i+1,...,n$, allora$$E(\sum_{i=1}^n X_i) = \sum_{i=1}^n E(X_i)$$
- se $X_1,...,X_n$ v.a. indipendenti t.c. $E(X_i) < +\infty \ \forall i+1,...,n$, allora$$E(\prod_{i=1}^n X_i) = \prod_{i=1}^n E(X_i)$$
- se $X$ v.a. , $m \geq 1$, si definisce **momento di ordine $m$** di $X$ la quantità $E[X^m] =$$$=\begin{cases}
\sum_{k \in cod(X)} k^m P(X=k) \ \ \text{ per v.a. discrete} \\ \\
\int^{+\infty}_{-\infty} t^m f_X(t) dt \ \ \text{ per v.a. continue} \end{cases}$$
La varianza di $X$ $V(X)$ è definita come segue:$$V(X) := E[(X - E(X))^2)]$$
La covarianza di $X, Y$ è definita come segue:$$cov(X, Y) := E[(X-E(X)) (Y-E(Y))]$$e se $X = Y$, allora:$$cov(X, X) = E[(X-E(X))^2] \ V(X)$$
Formula operativa della covarianza:$$cov(X, Y) = E(XY) - E(X) \ E(Y)$$

Proposizioni varie:
- $V(X) = E(X^2) - E(X)^2$ (<u>formula operativa della varianza</u>)
- $V(aX + b) = a^2 V(X)$ (la traslazione $b$ non cambia la disp. intorno alla media)
- se $X_1,...,X_n$ v.a. t.c. $E(X_i) < +\infty \ \forall i+1,...,n$, allora:$$V(\sum_{i=1}^n X_i) = \sum_{i=1}^n V(X_i) + \sum_{i,j = 1,i\neq j}^n cov(X_i, X_j)$$
- se $X_1,...,X_n$ v.a. indipendenti, allora:$$V(\sum_{i+1}^n X_i) = \sum_{i+1}^n V(X_i)$$

##  Stimatori di massima verosimiglianza
- Per $X = (X_1,...,X_n)$ campione di Bernoulli $X_i \sim b(1, p)$.$$\hat{p} = \frac{1}{n} \sum_{i=1}^n X_i$$Il parametro $p$ si può stimare attraverso la **media campionaria**.
- Per $X = (X_1,...,X_n)$ campione di Poisson $X_i \sim P(\lambda)$, $\lambda > 0$ ignoto.$$\hat{\lambda} = \frac{1}{n} \sum_{i=1}^n X_i$$
- Per $X = (X_1,...,X_n)$ campione normale $X_i \sim N(\mu, \sigma^2)$.$$\hat{\mu} = \frac{1}{n} \sum_{i=1}^n X_i$$$$\hat{\sigma^2} = \frac{1}{n} \sum_{i=1}^n (X_i - \overline{X_n})^2 = \frac{n-1}{n} S^2_n$$  $\mu$ si stima attraverso la **media campionaria**, ma attenzione alla **$\sigma^2 \neq$ media campionaria**.


- Per $X = (X_1,...,X_n)$ campione uniforme $X_i \sim U(\theta)$.$$\theta = max(X_1,...,X_n)$$$\theta$ si stima col **massimo tra i valori del campione**.


==TODO: aggiungere indicazioni operative sulle somme, prodotti ecc. tra variabili aleatorie, intervalli di fiducia e test vari.==