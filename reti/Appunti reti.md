# HTTP
Protocollo **client-server**, il cui socket di benvenuto è ospitato sulla **porta 80**.
Caratteristiche:
- **stateless**: le richieste e le risposte non ricordano la storia della sessione precedente;
- corpo codificato con standard **MIME**: es. text/html, image/gif eccetera;
- Basato sul **protocollo di trasporto TCP**: l'HTTP è *orientato alla connessione*;

## diverse versioni
- 1.0: versione **iniziale**, ogni richiesta-risposta è svolta su **connessioni TCP diverse**;
- 1.1: versione la cui caratteristica principale è la **persistenza della connessione TCP**. Dopo uno scambio di richiesta-risposta non viene chiusa la connessione, ma **rimane aperta** per accettare **eventuali nuove richieste** o per inviare (**pipelining**) file, come immagini e altri tipi di documenti, al client riferiti al documento HTML inviato. La connessione viene chiusa dopo un periodo di inattività configurato dal server;

## Formato di richiesta HTTP
- **Request header line**: riga iniziale del pacchetto
	- **metodo HTTP**: GET, POST, ecc;
	- **identificatore** della **risorsa**;
	- **versione HTTP**;
- **Header fields**: informazioni aggiuntive riguardanti la richiesta
	- From: indirizzo email;
	- User-Agent: browser che effettua la richiesta;
	- Accept: lista di tipi MIME accettabili;
	- ecc;
- **Linea vuota**;
- **Body**: il corpo della richiesta. Viene usato per passare informazioni non predefinite al server (come nel caso di richieste POST);

### Esempio di richiesta HTTP:
```http
GET directory/pagina.html HTTP/1.1
User-Agent: curl/8.6.0
Accept: */*

```


## Formato di risposta HTTP
- **Response header line**: riga iniziale del pacchetto
	- **versione HTTP**;
	- **codice**: codice che determina il risultato della richiesta (200 OK, 400 bad request ecc);
- **Header fields**:
	- MIME Version: versione MIME per codificare il messaggio;
	- Server: software usato per il server;
	- Date: data e tempo di origine del messaggio;
	- Content-Type: tipo MIME usato per il corpo;
	- Content-Length: lunghezza in byte del corpo;
	- ecc;
- **Riga vuota**;
- **Body**: corpo della risposta, spesso il codice HTML della pagina richiesta;

### Esempio di risposta HTTP:
```http
HTTP/1.1 200 OK
Content-Type: text/html
Server: Apache
Date: Fri, 21 Jun 2024 12:52:39 GMT

<!DOCTYPE html>
<html>
...
```

# Proxy server
Agisce come **intermediario**, svolge operazioni per conto di entità remote. È fornito di un sistema di **controllo e filtraggio delle richieste** e un meccanismo di **caching** che, attraverso **GET condizionali**, **evita** di effettuare **richieste ridondanti** ai web server, **diminuisce i tempi** di risposta e **riduce il traffico**, poichè il proxy salva le pagine richieste nella cache e controlla periodicamente la disponibilità di aggiornamenti.

# DNS
Protocollo internet riguardante la **traduzione (risoluzione) da nome simbolico a indirizzo IP**. Esso è basato su un **database distribuito organizzato in maniera gerarchica**, suddiviso in domini gestiti da uno o più name server. Ogni name server conosce:
- i nomi/indirizzi all'interno della propria zona;
- i server dei propri sottodomini;
- il server root;
In base alla gerarchia dei vari name server distribuiti nel mondo possiamo distinguere diverse categorie:
- **Root server**: sono 13 e sono al vertice della gerarchia, gestiti da diverse organizzazioni. Forniscono gli indirizzi dei TLD;
- **T**op **L**evel **D**omain: si occupano di domini di primo livello "generici" (com, net, org ecc.) o relativi ai paesi (it, fr, uk ecc.). Forniscono gli indirizzi dei server autoritativi;
- **Authoritative**: gestiti dalle varie organizzazioni che possiedono host accessibili via internet;
## Risoluzione dei nomi
La risoluzione dei nomi può avvenire in maniera:
- **Iterativa**: il server DNS locale effettua richieste ai vari server della gerarchia; se essi non possiedono la risposta finale, inviano al DNS locale il riferimento a chi potrebbe conoscerla. A questo punto il DNS locale chiederà al server consigliato dal precedente e, attraverso questa catena di suggerimenti, arriverà al name server contenente la risposta attesa;
- **Ricorsiva**: è il caso della comunicazione tra host e name server locale. L'host effettua la richiesta al server DNS, delegando tutte le operazioni di risoluzione a lui.
Ricordiamo che i name server sfruttano un meccanismo di caching che conserva i risultati delle query DNS entro un certo TTL (time to live) che, una volta scaduto, cancellerà la query dalla cache poichè troppo vecchia e potrebbe necessitare di aggiornamenti.

