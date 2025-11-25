# Estremo superiore, inferiore, massimo e minimo (insiemi)

Siano $X, E$ insiemi, $X \neq \emptyset, E \subseteq X$.

- $E$ si dice limitato **superiormente** se $\exists M \ t.c. \ x \leq M \ \forall x \in E$.
- $E$ si dice limitato **inferiormente** se $\exists m \ t.c. \ x \geq m \ \forall x \in E$.
- $E$ si dice **limitato** se è limitato inferiormente e superiormente:
$$\exists M,m \ \ t.c.\ m \leq x \leq M \ \forall x \in E$$
$\bar{x}$ è **massimo** per $E$ se:
1) $\forall x \in E: x \leq \bar{x} \text{\ \ \ \ (max E)}$
2) $\bar{x} \in E$

$\underline{x}$ è **minimo** per $E$ se:
1) $\forall x \in E: x \geq \underline{x} \text{\ \ \ \ (min E)}$
2) $\underline{x} \in E$

**Ricorda: sia il massimo che il minimo $\in E$.**

sia $k \in X$ (**non necessariamente in $E$**, questa è la differenza con massimo e minimo).
- $k$ è detto **maggiorante** di $E$ se $x \leq k \ \forall x \in E$.
- $k$ è detto **minorante** di $E$ se $x \geq k \ \forall x \in E$.

Chiameremo **estremo superiore** di $E$ ($sup \ E$) il più piccolo tra tutti i maggioranti.
Chiameremo **estremo inferiore** di $E$ ($inf \ E$) il più grande tra tutti i minoranti.

## Assioma di completezza (o continuità)
Sia $A$ insieme, $A \subset \mathbb{R}$:
- se $A$ è limitato superiormente ammette $sup \ A$;
- se $A$ è limitato inferiormente ammette $inf \ A$;


# Valore assoluto

$\forall x \in \mathbb{R} : |x| = max \{ x, -x \}$
Oss: $|x| \geq 0 \ \forall x \in \mathbb{R}$.

Sia $a \geq 0$:
- $|x| = a \iff x = a \lor x = -a$
- $|x| \leq a \iff -a \leq x \leq a$
- $|x| \geq a \iff x \leq -a \lor x \geq a$

### Disuguaglianza triangolare:
$\forall x,y \in \mathbb{R} : |x + y| \leq |x| + |y|$
Dim: somma membro a membro

Proprietà:
$\forall x,y \in \mathbb{R} : ||x| - |y|| \leq |x-y|$


# Intorni
Sia $x_0 \in \mathbb{R}$. Si definiscono intorni di $x_0$ gli intervalli del tipo
$$
(x_0 - \varepsilon, x_0 + \varepsilon)
$$
dove $\varepsilon > 0$ e piccolo.

Siano $A \subset \mathbb{R}, x_0, y_0 \in \mathbb{R}$
1) Il punto $x_0$ si dice **interno** ad $A$ se esiste un intorno di $x_0$ tutto contenuto in $A$
$$
\exists I = (x_0 - \varepsilon, x_0 + \varepsilon), \varepsilon > 0 \ t.c. \ I \subset A
$$
2) Il punto $y_0$ si dice **esterno** ad $A$ se esiste un intorno di $y_0$ tutto contenuto nel complementare di $A$
$$
\exists I = (y_0 - \varepsilon, y_0 + \varepsilon), \varepsilon > 0 \ t.c. \ I \subset A^c
$$
3) I punti che non sono né interni né esterni sono detti di frontiera


# Funzioni
Siano $A, B$ due insiemi. Una funzione $f : A \rightarrow B$ di dominio $A$ e codominio $B$ è una qualsiasi legge che associa ad ogni elemento di $A$ uno e un solo elemento di $B$.
$$
f : x \in A \rightarrow f(x) \in B
$$
- Si dice insieme **immagine** di $f \ Im \ f = \{ f(x): x \in A \} \subseteq B$.
- L'insieme delle coppie $(x, f(x))$ al variare di $x \in A$ prende il nome di **grafico** di $f$.

## Funzione costante:
$f(x) = c$
![[Pasted image 20250604183046.png]]
Oss: $Dom f = \mathbb{R}, Im f = c$
## Funzione identica
$f(x) = x$
![[Pasted image 20250604183134.png]]

## Funzione valore assoluto
$f(x) = |x|$
![[Pasted image 20250604183226.png]]
Oss: $Dom f = \mathbb{R}, Im f = [0, +\infty)$

## Funzione parte intera
$f(x) = [x]$
![[Pasted image 20250604183746.png]]Oss: $Dom f = \mathbb{R}, Im f = \mathbb{Z}$

## Simmetrie
Una funzione si dice:
- **pari** se $f(-x) = f(x) \ \forall x \in A$
- **dispari** se $f(-x) = -f(x) \ \forall x \in A$

## Funzioni periodiche
$A \subseteq \mathbb{R}, f:A \rightarrow \mathbb{R}$.
Supponiamo che $A$ sia **periodico** di periodo $T > 0$, ovvero
$$
x \in A \rightarrow x + T \in A
$$
La funzione $f$ si dice **periodica** di periodo $T > 0$ se $\forall x \in A: f(x) = f(x+T)$
Oss: una funzione periodica si ripete su ogni intervallo di ampiezza $T$.

## Funzioni iniettive e suriettive
Sia $f : A \subseteq \mathbb{R} \rightarrow \mathbb{R}$
- $f$ si dice **iniettiva** se $\forall x_1, x_2 \in A \ t.c. \ x_1 \neq x_2 : f(x_1) \neq f(x_2)$ (a valori diversi di x corrispondono immagini diverse)
- $f$ si dice **suriettiva** se $\forall y \in \mathbb{R}, \ \exists x \in A \ t.c. \ f(x) = y$ (per ogni elemento del codominio esiste almeno un elemento del dominio collegato ad esso)
- $f$ si dice **biettiva** se è sia iniettiva che suriettiva. Se una funzione è biettiva allora è **invertibile**.
Oss: le funzioni pari e periodiche non sono **mai** iniettive.
## Monotonia
Sia $f : A \subseteq \mathbb{R} \rightarrow \mathbb{R}$. $f$ si dice:
1) Monotona **crescente**: se
$$
\forall x_1, x_2 \in A: x_1 < x_2 \ allora \ f(x_1) \leq f(x_2)
$$
2) Monotona **decrescente**: se
$$
\forall x_1, x_2 \in A: x_1 < x_2 \ allora \ f(x_1) \geq f(x_2)
$$
3) **Strettamente** monotona **crescente**: se
$$
\forall x_1, x_2 \in A: x_1 < x_2 \ allora \ f(x_1) < f(x_2)
$$
4) **Strettamente** monotona **decrescente**: se
$$
\forall x_1, x_2 \in A: x_1 < x_2 \ allora \ f(x_1) > f(x_2)
$$
Oss: attenzione ai $\geq/\leq$ della monotona e ai $>/<$ della strettamente monotona!

Teorema: **ogni funzione strettamente monotona è iniettiva**.
Dim: se una funzione è strettamente monotona crescente, avremo che $\forall x_1,x_2 \in A, x_1 < x_2, \ \text{allora (per ipotesi)} \ f(x_1) < f(x_2), \ ovvero \ f(x_1) \neq f(x_2)$.
Stesso ragionamento vale per le funzioni strettamente monotone decrescenti.

Utile da ricordare:
- La monotonia della funzione è determinata dal segno della derivata prima in un determinato intervallo.
- Se nell'intervallo ci sono alcuni punti in cui la derivata si annulla $\rightarrow$ monotona (attenzione nel caso di funzioni costanti!);
- Se nell'intervallo la derivata non si annulla $\rightarrow$ strettamente monotona;

# Estremi e limitatezza
## Massimi e minimi assoluti e relativi
Sia $f : A \in \mathbb{R} \rightarrow \mathbb{R}$ e sia $x_0 \in A$.
- $x_0$ si dice **punto di minimo assoluto** (o globale) se
$$
\forall x \in A: f(x) \geq f(x_0)
$$
- $x_0$ si dice **punto di massimo assoluto** (o globale) se
$$
\forall x \in A: f(x) \leq f(x_0)
$$
il valore $f(x_0)$ si dice **minimo** (o **massimo**) **assoluto** di $f$.
Oss: non confondere **punto di massimo/minimo** con **massimo/minimo**!
- $x_0$ punto di massimo/minimo
- $f(x_0)$ massimo/minimo

Oss: se il minimo o il massimo assoluto esiste esso è unico, ma i punti in cui si realizza possono non essere unici.

