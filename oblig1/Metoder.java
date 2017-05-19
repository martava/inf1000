import java.util.Scanner; //importerer Scanner for a lese inn fra brukaren

public class Metoder{

  public static void main (String [] args){
    for (int i = 0; i<3; i++){ //for-lokke som koyrer 3 gonger
    Sporsmal(); //koyrer metoden Sporsmal()
    }

  }

  //Metode som les inn namnet og bustaden til brukaren og leverer ut ei helsing.
  public static void Sporsmal(){
    Scanner inn = new Scanner (System.in); //Scanner som leser inn fra tastaturet
    System.out.println("Skriv inn namnet ditt");
    String namn = inn.nextLine(); //putter det som brukaren har skrive inn i stringen namn
    System.out.println("Skriv inn bustaden din");
    String bustad = inn.nextLine(); //putter det som brukaren har skrive inn i stringen bustad
    System.out.println("Hei " + namn + "! Du er fra " +bustad + "."); //leverer ut helsingen
  }
}