## Servizi forniti
- **Risoluzione dei nomi**: traduzione del nome simbolico in indirizzo IP;
- **Host aliasing**: Associazione dei diversi alias al nome canonico;
- **Mail server aliasing**: Associazione degli alias al nome canonico, nel caso di indirizzi email;
- **Load distribution**: I nomi simbolici vengono associati a diversi indirizzi IP in modo da distribuire il traffico su diversi server nei casi di pagine ad alto traffico utilizzando algoritmi di rotazione;

## Descrittori di risorsa (resource records)
```DNS
<Name, Value, Type, Class, TTL>

ex (type A record):
<parnas.di.uniba.it, 193.204.187.146, A, IN, 30000>
```

- **Name**: nome simbolico dell'host a cui il record fa riferimento;
- **Value**: cambia in base al tipo del record:
	- Tipo **A-AAAA**: indirizzo IPv4/IPv6 corrispondente;
	- Tipo **MX**: nome del mail server che accetta messaggi per il dominio specificato;
	- Tipo **CNAME**: nome canonico per l'host;
	- Tipo **NS**: nome del name server a cui inoltrare la richiesta;
- **Type**: tipo del record (spiegati sopra);
- **Class**: permette di definire dei tipi;
- **TTL**: tempo di validità del descrittore;

Ogni server DNS possiede un record **SOA** (**Start Of Authority**), che contiene **informazioni importanti sul dominio**, come riferimenti all'amministratore, ultimo aggiornamento del dominio e altro.

# Indirizzamento dei processi e porte nel livello di trasporto

- **Multiplexing/Demultiplexing:** Il livello di trasporto permette la convivenza di più applicazioni su un host inviando i flussi al processo corretto;
- **Numeri di Porta:** Identificativi a **16 bit** locali all'host. Il kernel di destinazione legge la porta e recapita il segmento/datagramma al processo;
- **Assegnazione:** Esistono fasce di porte riservate, altre per l'assegnazione automatica ai client e altre destinate ai processi utente.

## UDP: Semplicità e Minimo Overhead

- **Servizio:** Connectionless (senza connessione);
- **Funzionamento:** Il mittente costruisce un datagramma, specifica la coppia **(IP, Porta)** del destinatario e lo invia;
- **Affidabilità:** Non garantita (nessun ordine, nessuna conferma/ACK, nessun controllo di flusso);
- **Errori:** Rilevazione opzionale tramite **Checksum**;
- **Vantaggi:** Overhead minimo e bassa latenza. Ideale per scambi richiesta-risposta semplici, telemetria o applicazioni che tollerano perdite gestendo la logica internamente.

### Formato del Segmento UDP
Campi principali dell'**header UDP**:
- **Numeri di porta (client/server)**: Identificano con precisione il servizio/canale che si utilizza;
- **Lunghezza header UDP**;
- **Checksum**: per verificare la correttezza del segmento.

## TCP: Stream Affidabile e Full-Duplex
- **Servizio:** Orientato alla connessione e affidabile;
- **Comunicazione:** Punto-punto e Full-Duplex (invio e ricezione parallela tra due endpoint);
- **Gestione Flusso:** L'applicazione scrive un flusso continuo di byte; TCP lo segmenta in unità adatte al livello sottostante e lo riassembla nell'ordine corretto a destinazione.