Oss: il minimo di $f$ si indica con
$$
min \ f(x) \ \ \ \ \ x\in A \ \ \ \ \ \text{= minimo dell'insieme immagine } Im(f)
$$
Oss: il massimo di $f$ si indica con
$$
max \ f(x) \ \ \ \ \ x\in A \ \ \ \ \ \text{= massimo dell'insieme immagine } Im(f)
$$


Sia $f : A \in \mathbb{R} \rightarrow \mathbb{R}$ e sia $x_0 \in A$.
- $x_0$ si dice **punto di minimo relativo** (o locale) se $\forall x \in (x_0 - \varepsilon, x_0 + \varepsilon), \varepsilon > 0:$
$$
f(x) \geq f(x_0)
$$
- $x_0$ si dice **punto di massimo relativo** (o locale) se $\forall x \in (x_0 - \varepsilon, x_0 + \varepsilon), \varepsilon > 0:$
$$
f(x) \leq f(x_0)
$$
Oss: i minimi o massimi locali (se esistono) possono **non essere** unici.

## Limitatezza
Sia $f : A \in \mathbb{R} \rightarrow \mathbb{R}$.
- $f$ si dice **limitata inferiormente** se 
$$
\exists m \in \mathbb{R} \ t.c. \ \forall x \in A: f(x) \geq m
$$
- $f$ si dice **limitata superiormente** se 
$$
\exists M \in \mathbb{R} \ t.c. \ \forall x \in A: f(x) \leq M
$$
- $f$ si dice **limitata** se è limitata sia superiormente sia inferiormente

Notazione: se $f$ non è limitata inferiormente si pone $\inf{f(x)}  = -\infty$.
Notazione: se $f$ non è limitata superiormente si pone $\sup{f(x)} = +\infty$.

# Convessità
- Una funzione $f$ si dice **convessa** in $I$ se $\forall a, b \in \mathbb{R} \ t.c. \ [a,b] \subseteq I$:
$$
f(x) \leq \frac{f(b) - f(a)}{b-a} (x-a) + f(a)
$$
$\forall x \in [a,b]$.

- Una funzione $f$ si dice **concava** se non è convessa.

Oss. per ricordare:
- concava faccina **triste**
- convessa faccina **felice**

# Algebra delle funzioni
Siano $f : A \in \mathbb{R} \rightarrow \mathbb{R}$ e $g : B \in \mathbb{R} \rightarrow \mathbb{R}$ e supponiamo $A \cap B \neq \emptyset$.
Allora possiamo definire:
- $f + g: A \cap B \rightarrow \mathbb{R}$ (funzione somma)
$$x \rightarrow (f+g)(x) = f(x) + g(x)$$
- $f \cdot g: A \cap B \rightarrow \mathbb{R}$ (funzione prodotto)
$$x \rightarrow (f \cdot g)(x) = f(x) \cdot g(x)$$
Proprietà:
- La **somma di due funzioni pari** (risp. **dispari**) è una **funzione pari** (risp. **dispari**). Infatti
$$f,g \ pari \ \ (f + g)(-x) = f(-x) + g(-x) = f(x) + g(x) = (f + g)(x)$$
- Il **prodotto di due funzioni aventi la stessa parità è pari**, il prodotto di due funzioni aventi **diversa parità è dispari**
- Sia $f$ periodica di periodo $T_1 > 0$ e sia $g$ periodica di periodo $T_2 > 0$. Supponiamo che $\exists m_1, m_2 \in \mathbb{N} \\ \  \{ 0 \}$ t.c.
$$m_1T_1 = m_2T_2$$
  allora $f + g$ e $f \cdot g$ sono periodiche di periodo $T = m_1T_1 = m_2T_2$
- La **somma di due funzioni monotone** con **stesso tono** è essa stessa **monotona**, ovvero:
	- $f, g$ monotone crescenti $\Rightarrow$ $f + g$ monotona crescente
	- $f, g$ monotone decrescenti $\Rightarrow$ $f + g$ monotona decrescente
  Oss: per il prodotto non vi è equivalente.
- La **somma di due funzioni convesse** (risp. **concave**) è essa stessa **convessa** (risp. **concava**)
- La **somma di due funzioni limitate** (inferiormente e/o superiormente) è essa stessa **limitata** (inferiormente e/o superiormente)

## Funzione composta
Siano $f : A \subseteq \mathbb{R} \rightarrow \mathbb{R}$ e $g : B \subseteq \mathbb{R} \rightarrow \mathbb{R}$ due funzioni t.c. $f(A) \subseteq B$. (le immagini di $f$ devono essere contenute in $B$).
Allora possiamo definire:
$$
g \ o \ f : A \rightarrow \mathbb{R}
$$
$$
x \rightarrow (g \ o \ f)(x) = g(f(x))
$$
Oss: non è detto che esistano sia $g \ o \ f$ sia $f \ o \ g$.
Possiamo definire $f \ o \ g$ come:
$$
f \ o \ g : B \rightarrow \mathbb{R}
$$
$$
x \rightarrow (f \ o \ g)(x) = f(g(x))
$$
Ricorda! In generale:
$$
(f \ o \ g)(x) \neq (g \ o\ f)(x)
$$

## Funzione inversa
Sia $f : A \subseteq \mathbb{R} \rightarrow \mathbb{R}$ biettiva. Allora $f$ è **invertibile**, ovvero
$$
\exists f^{-1} : Im \ f \rightarrow A
$$
t.c. $f \ o \ f^{-1} = f^{-1} \ o \ f = id$ (identità)
Proposizione: $f : A \subseteq \mathbb{R} \rightarrow \mathbb{R}$ è **strettamente monotona** $\Rightarrow f$ è **invertibile** e $f^{-1}$ **conserva la stessa monotonia**.

# Funzioni elementari
1) Funzione **potenza ad esponente intero positivo**
   Fissiamo $n \in \mathbb{N}, n \geq 1$. Definiamo la funzione potenza $n$-esima:
$$
f : x \in \mathbb{R} \rightarrow x^n \in \mathbb{R}
$$
   Oss: per $n = 1, f(x) = x \text{ (f identica)}$.
   Attenzione:
   - per $n$ **pari**: $f(x) = x^n$ è una **funzione pari** (grafico simmetrico rispetto all'asse y) e **non iniettiva**
   - per $n$ **dispari** $f(x) = x^n$ è una **funzione dispari** (grafico simmetrico rispetto all'origine) e **iniettiva**

   Per $n$ pari:
   - $Im \ f = [0, + \infty)$
   - se $x$ è negativa $\Rightarrow f(x)$ strettamente monotona decrescente
   - se $x$ è positiva $\Rightarrow f(x)$ strettamente monotona crescente
   - non limitata superiormente ($sup{f(x)} = + \infty$)
   - ha minimo assoluto $f(0) = 0$
   - $f$ non invertibile
![[Pasted image 20250605104801.png]]

   Per $n$ dispari:
   - $Im \ f = \mathbb{R}$
   - Non è limitata
   - $f$ strettamente monotona crescente
   - $f$ invertibile
   ![[Pasted image 20250605104832.png]]

2) Funzione radice $n$-esima
   $$
f : x \in \mathbb{R} \rightarrow \sqrt[n]{x}
$$
   Per $n$ pari:
   - $f: x \in [0, + \infty) \rightarrow x^n \in [0, + \infty)$
   - $f$ invertibile $\Rightarrow$ $\exists f^{-1}: x \in [0, + \infty) \rightarrow \sqrt[n]{x} \in [0, + \infty)$
   ![[Pasted image 20250605110740.png]]

   Per $n$ dispari:
   - $f : \mathbb{R} \rightarrow \mathbb{R}$
   - $f$ invertibile $\Rightarrow \exists f^{-1} : x \in \mathbb{R} \rightarrow \sqrt[n]{x} \in \mathbb{R}$
   ![[Pasted image 20250605110800.png]]

3) Potenze ad esponente intero
$$
k \in \mathbb{Z}, f(x) = x^k
$$
- se $k \geq 0$ allora $f(x)$ è la funzione potenza già vista
- se $k < 0$ allora $f(x) = (\frac{1}{x})^{-k}, -k > 0$
- $Df = \mathbb{R} - \{ 0 \}$
- se $-k$ è pari $\Rightarrow f(x)$ pari e positiva
  ![[Pasted image 20250605111656.png]]
- se $-k$ è dispari $\Rightarrow f(x)$ dispari
  ![[Pasted image 20250605111715.png]]

4) Potenze ad esponente razionale
   Sia $q \in \mathbb{Q} = \frac{m}{n}, n \neq 0$
   - se $q \geq 0$ poniamo $f(x) = x^q = x^{\frac{m}{n}} = \sqrt[n]{x^m}$
   - se $q < 0$ poniamo $f(x) = x^q = (\frac{1}{x})^{-q} = \sqrt[n]{(\frac{1}{x})^{-m}}$

