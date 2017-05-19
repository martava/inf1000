import java.util.*; //importerer heile utility-biblioteket

public class Beslutninger{
  public static void main (String[]args){
    /*Test (deloppgave a og b)
    int alder = 22;
    if(alder>=18){
      System.out.println("Du er myndig");
    }
    else{
      System.out.println("Du er ikkje myndig");
    }
    */
    Scanner inn = new Scanner (System.in);
    System.out.println("Skriv inn alderen din");
    int alder = Integer.parseInt(inn.nextLine()); //lager ein variabel som heiter alder, konverterer det brukaren har skrive om til ein integer og putter den inn i variabelen
    if(alder>=18){ //sjekker om alderen er 18 eller eldre, og skriv ut "du er myndig"
      System.out.println("Du er myndig");
    }
    else{ //om alderen er mindre enn 18, sa vil det blir skrive ut "du er ikkje myndig"
      System.out.println("Du er ikkje myndig");
    }
  }

}