### Ritrasmissione e Temporizzazione
- **Meccanismo:** TCP attende un **ACK** per ogni segmento. Se il timer di ritrasmissione (**RTO - Retransmission Timeout**) scade, il segmento viene reinviato;
- **RTO Dinamico:** Stimato in base al **RTT (Round-Trip Time)** misurato, per bilanciare reattività ed efficienza.

### Controllo di Flusso
- **Obiettivo:** Impedire che il mittente sovraccarichi il buffer del destinatario;
- **Finestra:** Il ricevitore annuncia una **Advertised Window** (spazio libero nel buffer);
- **Sliding Window:** Schema a finestra scorrevole che avanza con l'arrivo dei riscontri e il consumo dei dati da parte del destinatario;
- **ACK Cumulativi:** Confermano tutti i byte fino a una determinata sequenza;
- **Effective Window:** Quantità di dati effettivamente inviabile; se $\le 0$, il mittente attende o sonda la rete.

### Controllo di Congestione
- **Logica:** TCP interpreta la perdita di pacchetti come sintomo di congestione della rete (non solo del ricevitore);
- **Azione:** Modula la velocità di invio per prevenire il collasso della rete, riducendo l'invio in caso di problemi e aumentandolo se la rete è libera.

### Gestione della Connessione TCP
- **Apertura:** Avviene tramite **Three-way Handshake** (3 segmenti con flag **SYN**) per concordare i numeri di sequenza iniziali in entrambe le direzioni;
- **Chiusura:** Ordinata, avviene in 4 segmenti (flag **FIN**) per garantire che i dati in transito non vadano persi.

### Formato del Segmento TCP
Campi principali dell'**header TCP**:
- **Numeri di porta (client/server)**: Identificano con precisione il servizio/canale che si utilizza;
- **Sequence Number:** Identifica il primo byte del segmento nel flusso;
- **Numero di Riscontro (ACK):** Indica il prossimo byte atteso dal ricevitore, dando conferma di ricezione dei precedenti;
- **Finestra:** Dimensione del buffer pubblicata dal ricevitore;
- **Flag:** Coordinano apertura, chiusura e controllo della sessione.

# Routing
La funzione di **instradamento** (routing) è gestita a **livello di rete** dai router mediante **routing table**. La topologia della rete può essere rappresentata come un grafo, formato dai nodi (host e router) e archi (collegamenti).

## Classificazione degli algoritmi di routing
- Routing **statico**: detto anche non adattivo, la scelta dei cammini è calcolata in anticipo e memorizzata in memorie non volatili;
- Routing **dinamico**: detto anche adattivo, la scelta dei cammini è elaborata secondo i cambiamenti della rete;
- Routing **globale**: l'algoritmo riceve in ingresso tutti i collegamenti tra nodi e i loro costi;
- Routing **decentralizzato**: nessun nodo possiede informazioni complete sulla rete, il cammino a costo minimo è calcolato iterativamente e in modo distribuito;

### Algoritmo del vettore distanza (Distance Vector Routing)
- **Algoritmo dinamico** e **decentralizzato**;
- Implementato dal protocollo **RIP** (**Routing Information Protocol**);
- Ogni router mantiene una tabella contenente la miglior distanza (costo) conosciuta per ogni destinazione e quale canale usare per raggiungerla;
```
Esempio di routing table che implementa DVR:

Destination   Cost   Next Hop
A             1      A
C             1      C
D             2      C
```