4) Funzione esponenziale
   $f(x) = a^x, a > 0$
   - se $a > 1$:
    - $a^x > 0 \Rightarrow Im \ f = (0, + \infty) \Rightarrow \inf{f(x)} = 0$
    - $a^x > 1 \ \forall x >0$
    - $a^x < 1 \ \forall x < 0$
	- $f$ è strettamente monotona, quindi iniettiva
	- $f$ non è limitata superiormente
	![[Pasted image 20250605113727.png]]

  - se $0 < a < 1$:
	  - $a^x > 0 \Rightarrow Im \ f = (0, + \infty), \inf{f(x)} = 0 \Rightarrow f$ limitata inferiormente ma non superiormente
	  - $a^x < 1 \ \forall x > 0$
	  - $a^x < 1 \ \forall x < 0$
	  - $f$ strettamente monotona decrescente $\Rightarrow f$ iniettiva
    ![[Pasted image 20250605114327.png]]

5) Funzione logaritmo
   Teorema: sia $a > 0, a \neq 1, y > 0$. Allora  $\exists ! \ x \in \mathbb{R}$ t.c $a^x = y$. Tale numero prende il nome di **logaritmo** in base $a$ di $y$ e si indica con:
$$
x = \log_a{y}
$$
   Oss: dal teorema segue che $a^{\log_a y} = y$
   Proprietà:
	   1) $\log_a(x \cdot y) = \log_a x + \log_a y$
	   2) $\log_a \frac{x}{y} = \log_a x - \log_a y$
	   3) $\log_a x^p = p \log_a x \ \ \forall p \in \mathbb{R}$
	   4) $\log_b x = \frac{\log_a x}{\log_a b} \ \ b > 0, b \neq 1$ (cambio di base)

6) Base naturale
   $f(x) = e^x$ e $f(x) = \ln x$

   $e^x$:
   ![[Pasted image 20250605172319.png]]

   $\ln x$
   ![[Pasted image 20250605172425.png]]


# Funzioni circolari
## Funzione seno
$$
f: \mathbb{R} \rightarrow [-1, 1]
$$
$$
x \rightarrow \sin x
$$
- $\sin (x + 2k \pi) = \sin x$ ovvero **periodica** di periodo $T = 2 \pi$
- $f$ limitata e $\min{f(x)} = -1, \max{f(x)} = 1$
- $f$ è dispari

## Funzione coseno
$$
f: \mathbb{R} \rightarrow [-1, 1]
$$
$$
x \rightarrow \cos x
$$
- $\cos (x + 2k \pi) = \cos x$ ovvero **periodica** di periodo $T = 2 \pi$
- $f$ limitata e $\min{f(x)} = -1, \max{f(x)} = 1$
- $f$ pari

## Relazioni fondamentali
- $\sin^2 x + \cos^2 x = 1$
- $\sin (x + y) = \sin x \cos y + \cos x \sin y$
- $\sin (x - y) = \sin x \cos y - \cos x \sin y$
- $\cos (x + y) = \cos x \cos y - \sin x \sin y$
- $\cos (x - y) = \cos x \cos y + \sin x \sin y$
Ricorda: nelle regole col **seno** **permane** il segno, col **coseno** si **inverte**.

## Valori noti
| x               | $\sin x$             | $\cos x$             |
| --------------- | -------------------- | -------------------- |
| 0               | 0                    | 1                    |
| $\frac{\pi}{6}$ | $\frac{1}{2}$        | $\frac{\sqrt{3}}{2}$ |
| $\frac{\pi}{4}$ | $\frac{\sqrt{2}}{2}$ | $\frac{\sqrt{2}}{2}$ |
| $\frac{\pi}{3}$ | $\frac{\sqrt{3}}{2}$ | $\frac{1}{2}$        |
| $\frac{\pi}{2}$ | 1                    | 0                    |
## Funzione arcoseno
Oss. iniziale: siccome $\sin x$ non è iniettiva, non è invertibile per tutto il dominio, quindi lo restringiamo a $[-\frac{\pi}{2}, \frac{\pi}{2}]$.

$$
f^{-1} : [-1, 1] \rightarrow [-\frac{\pi}{2}, \frac{\pi}{2}]
$$
$$
x \rightarrow \arcsin x
$$
- non periodica
- strettamente monotona crescente

| x   | $\arcsin x$      |
| --- | ---------------- |
| -1  | -$\frac{\pi}{2}$ |
| 0   | 0                |
| 1   | $\frac{\pi}{2}$  |
![[Pasted image 20250605191411.png]]

## Funzione arcocoseno
Oss. iniziale: siccome $\cos x$ non è iniettiva, non è invertibile per tutto il dominio, quindi lo restringiamo a $[0, \pi]$.

$$
f^{-1} : [-1, 1] \rightarrow [0, \pi]
$$
$$
x \rightarrow \arccos x
$$
- non periodica
- strettamente monotona decrescente
![[Pasted image 20250605191849.png]]

## Funzione tangente
$$f(x) = \tan x = \frac{\sin x}{\cos x}$$
$$x \in \mathbb{R} - \{ \frac{\pi}{2} + k \pi / k \in \mathbb{Z} \} \rightarrow \mathbb{R}$$

- $Df = \mathbb{R} - \{ \frac{\pi}{2} + k \pi / k \in \mathbb{Z} \}$
- periodica di periodo $T = \pi$
- $f$ dispari
- non limitata, non invertibile

## Funzione arcotangente
Oss. iniziale: siccome $\tan x$ non è invertibile per tutto il dominio, lo restringiamo a $(-\frac{\pi}{2}, \frac{\pi}{2})$ dove $\tan x$ è strettamente monotona crescente.

$$
f^{-1} : \mathbb{R} \rightarrow (-\frac{\pi}{2}, \frac{\pi}{2})
$$
$$
x \rightarrow \arctan x
$$
- non ha massimo e minimo
- è limitata, $\inf{\arctan x} = -\frac{\pi}{2}, \sup{\arctan x} = \frac{\pi}{2}$
  ![[Pasted image 20250702200224.png]]

## Formule parametriche
- $\sin x = \frac{2 \tan{\frac{x}{2}}}{1 + \tan^2{\frac{x}{2}}}$
- $\cos x = \frac{1 - \tan^2{\frac{x}{2}}}{1 + \tan^2{\frac{x}{2}}}$


## Altre formule utili
- $\sin (2x) = 2 \sin x \cos x$
- $\cos (2x) = \cos^2 x - \sin^2 x$

# Successioni numeriche
Una **successione numerica** è una funzione
$$
a: A \subseteq \mathbb{N} \rightarrow \mathbb{R}
$$
$$
n \rightarrow a(n) = a_n
$$
Oss: il dominio di una successione è $\mathbb{N}$.
Notazione: in generale una successione si indica con $(a_n)_n$ oppure $\{ a_n \}_n$

Una successione $(a_n)_n$ si dice:
- **Limitata inferiormente** se $\exists m \in \mathbb{R} \ t.c. \ a_n \geq m \ \forall n \in A \subseteq \mathbb{N}$
- **Limitata superiormente** se $\exists M \in \mathbb{R} \ t.c. \ a_n \leq M \ \forall n \in A \subseteq \mathbb{N}$
- **Limitata** se è sia limitata superiormente che inferiormente

Una successione $(a_n)_n$ possiede **definitivamente** una certa proprietà se $\exists n_0 \in \mathbb{N} \ t.c. \ (a_n)_n$ soddisfa tale proprietà $\forall n \geq n_0$.

Una successione $(a_n)_n$ si dice:
- **Convergente** se $\exists \ l \in \mathbb{R}$ t.c.
$$
\forall \varepsilon > 0 \ \exists \ n_0(\varepsilon) \in \mathbb{N} \ t.c. \ |a_n - l| < \varepsilon \ \forall n \geq n_0
$$
  questo $l \in \mathbb{R}$ si chiama limite della successione $(a_n)_n$ e si scrive
$$
\lim_{n \rightarrow + \infty} {a_n} = l \text{ oppure } a_n \rightarrow l \ per \ n \rightarrow + \infty
$$
- **Divergente positivamente** se
$$
\forall M \in \mathbb{R} \ \exists \ n_0 = n_0(M) \in \mathbb{N} \ t.c. a_n > M \ \forall n \geq n_0
$$
  in tal caso si scrive
$$
\lim_{n \rightarrow + \infty} {a_n} = + \infty \text{ oppure } a_n \rightarrow + \infty \ per \ n \rightarrow + \infty
$$
- **Divergente negativamente** se
$$
\forall M \in \mathbb{R} \ \exists \ n_0 = n_0(M) \in \mathbb{N} \ t.c. a_n < M \ \forall n \geq n_0
$$
  in tal caso si scrive
