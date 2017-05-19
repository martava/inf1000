import java.util.*;

public class Oblig6{

  public static void main(String[] args) throws Exception{

    //Skriv ut det som er spurd om i oppgaava:
    Ordliste test = new Ordliste();
    test.lesBok("scarlet.txt");
    System.out.println("Antal forskjellege ord i boka: " + test.antallOrd());
    System.out.println("Antal foerekomster av 'Watson': " + test.antallForekomster("Watson"));
    System.out.println("Antal foerekomster av 'elementary' " + test.antallForekomster("elementary"));
    System.out.println("Dei 5 orda som dukkar opp mest:");
    for(int i = 0; i<5; i++){ //brukar for-loekke til aa skriva ut dei 5 vanlegaste orda, sidan metoden returnerer ein array
      System.out.println(test.vanligste5()[i]);
    }
    System.out.println("Det lengste ordet: " + test.finnLengste().toString());
    System.out.println("Det kortaste ordet: " + test.finnKorteste().toString());
    System.out.println("Det ordet som tar mest plass: " + test.tarMestPlassIDokument().toString());



  }
}