#### Come funziona?
- **Stato iniziale**: ogni nodo conosce i costi dei collegamenti a nodi adiacenti, tutti gli altri hanno costo infinito;
- **Periodicamente/Aggiornamento tabella**: ogni nodo **spedisce e riceve** **aggiornamenti** a/da i suoi nodi adiacenti, ogni aggiornamento è un vettore distanza (Destination, Cost). Se un nodo riceve un **cammino migliore** rispetto a quello salvato nella sua tabella, **lo aggiorna** (sommando il costo minore al costo del nodo che lo ha proposto, es: se B impiega 1 per raggiungere C e questo dato viene inviato ad A, che impiega 1 per raggiungere B, allora verrà aggiornata il vettore A-C con costo 1+1 ovvero A -> B -> C) e **prende nota**, come next hop, **del nodo che lo ha proposto**;
- **Interruzione collegamento**: viene eseguito un **aggiornamento collettivo** delle tabelle per ritornare **stabile**;
Si possono verificare casi in cui, dopo la caduta di un collegamento, si creino **cicli infiniti** dove il percorso "rimbalza" tra nodi e non raggiungerà la destinazione. Come si risolve?
- **Poisoned reverse**: quando un nodo vede che il suo collegamento con l'altro nodo è caduto, avvisa il nodo successivo di non passare da lui durante i percorsi successivi. Non risolve i loop in caso di cicli tra più di 2 nodi;
- **Split horizon**: I nodi non aggiornano informazioni dei nodi da cui hanno ricevuto quell'informazione (se un nodo A sa che per passare a C deve passare da B, B non può dire di dover passare da A per andare a C, visto che A fa affidamento a lui per trovare il percorso);

### Algoritmo dello stato della connessione (Link-State routing)
- **Algoritmo dinamico** e **globale**;
- Implementato dal protocollo **OSPF** (**Open Shortest Path First**);
-  Distribuzione affidabile a tutti i nodi delle informazioni sullo stato dei collegamenti;
  - Calcolo presso ciascun nodo del cammino minimo verso una destinazione;
#### Come funziona?
Si **spediscono a tutti** i nodi le **informazioni sui propri collegamenti diretti** tramite una tattica di "**reliable flooding**": i nodi inviano su tutte le linee in uscita le informazioni sui collegamenti diretti, che vengono **a loro volta propagate** a tutte le linee di uscita dei riceventi, finchè tutte le informazioni non sono propagate **a tutti i nodi** della rete.
Le informazioni sui collegamenti scambiate tra i vari nodi sono rappresentate dal **pacchetto di stato della connessione** (**Link State Packet, LSP**).
Struttura di un **LSP**:
- **ID del nodo** che ha creato l'LSP;
- **Costo del collegamento** per ogni **nodo adiacente**;
- **Sequence number**;
- **TTL**.
Il **reliable flooding** consiste nel:
- **Memorizzare l'LSP più recente**;
- Se si riceve un **LSP** con **sequence number maggiore,** **si propaga** il pacchetto a tutti i nodi eccetto a quello da cui l'ha ricevuto;
- **Generare periodicamente un nuovo LSP** incrementando il sequence number;
- A ogni reboot **inizializzare il sequence number a 0**;
- **Decrementare TTL di ogni LSP** memorizzato, scartando quelli con TTL 0.
Per il calcolo del cammino minimo viene utilizzato l'**algoritmo di Dijkstra**.

### Routing gerarchico
Al **crescere del numero di nodi** della rete il **tempo** richiesto dal routing diventa **proibitivo** e per risolvere la questo problema, la rete viene **suddivisa in regioni**, dette **sistemi autonomi** (AS), organizzati **gerarchicamente**. Ovviamente, questa soluzione prevede una suddivisione logica tra instradamento all'interno di un AS (Internal Gateway) e instradamento tra vari AS (Exterior Gateway).
I protocolli utilizzati per il routing interno ad un AS (Interior Gateway Protocols) sono:
- **Routing Information Protocol** (RIP): basato sul distance vector routing;
- **Open Shortest Path First** (OSPF): basato sul link state routing.
Il protocollo utilizzato per il routing tra AS (Exterior Gateway Protocols) è:
- **Border Gateway Protocol** (BGP).

# Internet Protocol (IP)
Ci sono due tipi di instradamento dei pacchetti:
- **Virtual circuit**: **orientato alla connessione**, viene **stabilito il percorso** (e fisicamente "occupato" dalla connessione) e **tutti i pacchetti** relativi a quella connessione **seguiranno il percorso** stabilito;
- **Datagram**: **non orientato alla connessione**, ogni pacchetto segue un **percorso differente**. Può accadere che i pacchetti **non arrivino in ordine/non arrivino affatto**.