$$
\lim_{n \rightarrow + \infty} {a_n} = - \infty \text{ oppure } a_n \rightarrow - \infty \ per \ n \rightarrow + \infty
$$
- **Irregolare** se non è né convergente, né divergente

## Teorema di unicità del limite
Sia $(a_n)_n$ una successione numerica. Se esiste
$$
\lim_{n \rightarrow + \infty} {a_n} = l
$$
allora esso è **unico**.
Dim: per assurdo usando la disuguaglianza triangolare.

## Sottosuccessioni
Una **sottosuccessione** di $(a_n)_n$ che si indica con $(a_{nk})_k$ ed è una successione che ha gli **stessi elementi** di $(a_n)_n$ a cui vengono **tolti** degli elementi.

Proprietà: Una successione ha limite $l \in \mathbb{R}$ se ogni sua sottosuccessione ha limite $l$.

Sia data una successione $(a_n)_n$ e sia $l \in \mathbb{R}$. Si dice che:
- $(a_n)_n$ tende a $l$ per **eccesso** e si scrive
$$
\lim_{n \rightarrow + \infty} {a_n} = l^+
$$
se $\forall \varepsilon > 0 \ \exists \ n_0 \in \mathbb{N} \ t.c. \ 0 < a_n - l < \varepsilon \ \forall n \geq n_0$ (si avvicina ad $l$ solo dall'**alto**)
- $(a_n)_n$ tende a $l$ per **difetto** e si scrive
$$
\lim_{n \rightarrow + \infty} {a_n} = l^-
$$
se $\forall \varepsilon > 0 \ \exists \ n_0 \in \mathbb{N} \ t.c. \ -\varepsilon < a_n - l < 0 \ \forall n \geq n_0$ (si avvicina ad $l$ solo dal **basso**)

Una successione numerica $(a_n)_n$ si dirà:
- monotona **crescente** se $a_n \leq a_{n+1} \ \forall n$
- **strettamente** monotona **crescente** se $a_n < a_{n+1} \ \forall n$
- monotona **decrescente** se $a_n \geq a_{n+1} \ \forall n$
- **strettamente** monotona **decrescente** se $a_n > a_{n+1} \ \forall n$

## Teorema di monotonia (Teorema di regolarità delle successioni)
Sia $(a_n)_n$ una successione:
- monotona **crescente** e **superiormente limitata**, allora
$$
\exists \lim_{n \rightarrow + \infty} a_n = \{ \sup{a_n} : n \in \mathbb{N}\} < + \infty
$$
- monotona **decrescente** e **inferiormente limitata**, allora
$$
\exists \lim_{n \rightarrow + \infty} a_n = \{ \inf{a_n} : n \in \mathbb{N}\} > - \infty
$$
### Corollario
Sia $(a_n)_n$ una **successione monotona** (crescente o decrescente). allora
$$
\exists \lim_{n \rightarrow + \infty} a_n
$$

### Proposizioni
Sia data $(a_n)_n$ una successione:
- $(a_n)_n$ convergente $\Rightarrow (a_n)_n$ è limitata
- $(a_n)_n$ diverge positivamente $\Rightarrow (a_n)_n$ **non** è limitata **superiormente** ed è limitata **inferiormente**
- $(a_n)_n$ diverge negativamente $\Rightarrow (a_n)_n$ **non** è limitata **inferiormente** ed è limitata **superiormente**
Oss: non valgono al contrario!

## Infinito e infinitesimo
Sia $(a_n)_n$ una successione:
- si dice **infinitesima** se:
$$
\lim_{n \rightarrow + \infty} a_n = 0
$$
- si dice **infinita** se:
$$
\lim_{n \rightarrow + \infty} a_n = + \infty \ \lor \lim_{n \rightarrow + \infty} a_n = - \infty
$$


## Successione geometrica
$$
(q^n)_n, q \in \mathbb{R}
$$
Il limite
$$
\lim_{n \rightarrow + \infty} q^n:
$$
- $= + \infty \ se \ q > 1$
- $= 1 \ se \ q = 1$
- $= 0 \ se \ |q| < 1$
- $\nexists \ se \ q \leq -1$


## Successione potenza
$$
(n^\alpha)_n , \alpha \in \mathbb{R}
$$
Il limite
$$
\lim_{n \rightarrow + \infty} n^\alpha:
$$
- $= + \infty \ se \ \alpha > 0$
- $= 1 \ se \ \alpha = 0$
- $= 0 \ se \ \alpha < 0$


## Calcolo dei limiti
### Teorema dell'algebra dei limiti
Se $a_n \rightarrow a$ e $b_n \rightarrow b$ per $n \rightarrow + \infty$
- $a_n \pm b_n \rightarrow a \pm b$
-  $a_n \cdot b_n \rightarrow a \cdot b$
-  $\frac{a_n}{b_n} \rightarrow \frac{a}{b}$ (se $b_n,b \neq 0$)
- $a^{b_n}_n \rightarrow a^b$

### Teorema della permanenza del segno
- se $a_n \rightarrow a$ per $n \rightarrow + \infty$ e $a > 0 \ oppure \ (a < 0)$
  allora $a_n > 0$ definitivamente (risp. $a_n < 0$ definitivamente)
- se $a_n \rightarrow a$ per $n \rightarrow + \infty$ e $a \geq 0 \ oppure \ (a \leq 0)$
  allora $a_n \geq 0$ definitivamente (risp. $a_n \leq 0$ definitivamente)

### Teorema del confronto
Se $(a_n)_n, (b_n)_n, (c_n)_n$ sono tre successioni t.c. $a_n \leq b_n \leq c_n$ definitivamente e sia $a_n$ che $c_n$ tendono ad uno stesso $l$ per $n \rightarrow + \infty$, allora anche:
$$
b_n \rightarrow l, n \rightarrow + \infty
$$
#### Corollario
- se $|b_n| \leq c_n$ definitivamente e $c_n \rightarrow 0, n \rightarrow +\infty$ allora $b_n \rightarrow 0, n \rightarrow +\infty$
- se $c_n \rightarrow 0, n \rightarrow +\infty$ e $(b_n)_n$ limitata allora $b_n \cdot c_n \rightarrow 0, n \rightarrow +\infty$
Oss:
se $a_n \rightarrow a$ per $n \rightarrow + \infty \lor b_n \rightarrow +\infty$ per $n \rightarrow + \infty$:
- $a_n + b_n \rightarrow + \infty$
- $a_n - b_n \rightarrow - \infty$
- $a_n \cdot b_n \rightarrow + \infty$
- $\frac{a_n}{b_n} \rightarrow 0$ ($a \neq 0, b_n \neq 0$)
per $n \rightarrow +\infty$.

## Forme indeterminate
- $[+\infty -\infty]$
- $[\frac{\infty}{\infty}]$
- $[\frac{0}{0}]$
- $[0 \cdot \infty]$
- $[0^0]$
- $[\infty^0]$
- $[1^\infty]$


# Confronti e stime asintotiche
Siano $(a_n)_n$ e $(b_n)_n$ due successioni **infinite**.
Consideriamo il limite:
$$
\lim_{n \rightarrow +\infty} {\frac{a_n}{b_n}}
$$
- $0$ (i)
- $l \in \mathbb{R}$ (ii)
- $\pm \infty$ (iii)
- $\nexists$ (iv)

i) $(a_n)_n$ è un infinito di **ordine inferiore** a $(b_n)_n$
ii) $(a_n)_n$ e $(b_n)_n$ sono infiniti dello **stesso ordine**
iii) $(a_n)_n$ è un infinito di **ordine superiore** a $(b_n)_n$
iv) $(a_n)_n$ e $(b_n)_n$ **non** sono **confrontabili**

Siano $(a_n)_n$ e $(b_n)_n$ due successioni **infinitesime**.
Consideriamo il limite:
$$
\lim_{n \rightarrow +\infty} {\frac{a_n}{b_n}}
$$
- $0$ (i)
- $l \in \mathbb{R}$ (ii)
- $\pm \infty$ (iii)
- $\nexists$ (iv)

i) $(a_n)_n$ è un infinitesimo di **ordine superiore** a $(b_n)_n$
ii) $(a_n)_n$ e $(b_n)_n$ sono infinitesimi dello **stesso ordine**
iii) $(a_n)_n$ è un infinitesimo di **ordine inferiore** a $(b_n)_n$
iv) $(a_n)_n$ e $(b_n)_n$ **non** sono **confrontabili**

