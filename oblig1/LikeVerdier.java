import java.util.*; // importer heile utility-biblioteker

public class LikeVerdier{
  public static void main (String[]args){
    Scanner inn = new Scanner(System.in); //lager ein Scanner som leser inn det brukaren skriv pa tastaturet
    System.out.println("Skriv inn eit tal"); //gir brukaren beskjed om kva hen skal gjera
    int c = Integer.parseInt(inn.nextLine());  //konverterer verdien brukaren gir om til eit integer (heiltal), og putter den inn i variabelen c som blir deklarert til a vera ein integer

    System.out.println("Skriv inn enda eit tal"); //gir brukaren ny beskjed om kva hen skal gjera
    int d = Integer.parseInt(inn.nextLine()); //konverterer den nye verdin fra brukaren og putter den inn ein ny variabel, d, som blir deklarert til a vera integer
    if (c==d){ //sjekker om tala brukaren har skrive inn er like, og gir dei i sa fall beskjed om det
      System.out.println("Tala du skreiv inn er like");
    }
    else{ //gir beskjed til brukaren at tala er ulike, om det er dei.
      System.out.println("Tala du skreiv inn er ikkje like");
    }
  }
}
