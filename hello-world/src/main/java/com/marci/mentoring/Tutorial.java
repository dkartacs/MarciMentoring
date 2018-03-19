//A package a java programban olyan mint a könyvtár a file rendszerben. Ezzel rendezzük a hasonló, valamilyen logika
//alapján össze tartozó classokat. Általábban hasonlóan néznek ki mint egy fordított url. Pontokkal vannak elválasztva
//a "könyvtár" nevek egymástól és a file rendszeren egy hasonló nevű könyvtár struktúrába rakjuk a calss filet mint
//amilyen packageben van. Ez a file a com.marci.mentoring packageben van és valóban a com/marci/mentoring könyvtárban
//található.
//A java file package-hez rendelése a package kulcsszóval történik.
//Read this: https://en.wikipedia.org/wiki/Java_package
//Then read every page in this: https://docs.oracle.com/javase/tutorial/java/package/index.html
package com.marci.mentoring;

//Amikor szeretnénk egy olyan java classt felhasználni, ami nem ugyan abban a könvtárban (packageben) található, mint ez
//akkor azt importálnunk kell. Ez az import kulcsszóval történik. A Match java class, amit készítettem
//, a com.marci.mentoring.util packageben van tehát ez a class nem látná, hogy létezik. Ezért importáljuk, hogy tudjuk
// használni
//Ez után már ha beírom a kódba hogy "Math" ezt a java classt fogja érteni alatta a fordító.
//Read this: http://beginwithjava.blogspot.hu/2008/06/import-statements.html

import com.marci.mentoring.util.Math;

//////////////////////////////////////////////////////// Intro /////////////////////////////////////////////////////////
//A java kód a következő 5 építő köből áll, mindegyikről írok részletesen lentebb, csak innentől már csak angolul hívom őket:
// class, interface, enum: osztály, interface vagy enumeráció definició, ezek nevesített kódblockok.
//  Ezekbe írjuk a kódunkat. Egyelőre csak az osztályről (class) fogunk beszélni.
//
// function: funkció vagy metódus definició, ezek kisebb nevesített kódblockok
//  ami egy classnak vagy egy interfacenek egy kisebb része ami futtatható.
//  A classunk mőködését ilyen funkcióban írjuk le.
//
// variables: változó definiciók. Ahogy közép iskolában egy x vagy y egy változót jelentett, amihez értéket rendeltünk
// programozásban ugyen az a koncepció. Javaban az értéken kívül még a típusát is meg kell mondani egy változónak. Tehát
// hogy ő egy szám vagy szöveg etc...
//
// statements: Müveletek és funkció hívások. "x = y + 1" például egy művelet.
//
// controll flow: elágazások a programban. ezek például a feltételek mint az "if" vagy ciklusok mint a "for"
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Minden java program alap építő köve a class. Ezt a class kulcsszóval hozzuk létre, melyet a class neve követt.
//A class neve után jön a kódblokk amit ebbe a classba akarunk tenni. Egy kódblokk ami {} zárójelek között van.
//A class egy tervrajz, a java fordítónak, hogy hogyan készítse el a programunkat.
//A class-ból fogunk később objektumokat/példányokat létrehozni.
//Úgy lehet elképzelni hogy a class a ház tervrajza, míg az objektum a már kész, felépített ház.
// Read this: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
//
//A class neve elé még tehetünk egy módosító kifejezést ami annak "láthatóságát", elérhetőségét módosítja
//ha nincs kitéve modosító az a "default" módosítónak felel meg.
// default = csak ezen a packagen belül látható (Töröld le a Math class elől a publicot és nézd meg hogy fordul itt a kód)
// public = bárki importálhatja ezt a class-t
// Egyelőre a calss-ok láthatóságról elég ennyit tudni később jobban belemegyünk
public class Tutorial {

    //A közvetlenül a "class" alatt definiált változók írják le annak az objektumnak a tulajdonságait, amit
    // majd létre hozunk belüle.
    //Példa: Egy ház tervrajzán szerepelhet, hogy ezen a házon van ablak. Még azt is definiálhatja a tervrajz, hogy ez
    //az ablak alapból zárva van. De ha felépítünk 3-4 házat a tervrajz alapján akkor már az adott objektum (a ház) tudja
    //hogy az ő ablaka az nyitva van-e vagy zárva. Ez az ablak a változó.
    //Tehát minden class alatt definiált változóból lesz minden objektumnak egy saját példánya amit változtathatunk
    //a nélkül hogy a többi példány hasonló nevű változója erről bármit tudna.

    //Ezeknek a változóknak is lehet láthatóságot állítani az eléjük írt módosító szóval:
    // public = bárki láthatja és használhatja a változót
    // default = ha nincs elé írva semmi, ilyenkor csak az addot packageben lévők láthatják
    // private = ezen a classon kívül senki nem láthatja
    // protected = egyelőre nem számít nekünk

    //A változókat ugynevezett "camelCase"-el szoptuk elnevezni, ami azt jelenti, hogy kisbetűvel kezdjük a nevüket
    //majdminden új szót a névben nagybetűvel kezdünk pl: "myAge"