## Asintoticità
Siano $(a_n)_n$ e $(b_n)_n$ due successioni. Se
$$
\lim_{n \rightarrow + \infty}{\frac{a_n}{b_n}} = 1
$$
allora si dice che $(a_n)_n$ e $(b_n)_n$ sono **asintotiche** e si scrive
$$
a_n \sim b_n
$$
(hanno lo **stesso comportamento all'infinito**)

- vale la proprietà transitiva (se $a_n \sim b_n$ e $b_n \sim c_n$ allora $a_n \sim c_n$)

## Gerarchia degli infiniti
$$
\log_a n < n^\alpha < a^n < n! < n^n
$$

## Limiti (e asintoticità) notevoli
Sia $(a_n)_n$ una successione infinitesima. Per $n \rightarrow +\infty$:
- $\sin a_n \sim a_n$
- $1 - \cos a_n \sim \frac{1}{2} a^2_n$
- $\log{(1 + a_n)} \sim a_n$
- $\log_a{(1 + a_n)} \sim \frac{a_n}{\log a}$
- $e^{a_n} - 1 \sim a_n$
- $a^{a_n} - 1 \sim (\log a) \cdot a_n$
- $\tan{a_n} \sim a_n$
- $\arctan{a_n} \sim a_n$
- $\arcsin{a_n} \sim a_n$
- $(1 + a_n)^\alpha - 1 \sim \alpha \cdot a_n$
- $(1+ \frac{a}{n})^n = e^a$
- $(1 + \frac{1}{b_n})^{b_n} = e^a$ , ($b_n \rightarrow + \infty$)
- $(1 + a \cdot a_n)^{\frac{1}{a_n}} = e^a$
- $(1 + \frac{1}{n})^n = e$

### Criterio del rapporto per le successioni
Sia $(a_n)_n$ una successione positiva. Se
$$
\exists \lim_{n \rightarrow +\infty}{\frac{a_{n+1}}{a_n}} = l
$$
allora:
- se $l < 1$: $a_n \rightarrow 0$
- se $l > 1$ (anche $+\infty$): $a_n \rightarrow +\infty$
Oss: non si può dire nulla se $l = 1$.


# Limiti di funzioni, continuità e asintoti
Sia $f : Df \subseteq \mathbb{R} \rightarrow \mathbb{R}$.
Si dice che $\lim_{x \rightarrow c} {f(x)} = l$ ($c, l \in \bar{\mathbb{R}}$)
se per ogni successione $(x_n)_n \subset Df, x_n \neq c$ t.c. $x_n \rightarrow c$ per $n \rightarrow +\infty : f(x_n) \rightarrow l$ per $n \rightarrow +\infty$.

Una funzione ha una certa proprietà **definitivamente** per $x \rightarrow c$ se $\exists \ \mathcal{U}$ intorno di $c$ t.c. tale proprietà vale per $f(x) \ \forall x \in \mathcal{U}, x \neq c$.

Si dice che $\lim_{x \rightarrow c} {f(x)} = l$ se:
1) limite **finito** al **finito** $(c, l \in \mathbb{R}$)
$$
\forall \varepsilon > 0 \ \exists \ \delta = \delta(\varepsilon) > 0 : \forall x \neq c : |x - c| < \delta \Rightarrow |f(x) - l| < \varepsilon
$$
2) limite **infinito** al finito ($c \in \mathbb{R}, l = +\infty \lor l = -\infty$****)
	1) $l = +\infty$
$$
\forall k > 0 \ \exists \ \delta (k) > 0 : \forall x \neq c \ |x - c| < \delta \Rightarrow f(x) > k
$$

	2)  $l = -\infty$
$$
\forall k > 0 \ \exists \ \delta (k) > 0 : \forall x \neq c \ |x - c| < \delta \Rightarrow f(x) < -k
$$
3) limite **finito** all'**infinito** ($l \in \mathbb{R}, c = +\infty \lor c = -\infty$)
	1) $c = +\infty$
$$
\forall \varepsilon > 0 \ \exists \ M > 0 \ t.c. \ \forall x > M \Rightarrow |f(x) - l| < \varepsilon
$$

	2) $c = -\infty$
$$
\forall \varepsilon > 0 \ \exists \ M > 0 \ t.c. \ \forall x < -M \Rightarrow |f(x) - l| < \varepsilon
$$
4) limite **infinito** all'**infinito**
	1) $c = +\infty, l = +\infty$
$$
\forall k > 0 \ \exists \ M = M(k) > 0 \ t.c. \ \forall x > M \Rightarrow f(x) > k
$$

	2) $c = +\infty, l = -\infty$
$$
\forall k > 0 \ \exists \ M = M(k) > 0 \ t.c. \ \forall x > M \Rightarrow f(x) < -k
$$

	3) $c = -\infty, l = +\infty$
$$
\forall k > 0 \ \exists \ M = M(k) > 0 \ t.c. \ \forall x < -M \Rightarrow f(x) > k
$$

	4) $c = -\infty, l = -\infty$
$$
\forall k > 0 \ \exists \ M = M(k) > 0 \ t.c. \ \forall x < -M \Rightarrow f(x) < -k
$$

- Una funzione $f(x)$ si dice **infinitesima** se
$$
\lim_{x \rightarrow c} {f(x)} = 0
$$
- Una funzione $f(x)$ si dice **infinita** se
$$
\lim_{x \rightarrow c} {f(x)} = \pm \infty
$$

## Teorema di unicità del limite
Se **esiste**
$$
\lim_{x \rightarrow c} f(x) = l
$$
allora esso è **unico**.

## Asintoti
### Asintoto orizzontale
Si dice che la funzione $f(x)$ ha un asintoto **orizzontale** di equazione $y = l$ ($l \in \mathbb{R}$) per $x \rightarrow +\infty$ oppure $x \rightarrow -\infty$ se
$$
\lim_{x \rightarrow +\infty} f(x) = l \ \lor \ \lim_{x \rightarrow -\infty} f(x) = l
$$
### Asintoto destro e sinistro
Se $c \in \mathbb{R}, l \in \bar{\mathbb{R}}$. Si dice che
$$
\lim_{x \rightarrow c^+} f(x) = l \text{ (rispettivamente } \lim_{x \rightarrow c^-} f(x) = l \text{)}
$$
Se per ogni intorno di $l$ esiste un **intorno destro** (rispettivamente **sinistro**) di $c$ ($c, c+\delta$), $\delta > 0$ tale che per $x \in (c, c+\delta)$ si ha che $f(x)$ è nell'**intorno** di $l$. Questo limite è detto **limite destro** (rispettivamente **sinistro**).

## Asintoto verticale
Si dice che la funzione $f(x)$ ha un asintoto **verticale** di equazione $x = c$ ($c \in \mathbb{R}$) se
$$
\lim_{x \rightarrow c} f(x) = \pm \infty
$$
oppure:
- $\lim_{x \rightarrow c^+} f(x) = \pm \infty$ allora $x = c$ è detto **asintoto verticale destro**
- $\lim_{x \rightarrow c^-} f(x) = \pm \infty$ allora $x = c$ è detto **asintoto verticale sinistro**

## Asintoto obliquo
Si dice che la funzione $f(x)$ ha un asintoto **obliquo** di equazione $y = mx + q$ se
$$
\lim_{x \rightarrow \pm \infty} [f(x) - (mx + q)] = 0
$$
Una funzione ammette asintoto obliquo per $x \rightarrow \pm \infty$ se valgono le seguenti proprietà:
- $\exists \lim_{x \rightarrow \pm \infty} {\frac{f(x)}{x}} = m \neq 0$ ($m \in \mathbb{R}$)
- $\exists \lim_{x \rightarrow \pm \infty} [f(x) - mx] = q \in \mathbb{R}$
Oss: se vi è asintoto orizzontale non c'è asintoto obliquo.

Oss. operative: si calcola (se possibile):
- $\lim_{x \rightarrow +\infty} f(x) = (l \rightarrow \text{ asintoto orizzontale}) (\pm \infty \rightarrow \text{ cerco obliquo})$
- $\lim_{x \rightarrow -\infty} f(x) = (l \rightarrow \text{ asintoto orizzontale}) (\pm \infty \rightarrow \text{ cerco obliquo})$
- $\lim_{x \rightarrow c^{\pm}} f(x) = \pm \infty \text{ (asintoto verticale)}$

## Alcuni limiti importanti
- $\lim_{x \rightarrow +\infty} x^\alpha =$
	- $+\infty$ se $\alpha > 0$
	- $1$ se $\alpha = 0$
	- $0$ se $\alpha < 0$

- $\lim_{x \rightarrow +\infty} a^x =$
	- $+\infty$ se $a > 1$
	- $0$ se $0 < a < 1$


## Continuità
sia $f : Df \rightarrow \mathbb{R}, Df \subseteq \mathbb{R}$ e sia $c \in Df$. $f$ si dice **continua** in $x = c$ se esiste
$$
\lim_{x \rightarrow c} f(x) = f(c)
$$
## Punto di discontinuità a salto
si dice che $c$ è un **punto di discontinuità a salto** per $f(x)$ se
$$
\exists \lim_{x \rightarrow c^+} f(x) = l_1 < +\infty \ \exists \lim_{x \rightarrow c^-} f(x) = l_2 < +\infty
$$
ma
$$
l_1 \neq l_2
$$

