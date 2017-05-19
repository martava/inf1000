/* Klasse som tester dei forskjellege metodane i Dvdadministrasjon*/

public class TestAdmin{

  public static void main(String[] args){
    Dvdadministrasjon test = new Dvdadministrasjon();

    test.leggTilPerson("ola");
    test.leggTilPerson("ola");
    test.leggTilPerson("kari");
    test.leggTilPerson("mari");

    test.kjopDvd("kari", "film1");
    test.kjopDvd("kari", "film2");
    test.kjopDvd("kari", "film1");

    test.laanDvd("ola", "kari", "ikkje-eksisterande-film");
    test.laanDvd("kari", "kari", "film1");
    test.laanDvd("ola", "kari", "film1");
    test.laanDvd("mari", "kari", "film1");
    test.visOversikt();

    test.laanDvd("ukjent", "kari", "film2");

    test.oversiktPerson("kari");

    test.returner("ola", "film1");
    test.returner("kari", "film");

    test.visOversikt();


  }
}