Il **protocollo IP** Fornisce un metodo **best-effort** per trasportare **datagrammi** dalla sorgente alla destinazione, **indipendentemente dall'esistenza di reti intermedie** lungo il percorso.
Caratteristiche:
- **Non orientato alla connessione**;
- **Non affidabile**;
- **Frammentazione**: per adattarsi all'**MTU** (**unità massima di trasmissione**, diversa per ogni tipo di collegamento) i datagrammi IP possono essere **frammentati**, arrivando a frammenti di dimensione massima di 64 KB, per poi essere riassemblati una volta raggiunto l'host di destinazione.

## Formato datagramma IP
I campi principali dell'header IP sono:
- **Version**: indica la versione (IPv4/IPv6);
- **Lunghezza header**;
- **Lunghezza datagramma**;
- **Offset di frammentazione**: utile a **ricostruire il pacchetto** a destinazione;
- **TTL**;
- **Checksum**;
- **Indirizzi IP di mittente e destinatario**;

# DHCP
Il **DHCP** è un protocollo client-server che permette la **configurazione automatica degli host** (plug-and-play). Fornisce parametri essenziali: IP dinamico (a rinnovo periodico tramite **lease**), subnet mask, default gateway e server DNS.

## Funzionamento (Processo DORA):
- **Discover:** L'host invia un broadcast per individuare i server DHCP attivi.
- **Offer:** Il server risponde con una proposta di configurazione e relativo tempo di lease.
- **Request:** L'host accetta l'offerta inviando una richiesta formale (in broadcast per notificare tutti gli eventuali server DHCP sulla rete che la loro offerta non è stata accettata).
- **ACK:** Il server conferma l'assegnazione e il client configura l'interfaccia.
- **Rinnovo:** Prima della scadenza del lease, l'host contatta il server per estendere la durata della locazione dell'IP.

# NAT
Il **Network Address Translation** è un **meccanismo** che consente di **mappare gli indirizzi di reti private**, includendo eventuali sottoreti, **ad un unico indirizzo IP pubblico**, **risparmiando** così **indirizzi** assegnabili e contemporaneamente **nascondendo la topologia della rete interna** **non permettendo** agli host di essere contattati **direttamente** dall'esterno. Il traffico di ritorno è reindirizzato correttamente ai vari host attraverso l'utilizzo di una **NAT Table**, che conserva al suo interno le **associazioni "indirizzo-porta interni" -> "indirizzo-porta esterni"**.

# Sicurezza di rete
La **sicurezza di una rete** **non** viene realizzata attraverso un **singolo meccanismo**, ma attraverso una **serie di strumenti e pratiche** che consentono la protezione dei servizi, degli individui e dei dati.
## Proprietà fondamentali (**CIA**):
- **Riservatezza** (**Confidentiality**): solo i comunicanti devono **comprendere il contenuto** dei messaggi scambiati. Implementata attraverso **crittografia** e **meccanismi di autenticazione**;
- **Integrità** (**Integrity**): i comunicanti devono essere sicuri che il contenuto dei messaggi **non subisca alterazioni** durante la trasmissione. Implementata attraverso **checksum** e **ridondanza**;
- **Disponibilità** (**Availability**): i servizi devono essere **accessibili a chi è legittimamente autorizzato**. Implementata attraverso **ridondanza HW/SW** e **continuità operativa**.

## Altre proprietà
- **Autenticità** (**autenticazione**): l'**identificazione univoca e certa di un host**. Può essere **semplice** (solo mittente) o **mutua** (sia mittente che destinatario);
- **Non ripudio**: proprietà garantita attraverso la presenza di **integrità** e **autenticità**, consiste nella **prova formale** che una certa persona ha **sottoscritto** un documento.

==Aggiungere descrizioni dei diversi tipi di attacco informatico dal file di Giorgio==

