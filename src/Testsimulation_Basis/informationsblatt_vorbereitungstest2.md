# Informationsblatt zu Vorbereitungstest 2

Dieses Informationsblatt zeigt die Struktur und mögliche Inhalte einer Vorbereitungstestaufgabe. Es
enthält die Textbausteine, die auch in der Datei `angabe.md` beim Vorbereitungstest zu finden sein
werden. Konkret sind das:

- die Beschreibung der Domäne der Aufgabenstellungen. Die Beschreibung ist in diesem
  Informationsblatt allgemein gehalten. Beim Vorbereitungstest 2 wird die Beschreibung
  an manchen Stellen konkreter auf die Aufgabenstellung bezogen sein bzw. nicht zutreffende
  Teile werden nicht mehr aufscheinen.
- allgemeine Angabetexte und Hinweise, die genau so auch in der Datei `angabe.md` beim
  Vorbereitungstest 2 zu finden sein werden.

## EP2 Vorbereitungstest 2

### Allgemeine Hinweise

* Die Lösung Ihrer Aufgabe muss im vorgegebenen Projekt erfolgen.
* Verändern Sie keine der vorgegebenen Methodensignaturen.
* Implementieren Sie keine unnötigen Getter-/Setter-Methoden.
* Alle Objektvariablen müssen `private` sein.
* Von Ihnen zusätzlich erstellte Methoden in vorgegebenen Klassen müssen `private` sein. 
  Das gilt aber nicht für das Überschreiben von Methoden.
* Definieren Sie keine geschachtelten oder (anonymen) inneren Klassen, also keine Klassen, die
  in einer anderen Klasse, einem Objekt oder einer Methode stehen (Lambdas sind aber erlaubt).
* Auch für teilweise korrekte Lösungen werden Punkte vergeben.
* Sie dürfen zur Lösung dieser Aufgabe auf das Java-Collections-Framework und andere 
  standardmäßig vorhandene Interfaces und Klassen zurückgreifen.

## Information zur Domäne

Ein Mobile (`Mobile`) ist ein hängender Zimmerschmuck mit rekursiv verschachtelter Struktur: 
Horizontale Trägerstäbe (`Stick`) tragen Hängeelemente, die einfache Dekorationen (`Decoration`, 
z.B. Sterne (`Star`), Kugeln (`Ball`) oder andere geometrische Körper)
oder weitere Mobile-Elemente (`Mobile`) sein können. Daraus ergibt sich eine rekursive, 
hierarchische Baumstruktur. Manchmal kann in Mobiles die Anzahl der auf den Trägerstäben 
befestigten Hängeelemente variieren (Baum mit variabler Verzweigungsbreite). 
Entscheidend ist die mechanische Ausbalancierung jedes einzelnen Stabs: Die Anordnung, Masse und 
Abstände der Hängeelemente werden so gewählt, dass sich um den Aufhängepunkt ein statisches 
Drehmomentgleichgewicht einstellt.

Die folgende Zeichnung zeigt ein Beispiel eines Mobiles mit drei Trägerstäben und Sternen (`*`) 
und Kugeln (`o`) als Dekorationen. Die Zahlen stellen die Gewichte der Komponenten dar. Das 
Gesamtgewicht des Mobiles ist 40. 

```txt
                       |
                +------5------+----+
                |             |    |
       +--------2--+--+       *    o
       |           |  |       12   5
       |           |  o
       *           |  2
       7           |
                +--1--+
                |     |
                *     *
                3     3
```

## Aufgabenstellung

Hier werden Sie eine an den Test angepasste Auflistung aller relevanten Dateien finden:

* `ApplicationTest2.java`
* `MCTest2.java`
* ...

Im Praxisteil des Tests sollen die hier aufgelisteten Dateien bearbeitet werden:

* ...

### Teilaufgabe 1 (maximal 25 Punkte)

Absolvieren Sie den Multiple-Choice-Test. Um die MC Fragen zu beantworten, editieren Sie die
Datei `MCTest2.java` und befolgen Sie die Anweisungen aus den Kommentaren in der Datei. Wenn Sie
`MCTest2.java` ausführen, bekommen Sie eine Fehlermeldung, falls inhaltlich relevante Textteile
verändert wurden; ohne Fehler werden Ihre Antworten auf die Fragen aufgelistet.

### Teilaufgabe 2 (maximal 75 Punkte)

Lösen Sie den Praxisteil. Hier werden Sie weitere an den Praxisteil des Tests angepasste
Fragestellungen und Hinweise finden.

English translation: Solve the practical programming part. Here you will find an English
translation of tasks and hints adapted to the practical part of the specific test.

Vervollständigen Sie die Klassen in den oben aufgelisteten Dateien bitte wie in den Kommentaren
beschrieben an den mit `TODO` gekennzeichneten Stellen. Alle anderen gegebenen Dateien (außer
`MCTest2.java` und `ApplicationTest2.java`) sind bereits vollständig und dürfen nicht verändert
werden.

Die Klasse `ApplicationTest2` enthält Testfälle mit Soll-Ausgaben als Kommentare. Neben diesen
Testfällen müssen auch alle Kommentare in den gefragten Klassen zutreffen. Die Klasse
`ApplicationTest2` fließt nicht in die Beurteilung ein, Sie können diese Datei nach Belieben ändern.
