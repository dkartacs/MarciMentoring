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

    //Bármelyik változóból (primitív vagy objektum) csinálhatunk egy tömböt. Egy tömb egy előre meghatározott számosságú
    // ugyan olyan típusú változót jelent. A típus neve mögé helyezett [] zárójellel deklaráljuk.
    // Értéket adhatunk neki azonnal deklarálásnák, kapcsos zárójelek között.
    // Vagy csak létrehozhatjuk az üres tömböt a "new" kulcsszóval, ilyenkor meg kell adni hány elem lesz benne.
    public int[] myIntArray = {1,2,3};
    public int[] myIntArray2 = new int[3];

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

    //Funkciókat úgy definiálunk javaban:
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
    //Ha mi nem írjuk bele a classba, akkor a java fordító magától bele rak egyett a fordított kódba ami üres (mint alant)
    //Amikor egy objektumot (példányt) akarunk gyártani egy classból ezt a funkciót fogja meghívni a java.
    //Tehát ebbe szoktunk minden olyan logikát írni, amiről azt akarjuk hogy lefusson ha gyártunk egy példányt.
    public Tutorial(String address) {

        //A this kulcsszó mindig az adott objektumra vonatkozik, a futás során. Tehát a tervrajz alapján legyártottunk
        // egy példányt és a this erre a példányra mutat.
        //Itt most az "address" változónak ezen a példányon ugyan az lesz az értéke mint amit a konstruktornak megadtunk
        this.address = address;
    }

    //Ez egy nagyon egyszerű funkció, amit ha meghívunk akkor vissza kapjuk az ezen objektumhoz tartozó address-t
    public String getAddress() {
        return this.address;
    }

    //A funkciónak az argumentumokat vesszővel elválasztva egymástól adunk meg. Minden átadott változó utána
    // szabadon használható a funkció kódblockjában.
    public int calculate(int number, boolean shouldMultipleWithNumber, String printMe) {
        //szabadon létre hozhatunk új változókat a funkció kódblockjában
        //ezek a változók csak ebben a blockban lesznek láthatóak, miután a block lefutott, törlődnek.
        //éppen ezért itt sem láthatóságot szabályozó kulcsszót nem használhatunk (pl: public)
        //sem a static kulcsszót
        int a = 1;
        final int b = 2;
        int c;

        /////////////////////////////////////////// Műveletek /////////////////////////////////////////////////////////
        //Müveleteket végezhetünk (statement) operátorokkal: összeadás, kivonás, etc...
        // Read this, very important: https://www.javatpoint.com/operators-in-java
        c = a + number;
        a = c * b;

        //Műveleteket végezhetünk más classok funkcióinak meghívásával:
        boolean IsNumberVariableAPrime = Math.isPrime(number);

        /////////////////////////////////////////// Control Flow //////////////////////////////////////////////////////
        //A java program alapvetően szekvenciálisan sorrol-sorra elkezd lefutni a "public static void main" metodussal
        // kedzve. Ez után ágazik el ezernyi ágra egy program. Bár egy program nagyon bonyolultá tud válni, alapvetően
        // csak a következő elágazások vannak minden gyökerében:
        // "if" és "switch" hogy eldöntsük merre halad tovább a program futása egy feltétel alapján.
        // "for", "while", "do while", hogy ciklikusan végrehajtsunk egy műveletet többször.
        /////////////////////////////////////////// Condition /////////////////////////////////////////////////////////
        //Elágaztathatjuk a program futását (controll flow)
        //Erre két lehetőségünk van az "if" vagy a "switch" művelet. Egyelőre csak az if-et használjuk
        //Az if egy feltétel alapján eldünti hogy melyik kódblockot futtasa le.
        //Az if kulcsszó után zárójelek között egy boolean típus lehet vagy bármi ami ennek megfelel, pl egy feltétel
        //A feltételek is le vann írva az operátors linkben
        //Feltételeket a középsuliból megtanult relációs jelekkel illetve az egyenlőség (==) vagy nem egyenlö (!=)
        // operátorokkal történnek. Ha több feltételt akarunk megadni egyszerrre akkor használjuk még a
        // "||" ami azt jelenti hogy VAGY, "&&" ami azt jelenti ÉS. Zárójelekkel el tudjuk választani a felételeket
        // egymástól
        //
        if (c == b){
            System.out.println("C egyenlő B-vel");
        } else {
            System.out.println("C nem egyenlő B-vel");
        }

        //Egy kicsit bonyolultabb if
        if(isItChristmasYet || (c == b) && (b > number)) {
            System.out.println("Már karácsony van vagy C egyenlő B-vel és B biztosan nagyobb mint a NUMBER");
        } else if (IsNumberVariableAPrime) {
            System.out.println("Az első feltélek eredménye false és NUMBER egy prim szám");
        } else {
            System.out.println("Az első feltélek eredménye false és NUMBER nem egy prim szám");
        }

        /////////////////////////////////////////// Loop /////////////////////////////////////////////////////////
        //A másik lehetőség a controll flow megváltoztatására a ciklus
        //Egy ciklusban egy bizonyos feltétel teljesüléséig folyamatosan futatjuk ugyan azt a kóbblockot.
        //A for ciklus az egyik legegyszerűbb. Általában egy egész számot növelünk egyesével vele és egy bizonyos számú
        // futás után kilépünk a ciklusból.
        //A szintaxisa a "for" kulcsszó utána zárójelben, ";" vesszővel elválasztva:
        // az első paraméter egy egész szám: ezzel a számmal kezdődik a ciklus futása. pl: int i = 0;
        // a második egy felétel: addig tart a ciklus futása amig ez a feltétel igaz, akkor fut le a kódblock amikor a feltétel true.
        //   általában az első paraméterben megadott számot hasonlítjuk valamihez.
        // a harmadik egy művelet: ezzel növeljük(csökkentjük) az első paraméterben megadott számot.
        // Ez után írjuk a kódblockot
        for (int i = 0; i < 10; i=i+1){
            System.out.println("Ez a szöveg tízszer fog kiíródni 0-tól 9-ig, ez a " + i + ". alkalom");
        }

        //A while ciklus csak egy feltétel zárójelek között és utána rögtön egy kódblock
        //Addig fut amig a feltétel igaz. Ezeknél különösen vigyázni kell hogy a ciklusban biztosítsuk hogy a feltétel
        // valamikor false legyen. Különben a programunk a végtelenségig futni fog :).
        //Gondoljátok át hogy ezzel a kóddal miért 1-től 10-ig írjuk ki a számot és miért nem 0-tól 9-ig mint az előzővel
        int index = 0;
        while(index < 10){
            index = index+1;
            System.out.println("Ez a szöveg tízszer fog kiíródni 1-től 10-ig, ez a " + index + ". alkalom");
        }

        //A "do while" egy "hátul tesztelő" ciklus. Tehát egyszer mindenképp lefut és utána ellenőrzi hogy le kell-e
        // futnia megint. Mivel ez a művelet nem kapcsos zárójellel ér véget (hanem simmával) ezért kell utána a pontos
        // vessző
        int index2 = 0;
        do {
            System.out.println("Ez a szöveg tízszer fog kiíródni 0-tól 9-ig, ez a " + index2 + ". alkalom");
            index2 = index2+1;
        } while (index2 < 10);

        //Csinálhatunk olyan for ciklust ami végig lépked egy tömbön. Ilyenkor a zárójelek közé megadjuk először egy új
        // változó deklaráziót (amilyen a tömbben van) majd kettőspont után a tömböt
        // a ciklus annyiszor fut ahány elem van a tömben és miden futásnál a soron következő elemet rakja a változóba
        // amit deklaráltunk
        for (int anInt : myIntArray){
            System.out.println(anInt);
        }

        //Van még két módja, hogy megvalósítsunk egy ciklust, de ezeket egyelőre nem vesszük, de utána nézhettek
        // 1: Bármelyik funkció meghívhatja önmagát, ezt "recursive" működésnek/ funkciónak nevezzük. Ez is ciklust
        // valósít meg. Ritkán használjuk mert nehezebben érthető mint egy simma ciklus, de vannak feladatok, ahol kell.
        // 2. A "break" klucsszó bármilyen kódblock futását azonnal megállítja és kilép az "eggyel kijebbi" kódblockba.
        // Ezt bármelyik ciklusban használhatjuk, ha ki akarunk lépni velőle. Viszont ciklusokban SOHA ne használjuk.
        // Érthetetlenné teszi a kódot és rossz programouási gyakorlatnak számít a használta.


        //Végül a funkcióból kilépunk. Ezt a "return" kulcsszóval bármikor megtehetjük, de az a jó gyakorlat ha ez csak
        // egyszer történik meg lehetőleg a funkció leírásának végén, az olvashatóság miatt.
        // Ha a funkciónak van visszatérési típusa (ennek a funkciónak az "int"), akkor egy ilyen típusú változót/ értéket
        // kell return után írni.
        // van egy különleges vissza térési érték a "void" is, amikor nincs return lásd lentebb
        return number;
    }

    //Ennek a funkciónak nincs vissza térési értéke, elvégez egy müveletet és ennyi. Ilyenkor a "void" kulcsszót használjuk
    // a vissza térési típus helyett, és nem használhatunk olyan return-t ami után van változó.
    public void setMyAge(int age) {
        this.myAge = age;
    }

}
