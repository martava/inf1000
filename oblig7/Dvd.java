/*Denne klassen inneheld den informasjonen som blir lagra om kvar dvd + metode for å hente denne informasjonen */

class Dvd{
  private String namn;
  private Person eigar;
  private Person laaner;

  Dvd(String namn, Person eigar, Person laaner){
    this.namn = namn;
    this.eigar = eigar;
    this.laaner = laaner;
  }

  public String toString(){
    return namn;
  }

  public Person hentEigar(){
    return eigar;
  }

  public Person hentLaaner(){
    return laaner;
  }
  public void endreLaaner(Person p){
    laaner = p;
  }
}
