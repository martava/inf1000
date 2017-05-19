/*Denne klassen oppretter nye personobjektar og lagrar dem i ein hashmap. Den kallar paa alle metodane i person-klassen
som blir brukt, og den inneheld metodeen lesFil, som gaar gjennom tekstfila og lagrar ifnformasjonen i den so objektar.
*/
import java.util.*;
import java.io.*;

class Dvdadministrasjon{
  private HashMap<String, Person> personliste = new HashMap<String, Person>();

  //metode som tar i mot finamnet som skal bli lest som parameter, og ut i fraa innhaldet i fila oppretter nye personobjektar og dvdobjektar og registrerar eventuelle laan.
  public void lesFil(String filnamn) throws Exception{
    //Les gjennom fila og legg kvar enkelt linje i ein arraylist:
    Scanner fil = new Scanner(new File(filnamn));
    ArrayList<String> innlestListe = new ArrayList<>();
    while(fil.hasNextLine()){
      innlestListe.add(fil.nextLine());
    }
    //Lagrar indexen til fyrste og siste  "-" i fila, for aa vita kor lista med personar gaar over til liste med dvd-oversikt og kva tid ein naar den siste personen i fila.
    int index = innlestListe.indexOf("-");
    int siste = innlestListe.lastIndexOf("-");

    //Oppretter personobjekt:
    for(int i = 0; i<index; i++){
      String namn = innlestListe.get(i);
        personliste.put(namn.toLowerCase(), new Person(namn));
    }

    //Opprett dvdobjekt for kvar person:
    for(int i = index + 2; i<innlestListe.size(); i++ ){
      if(index <= siste){
        Person p = personliste.get(innlestListe.get(index+1).toLowerCase());

       if(innlestListe.get(i).equals("-")){
         index = i;
         i++;
       }
       else{
         if(innlestListe.get(i).charAt(0) == '*'){
           Dvd d = p.opprettDvd(innlestListe.get(i).substring(1).toLowerCase(), p, personliste.get(innlestListe.get(i+1).toLowerCase()));
           personliste.get(innlestListe.get(i+1).toLowerCase()).opprettLaan(d.toString().toLowerCase(), d);
           innlestListe.remove(i+1);
         }
         else{
           p.opprettDvd(innlestListe.get(i).toLowerCase(),p, null);
         }
       }
     }
   }
  }

  //Metode som tar inn namn som parameter og oppretter nytt personobjekt med det namnet, med mindre det finst fraa foer
  public void leggTilPerson(String namn){
    if(personliste.get(namn.toLowerCase()) == null){
      personliste.put(namn.toLowerCase(), new Person(namn));
      System.out.println("Personen er registrert");
    }
    else{
      System.out.println("Personen er allereie registrert");
    }
  }

  //metode for aa kjoepe dvder. Sjekker at personen finst og at personen ikkje eig denne dvden allereie.
  public void kjopDvd(String personNamn, String dvdNamn){
    if(personliste.get(personNamn.toLowerCase()) == null){
      System.out.println("Denne personen er ikkje i registeret");
    }
    else if(personliste.get(personNamn.toLowerCase()).finnDvd(dvdNamn) != null){
      System.out.println(personNamn + " eig allereie denne DVDen");
    }
    else{
      personliste.get(personNamn.toLowerCase()).opprettDvd(dvdNamn.toLowerCase(), personliste.get(personNamn.toLowerCase()), null);
      System.out.println(personNamn + " har kjopt '" + dvdNamn + "'");
    }
  }

  //MEtode som registrer laan og utlaan av dvdar
  public void laanDvd(String laaner, String eigar, String dvd){
    if(laaner.equalsIgnoreCase(eigar)){
      System.out.println("Ein person kan ikkje laana av seg sjoelv");
    }
    else if(personliste.get(laaner.toLowerCase()) == null){
      System.out.println("Personen som skal laane er ikkje registrert");
    }
    else if(personliste.get(eigar.toLowerCase()) == null){
      System.out.println("Personen som eig denne dvden er ikkje registrert");
    }
    else if(personliste.get(eigar.toLowerCase()).finnDvd(dvd) == null){
      System.out.println("Eigaren har ikkje denne DVDen, eller den er laant ut allereie");
    }
    else if (personliste.get(eigar.toLowerCase()).finnDvd(dvd) != null && personliste.get(eigar.toLowerCase()) != null && personliste.get(laaner.toLowerCase()) != null && !laaner.equalsIgnoreCase(eigar)){
      Person l = personliste.get(laaner.toLowerCase());
      Person e = personliste.get(eigar.toLowerCase());
      Dvd d = e.laanUtDvd(dvd,l);
      if(d == null){
        System.out.println("Denne DVDen er laant ut allereie");
      }
      else{
        l.opprettLaan(d.toString().toLowerCase(), d);
        System.out.println(laaner + " har laant '" + dvd + "' av " + eigar);

    }}
  }

  //Metode som registerer retur av ein laant dvd
  public void returner(String laaner, String dvd){
    Person p = personliste.get(laaner.toLowerCase()).returnerDvd(dvd.toLowerCase());
    if(personliste.get(laaner.toLowerCase()) == null){
      System.out.println("Personen som skal levere er ikkje registrert");
    }
    else if(p == null){
      System.out.println(laaner + " har ikkje laant " + dvd);
    }
    else{
      p.levert(dvd.toLowerCase());
      System.out.println(laaner + " har levert '" + dvd + "' tilbake til " + p.toString());
    }
  }

  //Metode som skriv ut alle dvdane som ein person (eller alle) eig og/eller laaner
  public void oversiktPerson(String namn){
    if(namn.equals("*")){
      for(Map.Entry<String, Person> p : personliste.entrySet()){
        System.out.println(p.getValue().visDvder());
      }
    }
    if(personliste.get(namn) == null && !namn.equals("*")){
      System.out.println("Denne personen er ikkje registrert");
    }
    else if(personliste.get(namn) != null && !namn.equals("*")){
      System.out.println(personliste.get(namn).visDvder());
    }
  }

  //Metode som viser oversikt over alle personane i arkivet og kor mange dvdar dei eig og laaner
  public void visOversikt(){
    String oversikt = "";
    for(Map.Entry<String, Person> p : personliste.entrySet()){
      oversikt += p.getValue().visOversikt();
    }
    if(oversikt.equals("")){
      System.out.println("Det er ingenting aa sjaa i oversikten");
    }
    else{
      System.out.println(oversikt);
    }
  }


}