## Discontinuità eliminabile
si dice che $c \in Df$ è un **punto di discontinuità eliminabile** per $f(x)$ se $\lim_{x \rightarrow c^+} f(x) = \lim_{x \rightarrow c^-} fx(x) = l$ ma $l \neq f(c)$.
Possiamo ridefinire $f(x)$ nel seguente modo:
$$
f^\sim (x) =
$$
- $f(x), \ x \neq c$
- $l,\ x = c$

$f^\sim (x)$ è continua.

# Proprietà fondamentali dei limiti e continuità
## Teorema del confronto
Se per $x \rightarrow c : f(x) \rightarrow l$ e $g(x) \rightarrow l$ e inoltre $f(x) \leq h(x) \leq g(x)$ definitivamente per $x \rightarrow c$ allora $f(x) \rightarrow l$ per $x \rightarrow c$.

## Teorema di permanenza del segno
- Se $x \rightarrow c : f(x) \rightarrow l > 0$ allora $f(x)$ è positiva definitivamente per $x \rightarrow c$.
- Se $x \rightarrow c : f(x) \rightarrow l, f(x) \geq 0$ definitivamente per $x \rightarrow c$ allora $l \geq 0$.

## Teorema (algebra dei limiti)
Se per $x \rightarrow c : f(x) \rightarrow l_1, g(x) \rightarrow l_2$ ($l_1, l_2 \in \mathbb{R}$) allora per $x \rightarrow c$:
- $f(x) \pm g(x) \rightarrow l_1 \pm l_2$
-  $f(x) \cdot g(x) \rightarrow l_1 \cdot l_2$
-  $\frac{f(x)}{g(x)} \rightarrow \frac{l_1}{l_2}$ (se $g(x),l_2 \neq 0$)

## Teorema (algebra delle funzioni continue)
Siano $f, g$ due funzioni definite almeno in un intorno di $x_0 \in \mathbb{R}$ e che siano continue in $x_0$. Allora:
- $f(x) \pm g(x)$ è **continua** in $x_0$
- $f(x) \cdot g(x)$ è **continua** in $x_0$
- $\frac{f(x)}{g(x)}$ è **continua** in $x_0$ con $g(x) \neq 0 \text{ in un intorno di } x_0 \land g(x_0) \neq 0$

## Teorema (continuità delle funzioni elementari)
Le funzioni **potenze**, **esponenziali**, **logaritmiche** e **trigonometriche** elementari sono **continue**.

## Teorema (continuità $f$ composta)
Sia $g$ una funzione **definita** almeno in un intorno di $x_0$ e **continua** in $x_0$.
Sia $f$ una funzione **definita** almeno in un intorno di $t_0 = g(x_0)$ e **continua** in $t_0$.
Allora $f \ o \ g$ è **definita** almeno in un intorno di $x_0$ ed è **continua** in $x_0$ (**composizione** di funzioni **continue** è **continua**). 

## Limiti notevoli
Per $x \rightarrow 0$:
- $\sin x \sim x$
- $1 - \cos x \sim \frac{x^2}{2}$
- $\log{(1 + x)} \sim x$
- $e^x - 1 \sim x$
- $(1 + x)^\alpha - 1 \sim \alpha x$
- $\tan{x} \sim x$
- $\arctan x \sim x$
- $\arcsin x \sim x$


# Punti stazionari, massimi e minimi locali e assoluti
Sia $f : [a, b] \rightarrow \mathbb{R}, x_0 \in [a,b]$. Si dice:
- $M$ è **massimo assoluto** per $f$ e $x_0$ è un **punto di massimo assoluto** per $f$ se $\forall x \in [a,b]$:
$$
f(x) \leq f(x_0) = M
$$
- $M$ è **massimo locale o relativo** per $f$ e $x_0$ è un **punto di massimo locale o relativo** per $f$ se $\exists \delta > 0 \ t.c. \ \forall x \in (x_0 - \delta, x_0 + \delta)$:
$$
f(x) \leq f(x_0) = M
$$
- $m$ è **minimo assoluto** per $f$ e $x_0$ è un **punto di minimo assoluto** per $f$ se $\forall x \in [a,b]$:
$$
f(x) \geq f(x_0) = m
$$
- $m$ è **minimo locale o relativo** per $f$ e $x_0$ è un **punto di minimo locale o relativo** per $f$ se $\exists \delta > 0 \ t.c. \ \forall x \in (x_0 - \delta, x_0 + \delta)$:
$$
f(x) \geq f(x_0) = m
$$
Oss: i massimi e minimi assoluti sono unici, non è detto che siano unici i punti in cui si realizzano.

## Teorema di Fermat
$f : [a,b] \rightarrow \mathbb{R}$ derivabile in $x_0 \in (a,b)$. Se $x_0$ è un **punto di estremo locale** per $f$, allora $f'(x_0) = 0$, ovvero $x_0$ è un **punto stazionario**.

Oss. (IMPORTANTE): Il teorema di Fermat è una **condizione necessaria** ma **non sufficiente** affinché un punto $x_0$ sia un estremo locale, ovvero:
$$
x_0 \text{ è min o max locale } \Rightarrow f'(x_0) = 0
$$
==**NON IL CONTRARIO**.==

# Test di monotonia
Sia $f : (a,b) \mathbb{R}$. $\forall x \in (a,b)$ abbiamo che
- $f$ **crescente** $\iff f'(x) \geq 0$
- $f$ **decrescente** $\iff f'(x) \leq 0$
Oss: se $f'(x) = 0$ in $(a,b) \iff f(x)$ **costante** in $(a,b)$.

## Continuità delle funzioni derivabili
Sia $f : Df \rightarrow \mathbb{R}$ derivabile $\iff f$ continua in $Df$.
**NON IL CONTRARIO**.

# Proprietà globali delle funzioni continue
==Vedere le tracce per esempi.==
## Teorema degli zeri o di Bolzano
Sia $f : [a,b] \rightarrow \mathbb{R}$ **continua** e $f(a) \cdot f(b) < 0$ allora **esiste** $c \in (a,b)$ t.c. $f(c) = 0$.
Se $f$ è inoltre **strettamente monotona** allora lo **zero è unico** (ovvero $c$ è unico).

## Teorema di Weierstrass
Sia $f : [a,b] \rightarrow \mathbb{R}$ continua allora esistono il massimo e il minimo assoluto in $[a,b]$.

## Teorema dei valori intermedi
Sia $f : [a,b] \rightarrow \mathbb{R}$ continua. Allora per ogni $y$ t.c. $m \leq y \leq M$ (minimo e massimo di $f$ in $[a,b]$) $\exists x \in [a,b]$ t.c. $f(x) = y$.


# Derivata
Consideriamo una $f : Df \subseteq \mathbb{R} \rightarrow \mathbb{R}$
Definiamo **rapporto incrementale** di $f$ relativo all'intervallo $[x, x+h]$:
$$
\frac{f(x+h) - f(x)}{h}
$$
esso rappresenta il **coefficiente angolare** della retta passante per due punti (quindi secante) qualsiasi $A = f(x)$  e $B = f(x+h)$.
Per $h \rightarrow 0$ il punto $A$ resta fisso mentre il punto $B$ si avvicina ad $A$ mantenendosi sul grafico. Al limite:
- La retta secante diventa **tangente** al grafico della funzione in $A$
- La pendenza è data dalla $\tan \alpha$ e prende il nome di **derivata prima** di $f$.

Sia $f: (a,b) \rightarrow \mathbb{R}$. $f$ si dice **derivabile** in $x_0 \in (a,b)$ se
$$
\exists \lim_{h \rightarrow 0} {\frac{f(x_0+h) - f(x_0)}{h}} < +\infty
$$
tale limite è detto **derivata** di $f$ in $x_0$ e si indica con $f'(x_0)$.
$$
\lim_{h \rightarrow 0} {\frac{f(x_0+h) - f(x_0)}{h}} = f'(x_0)
$$
La retta di equazione
$$
y = f'(x_0) (x-x_0) + f(x_0)
$$
è detta **retta tangente al grafico** di $f$ **nel punto di ascissa** $x_0$ oppure nel punto ($x_0, f(x_0)$).

