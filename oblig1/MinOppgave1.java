/*Lag ein quiz kor brukaren far sporsmal og 4 svaralternativ. Tell opp kor
mange rette brukaren far, og gi til slutt resultatet. */

import java.util.Scanner; //importerer Scanner, som er verktyet for a lese inn det brukaren skriv pa tastaturet

public class MinOppgave1{
  public static void main(String[]args){
    Scanner inn = new Scanner(System.in); //leser inn det brukaren skriv
    int poeng = 0; //variabelen for poeng, brukaren har 0 poeng til a byrja med.

    //Sporsmal 1
    System.out.println("Sporsmal 1: Kor mange armar har ein blekksprut?\n a: 2  \t b: 6 \t c:4 \t d:8");
    String svar = inn.nextLine(); //gjer om det som er innlest til String, for a kunne samanlikna svaret
    if (svar.equals("a")){ //tester om brukaren har skrive inn "a"
      System.out.println("Feil! Svaret er d: 8 armar");
    }
    else if (svar.equals("b")){ //tester om brukaren har skrive inn "b"
      System.out.println("Feil! Svaret er d: 8 armar");
    }
    else if (svar.equals("c")){ //tester om brukaren har skrive inn "c"
      System.out.println("Feil! Svaret er d: 8 armar");
    }
    else if (svar.equals("d")){ //tester om brukaren har skrive inn "d"
      poeng++; //gir brukaren eit poeng, sidan dette er rett svar
      System.out.println("Korrekt!");
    }
    else{//hvis brukaren har skrive inn noko anna enn a,b,c eller d sa far dei beskjed om det
      System.out.println("Skriv inn kun eit svaralternativ, anten a, b, c eller d!");
    }

    // Sporsmal 2 er bygd opp pa samme mate som sporsmal 1. Difor har eg ikkje kommentert det som er likt
    System.out.println("Sporsmal 2: Kor mange bein har ein edderkopp?\n a: 8  \t b: 6 \t c:4 \t d:10");
    svar = inn.nextLine(); //putter det nye svaret inn i Stringen
    if (svar.equals("a")){
      poeng++;
      System.out.println("Korrekt!");

    }
    else if (svar.equals("b")){
      System.out.println("Feil! Svaret er a: 8 armar");
    }
    else if (svar.equals("c")){
      System.out.println("Feil! Svaret er a: 8 armar");
    }
    else if (svar.equals("d")){
      System.out.println("Feil! Svaret er a: 8 armar");
    }
    else{
      System.out.println("Skriv inn kun eit svaralternativ, anten a, b, c eller d!");
    }

    //AVslutning pa programmet. Brukaren blir opplyst om kor mange poeng den har fatt.
    System.out.println("Quizen er over. Du har fatt " + poeng + " poeng!");
  }
}