# Firewall
Solitamente implementato nei router e nei singoli host, il firewall è l'**unico punto di connessione** tra una rete privata e il resto di internet. Esso si occupa di **filtrare il traffico** di rete attraverso delle **Access Control Lists** (**ACL**). Può essere di tre tipi:
- a filtraggio di pacchetti (**packet filter**): il firewall decide se consentire o negare l'accesso ai singoli pacchetti in entrata o uscita in base a diversi criteri: IP sorgente e destinazione, porte sorgente e destinazione, tipo di messaggio ICMP e bit TCP SYN o ACK. La **tipica configurazione** è quella di eliminare tutti i pacchetti non esplicitamente consentiti (**default deny policy**);
- a filtraggio di pacchetti con memoria dello stato (**stateful filter**): il firewall traccia lo stato di ogni connessione TCP. Questo consente al firewall di decidere se i pacchetti in entrata/uscita "hanno senso" in base allo stato della connessione;
- a livello applicazione (**application gateway**): permette il filtraggio basandosi sul protocollo applicativo. Può essere usato in combinazione con un packet filter per escludere determinati host dall'inizializzare connessioni di un determinato protocollo applicativo.

# IDS
I **sistemi di rilevamento delle intrusioni** **esaminano** il contenuto dei pacchetti su **più livelli**, rilevando un'ampia gamma di attacchi. Essi sono di due tipi:
- **basati sulle firme**: richiedono una **conoscenza pregressa dell'attacco**, individuano gli attacchi attraverso un **database di firme**, che rappresentano l'**insieme di regole associate ad attività di intrusione**;
- **basati su anomalie**: notano **flussi di pacchetti insoliti** creando un **profilo di traffico in situazioni normali**. A differenza degli IDS basati su firme **non fanno affidamento alla conoscenza di attacchi già avvenuti**.

# Crittografia
**Procedimento** che consiste nella **cifratura** e **decifratura** di messaggi basato su **funzioni parametriche**. La segretezza della cifratura dipende dalla **segretezza della chiave** piuttosto che segretezza dell'algoritmo.
**Tecniche per trasformare** il testo in chiaro in testo cifrato:
- **Sostituzione**: ogni elemento del messaggio in chiaro è **trasformato** in un altro elemento;
- **Trasposizione**: gli elementi del messaggio sono **riorganizzati**;
**Tipi di algoritmi** di crittografia:
- **Simmetrico**: nel caso di utilizzo di una **sola chiave**, valida per cifratura e decifratura;
- **Asimmetrico**: nel caso di utilizzo di una **coppia di chiavi**, quindi chiavi diverse per cifratura e decifratura. Questo tipo di algoritmi è più costoso computazionalmente rispetto agli algoritmi simmetrici;
**Come** può essere **elaborato** il testo in chiaro:
- **A blocchi:** il messaggio è suddiviso a blocchi di **dimensione fissa**, la funzione agisce su ogni blocco;
- **A flusso**: la funzione può elaborare messaggi di **lunghezza arbitraria**.

## Crittoanalisi
Processo in cui si tenta di **risalire al testo in chiaro o alla chiave usata**. Gli algoritmi di cifratura sono **progettati per resistere ad attacchi di brute-forcing**. Un sistema di cifratura è detto **computazionalmente sicuro** se:
- il **costo** per rendere inefficace il cifrario supera il valore dell'informazione cifrata;
- il **tempo richiesto** per rendere inefficace il cifrario supera l'arco temporale in cui l'informazione è utile.

Nelle comunicazioni viene usato un **mix** dei due tipi di algoritmi di cifratura:
- Si usa la **crittografia asimmetrica** per lo **scambio della chiave di sessione**;
- Si usa la **chiave di sessione**, concordata a priori, per **cifrare e decifrare i messaggi** usando **algoritmi simmetrici**.
In questo modo si **tutela la riservatezza** della comunicazione, ma se volessimo garantire integrità e autenticità?