## Derivata delle funzioni elementari
- $f(x) = c, c \in \mathbb{R}$ (funzione costante): $f'(x) = 0$
- $f(x) = x^\alpha$: $f'(x) = \alpha x^{\alpha - 1}$
- $f(x) = \sin x$: $f'(x) = \cos x$
- $f(x) = \cos x$: $f'(x) = - \sin x$
- $f(x) = \tan x$: $f'(x) = \frac{1}{\cos^2 x}$ oppure $1 + \tan^2 x$
- $f(x) = \arctan x$: $f'(x) = \frac{1}{1 + x^2}$
- $f(x) = \arcsin x$: $f'(x) = \frac{1}{\sqrt{1 - x^2}}$
- $f(x) = \arccos x$: $f'(x) = - \frac{1}{\sqrt{1 - x^2}}$
- $f(x) = e^x$: $f'(x) = e^x$
- $f(x) = \log x$: $f'(x) = \frac{1}{x}$

## Funzioni non derivabili
$f : Df \subseteq \mathbb{R} \rightarrow \mathbb{R}, f'(x): Df' \subseteq \mathbb{R} \rightarrow \mathbb{R}$
In generale $Df \subseteq Df'$, però nel caso in cui $Df' \subset Df$ allora ci possono essere problemi di derivabilità.

### Classificazione punti di non derivabilità
- **Punti angolosi**: se
$$
\exists \lim_{h \rightarrow 0^+} {\frac{f(x_0+h) - f(x_0)}{h}} = l_1 < +\infty
$$
  e
$$
\exists \lim_{h \rightarrow 0^-} {\frac{f(x_0+h) - f(x_0)}{h}} = l_2 < +\infty
$$
  ma $l_1 \neq l_2$ allora il punto $(x_0, f(x_0))$ è detto **punto angoloso**.
  - **Punti di Cuspide**: se 
$$
\lim_{h \rightarrow 0^+} {\frac{f(x_0+h) - f(x_0)}{h}} = \pm \infty
$$
  e
$$
\lim_{h \rightarrow 0^-} {\frac{f(x_0+h) - f(x_0)}{h}} = \pm \infty
$$
  con i due $\infty$ di **segno opposto**.
- **Flesso a tangente verticale**: se 
$$
\lim_{h \rightarrow 0^+} {\frac{f(x_0+h) - f(x_0)}{h}} = \pm \infty
$$
  e
$$
\lim_{h \rightarrow 0^-} {\frac{f(x_0+h) - f(x_0)}{h}} = \pm \infty
$$
  con i due $\infty$ di **segno uguale**.

Oss: le funzioni con **problemi di derivabilità** sono:
1) $f(x) = |g(x)|$ lì dove $g(x) = 0$
2) $f(x) = \sqrt[n]{g(x)}$ lì dove $g(x) = 0$
3) $f(x) = \arcsin g(x)$ lì dove $g(x) = \pm 1$
4) $f(x) = \arccos g(x)$ lì dove $g(x) = \pm 1$

## Teorema (algebra delle derivate)
Siano $f,g : (a,b) \rightarrow \mathbb{R}$ derivabili, allora:
- $(f \pm g)' = f' \pm g'$
- $(f \cdot g)' = f' \cdot g + f \cdot g'$
- $(\frac{f}{g})' = \frac{f' \cdot g - f \cdot g'}{g^2}$

## Derivazione di funzioni composte
Sia $g \ o \ f$ la composizione di $g$ e $f$.
Se $f$ è derivabile in $x_0 \in Df$ e $g$ derivabile in $y_0 = f(x_0) \in Dg$. Allora $g \ o \ f$ è derivabile in $x_0$ e vale
$$
(g \ o \ f)'(x_0) = g'(f(x_0)) \cdot f'(x_0)
$$

