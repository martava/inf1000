//Klasse som tester dei to metodane som er i dvd-klassen

public class TestDvd{
  public static void main (String[] args){
    Person p = new Person("Per");
    Person o = new Person("Oda");
    Dvd d = new Dvd("Film1", p, null);
    Dvd e = new Dvd("Film1", p, o);
    System.out.println(d.toString());
    System.out.println(d.hentEigar().toString());
    System.out.println(e.hentLaaner().toString());
  }
}