## Funzione hash crittografica
Usata per verificare l'integrità di un messaggio. Questa funzione prende in input il messaggio (di lunghezza variabile) e produce come output una stringa di lunghezza fissa, chiamata **message digest**. La funzione di hash è sicura se è:
- **libera da collisioni**: computazionalmente **impossibile trovare due messaggi** tali da produrre **digest uguali**;
- **unidirezionale**: dato il digest, è **impossibile determinare il messaggio iniziale**.

### Message autentication code (MAC)
Nel concreto, per garantire l'**integrità** e **autenticità** (**solo tra le due parti**) del messaggio:
- Alice **crea il messaggio** e **calcola il MAC (dando in input lo shared secret concordato in precedenza e messaggio)**;
- Alice **concatena al messaggio il tag (il digest del MAC)**, creando un messaggio esteso che viene inviato a Bob;
- Bob riceve il messaggio esteso e **calcola il tag del messaggio iniziale usando la chiave (shared secret) concordata**;
- Se il **tag prodotto corrisponde a quello concatenato** nel messaggio di Alice, **il messaggio non è stato alterato**.

### Firma digitale
La **firma digitale** consiste nell'utilizzo di una **coppia di chiavi**, una chiave **pubblica** e una **privata**, possedute da **ogni host**. A differenza del MAC, utilizzare la firma digitale garantisce il **non ripudio** (poichè la **coppia di chiavi è univoca** per ogni host). Gli **hash** dei messaggi vengono **cifrati** utilizzando la **propria chiave privata** e **decifrati** usando la **chiave pubblica**, e in questo modo è possibile **garantire il non ripudio**. Le **Certification Authority** (**CA**) sono dei **soggetti terzi di fiducia** che si occupano di **identificare in modo certo** chi **richiede una certificazione** della propria **chiave pubblica**. Le CA, dopo aver accettato la richiesta di certificazione, **generano il certificato firmandolo con la propria chiave privata**. Colui che riceverà la certificazione la **invierà durante le connessioni** per **garantire la propria identità**.

## Sicurezza nella pila di protocolli di internet
È possibile individuare **meccanismi di sicurezza** in **diversi livelli** della pila TCP/IP. A livello **applicazione**, ad esempio, è necessario garantire **riservatezza, autenticazione dei comunicanti e integrità dei messaggi**. Un esempio di programma di sicurezza per il livello applicativo è **PGP** (**Pretty Good Privacy**), che assicura:
- **Riservatezza**;
- **Integrità**;
- **Autenticazione** mittente.

Al livello di **trasporto** i sistemi di sicurezza, diventati **standard**, usati sono **SSL** (**Secure Socket Layer**) e **TLS** (**Transport Layer Security**). Essi garantiscono:
- **Riservatezza**;
- **Integrità**
- **Autenticazione del server**;
- Autenticazione del client (opzionale).
**SSL prevede**, dopo la fase di handshaking TCP, **una sua fase di handshake**, nella quale il **client richiede la certificazione del server** e **insieme concordano i parametri, gli algoritmi di cifratura usati e vengono generate le chiavi** di sessione e MAC **partendo da uno shared secret**.

A livello di **rete**, i sistemi di sicurezza sono implementati dal framework **IPSec**. I protocolli principali usati da IPSec per gestire la sicurezza dei dati sono:
- **AH** (**Authentication Header**): fornisce **integrità** e **autenticazione** dell'origine ma **non garantisce riservatezza**;
- **ESP** (**Encapsulating Security Payload**): garantisce **riservatezza**, **integrità** e **autenticazione**;
IPSec funziona in due modalità:
- **trasporto**: usato per comunicazioni **end-to-end**, viene **cifrato solo il payload** del pacchetto, ma non l'header IP;
- **tunnel**: il **pacchetto originale viene cifrato e incapsulato in un nuovo pacchetto IP**. Il nuovo header mostra gli **indirizzi dei gateway**. Usato per comunicazioni tra router o VPN.
La **gestione delle chiavi** è implementata attraverso **scambi**:
- **manuali**;
- **automatici**: attraverso **Internet Security Association** (**SA**) e **Key Management Protocol** (**ISAKMP**).