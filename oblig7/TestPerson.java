/* Klasse for aa teste forskjellege metodar i Personklassen. Sidan alle meldingane blir skrive ut i Dvdadministrasjon, saa faar ein
ingen feilmeldingar ved koeyring av denne klassen*/

public class TestPerson{
  public static void main (String[] args){
    Person per = new Person("per");
    Person kari = new Person("kari");

    per.opprettDvd("film1", per, null);
    per.opprettDvd("film2", per, null);
    System.out.println(per.visDvder());
    kari.opprettLaan("film1", per.laanUtDvd("film1", kari));
    System.out.println(per.visDvder());
    System.out.println(kari.visDvder());
    kari.returnerDvd("film1");
    per.levert("film1");
    System.out.println(per.visOversikt());
    System.out.println(kari.visOversikt());

  }

}
