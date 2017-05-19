public class Oppgave51{

  public static void main (String[]args){

    //Oppretter nytt objekt som brukar 0.69l/km og har ein tanktstorleik paa 100l.
    Bil suzuki = new Bil (0.69, 100.0);

    //koeyrer dei forskjellege metodane:
    suzuki.kjorTur(12);
    suzuki.fyllTank(4);
    System.out.println("Maksimum distanse du kan koyre er: " + suzuki.hentMaksDistanse());
    suzuki.kjorTur(95);
    suzuki.kjorTur(40);
    System.out.println("Maksimum distanse du kan koyre er: " + suzuki.hentMaksDistanse());
    suzuki.fyllTank(40);
    System.out.println("Total kilometerstand: " + suzuki.hentKilometerstand());

  }
}