    //Itt változókat definiálunk, majd rögtön értéket is adunk nekik.
    // A javaban minden változónak előre meg kell mondani a típusát. Két fajta típus létezik. Primitív és az Objektum.
    // A primitív típusok neve kisbetűvel kezdődik és ugynevezett "foglalt" szavak mint a "class" vagy a "public"
    // tehát ezeket a szavakat nem tudjuk másra használni (mondjuk nem tudunk ugy nevezni egy funckiót hogy "int")
    // Ezek itt primitív változók. A javaban összesen 8 primitív van:
    // Read this: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    //
    // Az "int" egy egész számot fejez ki és kb -2 milliárd-tól +2 milliárdig vehet fel értéket
    // Ha nagyobb vagy kisebb értéket akarunk bele rakni akkor a fordító hibát dob
    // Ha egy számolás eredménye képpen lenne nagyobb vagy kisebb az érték akkor pedig "körbefordul" az értéke
    // Ez minden primitív típusra igaz, ezért fontos hogy mindig kellőképpen "nagy"-ot válaszunk.
    public int myAge = 25;

    // A "long" egy nagyobb egész számot fejez ki
    // egy nagy L betüt kell utána írni mikor az értéket leírjuk.
    public long ageOfTheUniverseInDays = 5026780000000L;

    // A "float" egy kisebb tört számot fejez ki
    // egy nagy F betüt kell utána írni mikor az értéket leírjuk.
    public float aNumberWithFractionalPart = 30000.56F;

    // A "double" egy nagyobb tört számot fejez ki
    // egy nagy D betüt kell utána írni mikor az értéket leírjuk.
    public double aReallyReallyBigNumberWithFractionalPart = 300234234232342400.56234234D;

    // Egy logika igen/nem értéket fejez ki. Két értéket vehet fel "true" vagy "false"
    public boolean isItChristmasYet = false;

    // A "byte" és a "short" szinte soha nem használt. Egész számokat fejeznek ki, kisebbet mint az "int"
    // Egy "int" 32 bit memoriát használ egy short 16-ot egy byte 8-at.
    public byte aVerySmallNumber = 1;
    public short aBitBiggerNumber = 2;

    // A char is egy egész szám típus, amivel ASCII karaktereket fejezünk ki, szintén nagyon ritkán használt.
    // Read this: http://www.asciitable.com/
    // Értéket adhatunk neki mint int vagy mint egyetlen karakter szimpla idézőjelek között
    // Amikor visszaolvassuk vagy kiíratjuk mindig a számot kapjuk vissza nem a karaktert.
    public char theAsciiCodeForLetterA = 97;
    public char theAsciiCodeForLetterB = 'B';

    //Itt még írok a "String"-ről ami nem primitív hanem objektum típusú, de sokszor úgy használjuk,
    // mintha primitív lenne. Ez egy darab szöveget fejez ki (karaktekrek egy tömbjét)
    // és dupla idézőjelek között adunk neki értéket.
    //Read this: https://docs.oracle.com/javase/tutorial/java/data/strings.html
    public String name = "marci";

    //A változók neve előtt még lehet két fontos kulcsszó
    //A "final" kulcsszó azt jelenti a primitívek esetében, hogy az értékük soha nem változhat miután értéket kaptak.
    //Ezeket konstansnak is szoktuk hívni
    public final int one = 1;

    //A static kulcsszó azt jelenti, hogy a változó nem az egyes objektumokra vonatkozik, amiket készítunk majd ez
    // alapján a class alapján. Nem lesz minden objektum példánynak belőle egy saját.
    // A static kulcsszóval ellátott változókból csak egy van és a class nevével hivatkozunk majd rá.
    public static int howManyTutorialObjectHaveBeenCreated = 0;

    //Általában együtt szoktuk használni ezt a két kulcsszót, hogy olyan változókat definiáljuk, amik minden példányra
    //vonatkoznak majd és nem lehet változtatni őket.
    //A nevüket csupa nagy betűvel írjuk alul vonással elválasztva
    public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;

    //Az esetek nagy részében viszont az osztály szintű változóink nem kapnak értéket azonnal
    //A legtöbb esetben később adunk nekik értéket, amikor az objektumat legyártjuk a class alapján
    //Valamint szinte soha nem public hanem private láthatóságot adunk nekik. pl:
    private String address;

    //Funkciókat úgy definiálunk javaban
    //hogy megadjuk a láthatóságukat (public)
    //hogy milyen típusú értékkel térnek majd vissza (int)
    //szintén hasnálhatunk különleges kulcsszavakat mint a "static" vagy a "final"
    //majd megadjuk a funkció nevét (akármi lehet ami nem foglalt kulcsszó)
    //Az argumentumok listáját amit kap majd a funkciót vagy egy üres pár () zárójel
    // Az argumentumok olyen változók, amikor oda adunk egy funkciónak kívülről, hogy dolgozzon vele
    // szintén meg kell adni, hogy milyen típusuak lehetnek és mi a nevük, ahogy használjuk majd őket
    //majd egy kódblock

    //Az első funkció minden java classban az úgy nevezett konstruktor.
    //Ennek a neve mindig ugyan az mint a classnak, és majdnem mindig public (később majd beszélünk róla mikor nem).
    //nincs kulcsszó előtte
    //Ha mi nem írjuk bele a classba, akkor a java fordító magától bele rak egyett a kódba ami üres (mint alant)
    //Amikor egy objektumot (példányt) akarunk gyártani egy classból ezt a funkciót fogja meghívni a java.
    //Tehát ebbe szoktunk minden olyan logikát írni, amiről azt akarjuk hogy lefusson ha gyártunk egy példányt.
    public Tutorial(String address) {

        //A this kulcsszó mindig az adott objektumra vonatkozik, a futás során. Tehát a tervrajz alapján legyártottunk
        // egy példányt és a this erre a példányra mutat.
        //Itt most az "address" változónak ezen a példányon ugyan az lesz az értéke mind amit a konstruktornak megadtunk
        this.address = address;
    }

    public void printIfFiveIsAPrimeOrNot() {
        System.out.println(Math.isPrime(5));
    }

}
