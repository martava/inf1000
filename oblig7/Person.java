/* Denne klassen lagrar dvdane til kvar person i tri forskjellege hasmaps, ein for dei dvdane som personen eig, ein for dei dvdane person eig og laaner ut, og ein for dei dvdane som personen laaner.
Den inneheld alle metodane som skal til for aa endra paa dvd-objekta, og metodane som printer ut informasjon om dvdane til personen.
*/
import java.util.*;

class Person{
  private HashMap<String, Dvd> dvder = new HashMap<String, Dvd>();
  private HashMap<String, Dvd> laanteDvder = new HashMap<String, Dvd>();
  private HashMap<String, Dvd> utlaanteDvder = new HashMap<String, Dvd>();
  private String namn;

  Person(String namn){
    this.namn = namn;
  }

  public String toString(){//returnerer namnet til personen
    return namn.toLowerCase();
  }

  //metode for aa oppretta dvdobjekt og legga det inn i hashmappen dvder.
  public Dvd opprettDvd(String dvdnamn, Person eigar, Person laaner){

    if(laaner == null){
      Dvd d = new Dvd(dvdnamn, eigar, laaner);
      dvder.put(dvdnamn.toLowerCase(), d);
      return d;
    }
    else if(laaner != null){
      Dvd d = new Dvd(dvdnamn, eigar, laaner);
      utlaanteDvder.put(dvdnamn.toLowerCase(), d);
      return d;
    }
    return null;
  }

  //metode for aa registrere ein laant dvd inn i hashmappen laanteDvder
  public void opprettLaan(String dvdnamn, Dvd d){
    laanteDvder.put(dvdnamn.toLowerCase(), d);

  }

  //metode for aa finne ut om personen eig ein dvd og returnerer dvdobjektet, returnerer null om personen ikkje har dvden
  public Dvd finnDvd(String namn){
    return dvder.get(namn.toLowerCase());

  }

  //metode for aa laane ut ein dvd og registrere at dvdobjektet er laant ut til ein person ved aa putte laanepersonen inn i hasmappen dvder
  public Dvd laanUtDvd(String dvdnamn, Person laaner){
    Dvd d = dvder.get(dvdnamn.toLowerCase());
    if(d.hentLaaner() == null){
      d.endreLaaner(laaner);
      utlaanteDvder.put(dvdnamn.toLowerCase(), d);
      dvder.remove(dvdnamn.toLowerCase());
      return d;
    }
    return null;
  }

  //metode for aa registrere at ein dvd er lever tilbake
  public void levert(String namn){
    Dvd d = utlaanteDvder.get(namn.toLowerCase());
    dvder.put(namn.toLowerCase(), d);
    utlaanteDvder.remove(namn.toLowerCase());
  }

  //metode for aa returnerer ein laant dvd. Returnerer personobjektet som dvden er laant fraa.
  public Person returnerDvd(String dvdnamn){
    Dvd d = laanteDvder.get(dvdnamn.toLowerCase());
    if(d == null){
      return null;
    }
    Person eigar = d.hentEigar();
    laanteDvder.remove(dvdnamn.toLowerCase());
    return eigar;
  }


  //metode for aa skrive ut oversikt over alle dvdar som person eig, laaner ut og laaner fraa andre
  public String visDvder(){
    String liste = namn + " eiger desse filmane:";
    for(Map.Entry<String, Dvd> e: dvder.entrySet()){
      if(e.getKey() != null){
          liste = liste + "\n" + e.getKey();
        }
      }
      for(Map.Entry<String, Dvd> e: utlaanteDvder.entrySet()){
        if(e.getKey() != null){
          liste = liste + "\n" + e.getKey();
        }
      }
    liste = liste +  "\n" + toString() + " laaner ut desse filmane: ";
    for(Map.Entry<String, Dvd> e: utlaanteDvder.entrySet()){
      if(e.getKey() != null){
        liste = liste + "\n" + e.getKey() + " til " + e.getValue().hentLaaner().toString();
      }
    }
    liste += "\n" + toString() + " laaner desse filmane:";
    for(Map.Entry<String, Dvd> e: laanteDvder.entrySet()){
      if(e.getKey() != null){
        liste = liste + "\n" + e.getKey() + " av " + e.getValue().hentEigar().toString();
      }
    }
    return liste;
  }

  //metode for aa vise oversikt over antall dvder, utlaante dvder og laante dvder.
  public String visOversikt(){
    String oversikt = "\n" + toString() + "\n";
    int eigteFilmar = dvder.size() + utlaanteDvder.size();
    int laanteFilmar = laanteDvder.size();
    int laantBort = utlaanteDvder.size();
    oversikt += "Antall eigte filmar: " + eigteFilmar + "\nAntall filmar som er laant bort: " + laantBort + "\nAntall laante filmar: " + laanteFilmar;
    return oversikt;
  }

}