## Derivata della funzione inversa
$f : (a,b) \rightarrow \mathbb{R}$ continua e invertibile in $(a,b)$ e $g = f^{-1}$ la sua inversa.
Supponiamo che esista $f'(x_0) \neq 0, x_0 \in (a,b)$. Allora $g$ è derivabile in $y_0 = f(x_0)$ e $g'(y_0) = \frac{1}{f'(x_0)}$.

## Derivata destra e sinistra
Sia $f : Df \subseteq \mathbb{R} \rightarrow \mathbb{R}$ e $x_0 \in Df$.
- Si definisce **derivata destra** di $f$ in $x_0$:
$$
f'_+(x_0) = \lim_{h \rightarrow 0^+} {\frac{f(x_0+h) - f(x_0)}{h}}
$$
- Si definisce **derivata sinistra** di $f$ in $x_0$:
$$
f'_-(x_0) = \lim_{h \rightarrow 0^-} {\frac{f(x_0+h) - f(x_0)}{h}}
$$
Oss: usare la derivata destra e sinistra per studiare la derivata della funzione negli estremi del dominio (se inclusi).

# Derivata seconda
$$
f''(x) = (f'(x))'
$$
La **derivata seconda** ci è utile per capire la **concavità** della funzione in un intervallo e determinare i **punti di flesso**.

## Epigrafo
Si chiama epigrafo di $f$ il seguente insieme
$$
epi f = \{ (x,y) \in \mathbb{R}^2 : x \in I \ e \ y \geq f(x)\}
$$
- Una $f$ è **convessa** se $epi f$ è un insieme convesso
- Una $f$ è **concava** se $-f$ è convessa

## Punto di flesso
Un punto $x_0$ si dice di **flesso** se $f''(x_0) = 0$ e a sinistra la funzione è concava (risp. convessa) e a destra la funzione è convessa (risp. concava).


# Calcolo differenziale e approssimazioni
Nella formula del rapporto incrementale, prendiamo in considerazione l'incremento $h$.
$h = dx$

## Differenziale
Il **differenziale** della funzione $f$ in $x_0$:
$$
df = f'(x_0) \ dx
$$

Siano due funzioni $f(x) \ e \ g(x)$ definite in un intorno di $x_0$, si dice che
$$
f(x) = o(g(x)) \text{ (f(x) è un "o" piccolo di g(x))}
$$
per $x \rightarrow x_0$ se
$$
\frac{f(x)}{g(x)} \rightarrow 0 \ per \ x \rightarrow 0
$$
Oss: col simbolo $o(1)$ si intende una quantità che va semplicemente a $0$.

## Regole del calcolo dei differenziali
- $d(f \pm g) = df \pm dg$
- $d(fg) = f \ dg + g \ df$
- $d(\frac{f}{g}) = \frac{f \ dg - g \ df}{g^2}$

Oss: $o(x) - o(x) = o(x)$
Oss: il simbolo $o(...)$ indica una funzione non meglio specificata

- i coefficienti moltiplicativi non sono rilevanti. Es: $o(3x^2) = o(x^2)$
- $-o(x) = o(x)$
- per $x \rightarrow 0$ si prende la potenza più bassa. Es: $o(x) + o(x^2) = o(x)$
- per $x \rightarrow +\infty$ si prende la potenza più alta. Es: $o(x) + o(x^2) = o(x^2)$
- $x \cdot o(x) = o(x^2)$
- $\frac{o(x^3)}{x} = o(x^2)$
- $\frac{o(x^2)}{x^2} = o(1)$

## Formula di Taylor con resto di Peano
Sia $f: Df \subseteq \mathbb{R} \rightarrow \mathbb{R}$ e $x_0 \in Df$ in cui $f$ è derivabile $n$ volte.
Si chiama **polinomio di Taylor**:
$$
T_{n, x_0} (x) = \sum_{k=0}^n {\frac{f^{k}(x_0)}{k!} (x-x_0)^k}
$$
**Teorema**: Sia $f: Df \subseteq \mathbb{R} \rightarrow \mathbb{R}$ e $x_0 \in Df$ in cui $f$ è derivabile $n$ volte. Allora
$$
f(x) = T_{n, x_0} (x) + o((x-x_0)^n) \ per \ x \rightarrow x_0
$$

# Serie numeriche
Sia $(a_n)_n$ una successione di numeri reali. Allora
$$
\sum_{n=0}^{+\infty} {a_n}
$$
è detta **serie numerica**.

Per dare senso alla serie, dobbiamo costruire un'altra successione:
$$
S_n = a_0 + a_1 + a_2 + ... + a_n = \sum_{k=0}^{n} {a_k}
$$
$S_n$ è detta **somma parziale $n$-esima**.

Associamo alla serie iniziale **due successioni diverse** tra loro:
- $(a_n)_n$ **successione dei termini generali** della serie
- $(S_n)_n$ **successione delle somme parziali** della serie


Una serie numerica si dice:
- **convergente** se $\exists \lim_{n \rightarrow +\infty} S_n = S_0 < +\infty$ dove $S_0 = \sum_{n=0}^{+\infty} {a_n}$
- **divergente** se $\exists \lim_{n \rightarrow +\infty} S_n = \pm \infty$
- **irregolare** se $\nexists \lim_{n \rightarrow +\infty} S_n$

## Serie geometrica
$$
\sum_{n=0}^{+\infty} {q^n}, \ q \in \mathbb{R} \ (a_n = q^n)
$$
- **converge** se $|q| < 1$ e $S_0 = \sum_{k=0}^{+\infty} {q^k} = \frac{1}{1-q}$
- **diverge** se $q > 1$
- **irregolare** se $q \leq -1$

## Serie armonica
$$
\sum_{n = 1}^{+\infty} \frac{1}{n}
$$
è **divergente**.

## Serie armonica generalizzata
$$
\sum_{n = 1}^{+\infty} \frac{1}{n^\alpha}
$$
- **converge** per $\alpha > 1$
- **diverge** per $\alpha \leq 1$

## Serie di Mengoli
$$
\sum_{n = 1}^{+\infty} \frac{1}{n(n+1)}
$$
è **convergente** a $S_0 = 1$.

## Serie telescopiche
$$
\sum_{n=0}^{+\infty} {a_n}, \ \ a_n = b_n - b_{n+1}
$$
$$
S_n = b_0 - b_{n+1}
$$
La **condizione necessaria** (ma **non sufficiente**) per la **convergenza**:
$$
\lim_{n \rightarrow +\infty} a_n = 0
$$

**ATTENZIONE: se nell'esercizio si chiede di calcolare la somma, essa è o geometrica o telescopica.**

## Serie a termini non negativi
Una serie $\sum_{n=0}^{+\infty} {a_n}$ si dice **a termini non negativi** se $a_n \geq 0, \forall n$.
Oss: in caso di serie a termini non negativi, avremo che $S_{n+1} \geq S_n \Rightarrow (S_n)_n$ è **monotona crescente** $\Rightarrow \exists \lim_{n \rightarrow +\infty} {S_n}$.

## Criterio del confronto
Siano $\sum a_n$ e $\sum b_n$ due **serie a termini non negativi** ($a_n \geq 0, b_n \geq 0$) t.c. $a_n \leq b_n$ definitivamente.
Valgono allora le seguenti implicazioni:
- $\sum b_n$ **converge** $\Rightarrow \sum a_n$ **converge**
- $\sum b_n$ **diverge** $\Rightarrow \sum a_n$ **diverge**

## Criterio del confronto asintotico
Siano $(a_n)_n, (b_n)_n, \ a_n \geq 0, b_n \geq 0$.
- se $a_n \sim b_n$ allora $\sum a_n$ e $\sum b_n$ hanno lo **stesso comportamento**.

## Criterio della radice
Sia $\sum a_n$ una **serie a termini non negativi**. Se
$$
\exists \lim_{n \rightarrow +\infty} \sqrt[n]{a_n} = l
$$
e:
- $l > 1 \Rightarrow$ la serie **diverge**
- $l < 1 \Rightarrow$ la serie **converge**
- $l = 1 \Rightarrow$ **NON SI PUÒ CONCLUDERE NULLA**

Oss. per esercizi: è utile per le potenze $n$-esime.

## Criterio del rapporto
Sia $\sum a_n, a_n > 0$. Se
$$
\exists \lim_{n \rightarrow +\infty} {\frac{a_{n+1}}{a_n}} = l
$$
e:
- $l > 1 \Rightarrow$ la serie **diverge**
- $l < 1 \Rightarrow$ la serie **converge**
- $l = 1 \Rightarrow$ **NON SI PUÒ CONCLUDERE NULLA**

Oss. per esercizi: è utile per i fattoriali.

## Serie a termini di segno variabile
Sia $\sum_{n=0}^{+\infty} {a_n}$ una serie **a termini variabili** (ovvero $a_n$ cambia segno). Essa si dice **assolutamente convergente** se $\sum_{n=0}^{+\infty} {|a_n|}$ **converge**.

**Teorema**: se $\sum_{n=0}^{+\infty} {a_n}$ **converge assolutamente** allora $\sum_{n=0}^{+\infty} {a_n}$ **converge**.
Oss: se $\sum_{n=0}^{+\infty} {|a_n|}$ **diverge**, **non possiamo concludere nulla** sulla serie di partenza.

## Criterio di Leibnitz
Sia data la serie 
$$
\sum_{n=0}^{+\infty} {(-1)^n \cdot a_n} \ \ con \ a_n \geq 0
$$
supponiamo:
- $\lim_{n \rightarrow +\infty} a_n = 0$
- $(a_n)_n$ **decrescente**

allora $\sum_{n=0}^{+\infty} {(-1)^n \cdot a_n}$ **converge**.


# Calcolo integrale
Sia $f : [a, b] \rightarrow \mathbb{R}$ limitata. Suddividiamo l'intervallo $[a,b]$ in $n$ parti, individuando così i punti $x_0 = a, x_1, x_2,x_3,..., x_n-1 \ x_n = b, x_j = a + jh, h = \frac{b-a}{n}, j = 0,..., n$
$$
S_n = \frac{b-a}{n} \sum_{j=1}^{n} f(zj)
$$

Diciamo che $f : [a, b] \rightarrow \mathbb{R}$ limitata è **integrabile secondo Riemann** in $[a, b]$ se, considerata una qualsiasi somma $S_n$ definita in $S_n$ detta **somma di Cauchy-Riemann**
$$
\exists \lim_{n \rightarrow +\infty} S_n < +\infty
$$
che non dipende da $zj$. In tal caso si pone
$$
\lim_{n \rightarrow +\infty} S_n = \int_{a}^{b} f(x) \ dx
$$

## Classi di funzioni integrabili
- se $f : [a,b] \rightarrow \mathbb{R}$ è **continua**, allora $f$ è **integrabile**
- se $f : [a,b] \rightarrow \mathbb{R}$ è **monotona**, **limitata** allora $f$ è **integrabile**

**Teorema**: siano $f1 : [a,c] \rightarrow \mathbb{R}$ e $f2 : [c,b] \rightarrow \mathbb{R}$ integrabili. Allora
$$
f(x)
$$
- $f1(x) \ [a,c]$
- $f2(x) \ [c,b]$

è integrabile in $[a,b]$.

## Proprietà dell'integrale
Siano $f, g : [a,b] \rightarrow \mathbb{R}$ integrabili.
Valgono le seguenti proprietà:
- **linearità integrale**: siano $\alpha, \beta \in \mathbb{R}$
$$
\int_a^b (\alpha f(x) + \beta g(x)) \ dx = \alpha \int_a^b f(x) \ dx + \beta \int_a^b g(x) \ dx
$$
- **additività rispetto all'intervallo di integrazione**: sia $a \leq c \leq b$, allora
$$
\int_a^b f(x) \ dx = \int_a^c f(x) \ dx + \int_c^b f(x) \ dx
$$
- **positività e monotonia dell'integrale**:
$$
f \geq 0 \ in \ [a,b] \Rightarrow \int_a^b f(x) \ dx \geq 0
$$
$$
f \geq g \ in \ [a,b] \Rightarrow \int_a^b f(x) \ dx \geq \int_a^b g(x) \ dx
$$
  in particolare
$$
\left| \int_a^b f(x) \ dx \right| \leq \int_a^b |f(x)| \ dx
$$

## Teorema della media integrale
$f : [a,b] \rightarrow \mathbb{R}$ continua. Allora $\exists c \in [a,b]$ t.c.
$$
f(c) = \frac{1}{b-a} \int_a^b f(x) \ dx
$$
e si chiama **valor medio di $f$**.

## Primitiva di una funzione
Si dice che una funzione $G$, derivabile in $[a,b]$, è una **primitiva** di $f$ in $[a,b]$ se
$$
G'(x) = f(x) \ \forall x \in [a,b]
$$

## Integrale indefinito
Si chiama integrale indefinito:
$$
\int f(x) \ dx = \{ G(x) + c \ / G \text{ primitiva di } f, c \in \mathbb{R} \}
$$
## Teorema fondamentale del calcolo integrale
Se $f: [a,b] \rightarrow \mathbb{R}$ continua e sia $G(x)$ una sua primitiva. Allora
$$
\int_a^b f(x) \ dx = G(b) - G(a)
$$

## Primitive delle funzioni elementari
- $f(x) = c \Rightarrow G(x) = c \cdot x$
- $f(x) = x^\alpha \Rightarrow G(x) = \frac{x^{\alpha+1}}{\alpha+1}, \alpha \neq -1$
- $f(x) = \frac{1}{x} \Rightarrow G(x) = \log |x|$
- $f(x) = \sin x \Rightarrow G(x) = -\cos x$
- $f(x) = \cos x \Rightarrow G(x) = \sin x$
- $f(x) = e^x \Rightarrow G(x) = e^x$
- $f(x) = \frac{1}{1+x^2} \Rightarrow G(x) = \arctan x$
- $f(x) = \frac{1}{\cos^2 x} = 1 + \tan^2 x \Rightarrow G(x) = \tan x$




DA RIVEDERE:
- sviluppi di Taylor delle funzioni elementari
- teoria
- metodi di risoluzione degli integrali
- esercizio continuità e derivabilità