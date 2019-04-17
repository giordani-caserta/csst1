# csst
Gestionale "Centro Studi"

DOCUMENTAZIONE DEL PROGETTO
Il contesto di riferimento per questo progetto software in Java è un ente di
formazione privato che eroga corsi di vario tipo ai propri iscritti.
Il progetto si propone di mostrare le basi dei controlli delle interfacce in
Java Swing raggruppandoli in schede ed in un layout comune user-friendly.
L'idea è quella che in ciascuna scheda è possibile visualizzare, inserire,
modificare e cancellare un elemento di un entità del contesto trattato.
 
Scheda del Form principale "Corsi"
----------------------------------
La scheda si presenta con una tabella sulla sinistra che visualizza un elenco
di tutti i Corsi e sulla sinistra i controlli necessari a gestire un corso
(da completare).
In seguito sarà aggiunta una tabella sottostante ai controlli suddetti con
l'obiettivo di mostrare gli allievi iscritti al corso selezionato nella tabella
dei Corsi suddetta e per ciascuno di essi sarà possibile avere il rimando al
dettaglio dell'Allievo col doppio click.

Scheda del Form principale "Allievi"
------------------------------------
La scheda, con un layout analogo alla scheda predente, propone la gestione di
tutti gli allievi (da realizzare).
In seguito sarà aggiunta anche in questo caso una tabella che mostrerà i corsi
frequentati dall'allievo selezionato e per ciascuno di essi sarà possibile avere
il rimando al dettaglio del Corso col doppio click.

Scheda del Form principale "Note e Promemoria"
----------------------------------------------
Questa scheda, pur rispettando il layout delle precedenti, propone delle
funzionalità aggiuntive al software estremamente utili in qualunque contesto
ossia Note e Promemoria. Quest'ultimi sono sempre delle Note ma con l'allarme
impostato su una data ed un tempo per ricevere un avviso al raggiungimento di
tale data e tempo.
Per impostare la Data ed il Time dell'allarme di un Promemoria si è fatto
ricorso ad un controllo Spinner basato sul modello Date e Time.
I Promemoria sfruttano i Thread del linguaggio e pertanto il software attraverso
la classe del Form principale implementa l'interfaccia Runnable e quindi
il metodo run() che contiene un loop infito con l'obiettivo di controllare
nell'elenco delle Note e Promemoria quali di quest'ultimi sta per scadere il
proprio allarme e attivare il relativo avviso.
Tale controllo è di per se un Thread indipendente dal resto del programma tant'è
che è possibile adoperare il programma normalmente.
Per avviare il Thread basato sulla classe del Form principale, alla fine del
metodo WindowOpened di tale Form è riportata l'istruzione opportuna.
Al momento, però, non è stata realizzata la generazione dell'avviso in base
all'elenco ma solo in base alla data impostata nel controllo Date e Time.
Quando sarà realizzata correttamente tale funzionalità, è opportuno che
i Promemoria di cui è già stato mostrato l'avviso vengano trasformati in
semplici Note rimuovendo l'allarme.