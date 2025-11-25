## Tipo 2
Supponiamo, per assurdo, che L sia libero da contesto. Per il pumping lemma per i linguaggi liberi, $\exists p \in \mathbb{N} : \forall z \in L, |z| \geq p \rightarrow z = uvwxy$ con le seguenti proprietà:
- $|vwx| \geq p$;
- $vx \neq \lambda$;
- $\forall i > 0: uv^iwx^iy \in L$.

Scegliamo una parola in $L$
$$ \text{scegliamo z in funzione di p, trovando la parola più vicina al vincolo.} $$
Analizziamo i diversi casi:
$$ \text{nonostante i linguaggi siano diversi, i casi sono sempre uguali.}$$
1) $a^k$, pompiamo o depompiamo.
2) $b^k$, pompiamo o depompiamo.
3) $c^k$, pompiamo o depompiamo.
4) suddiviso in 3 casi:
	1) $v \neq \lambda, x = \lambda$: analogo al caso 1;
	2) $v = \lambda, x \neq \lambda$: analogo al caso 2;
	3) $v \neq \lambda, x \neq \lambda$: da sviluppare.
5)  suddiviso in 3 casi:
	1) $v \neq \lambda, x = \lambda$: analogo al caso 2;
	2) $v = \lambda, x \neq \lambda$: analogo al caso 3;
	3) $v \neq \lambda, x \neq \lambda$: da sviluppare.

se i casi del pumping lemma non bastano per dimostrare che $L \notin \mathcal{L_2}$, si ricorre al metodo delle lunghezze.
### metodo delle lunghezze (brevemente)
si confronta la lunghezza della parola pompata con quella della parola successiva al linguaggio. se
$$|z'| \neq |succ \ z|$$
allora abbiamo dimostrato che $L \notin \mathcal{L_2}$.

# Tipo 3
Supponiamo, per assurdo, che L sia lineare destro. Per il teorema di Kleene, $\mathcal{L_3} \equiv \mathcal{L_FSL} \equiv \mathcal{L_REG}$. Quindi $\exists M = (Q, \delta, q_0, F$) t.c. $L = T(M)$.
ecc.