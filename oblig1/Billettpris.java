import java.util.Scanner; //importerer Scanner for a lesa inn ting fra brukaren

public class Billettpris{
  public static void main (String[]args){
    Scanner inn = new Scanner(System.in); //deklarer Scanner til a lesa inn ting som brukaren skriv pa tastaturet
    System.out.println("Skriv inn alderen din (bruk kun heile tal)"); //Fortel brukaren kva hen skal gjera
    int alder = Integer.parseInt(inn.nextLine()); //konverterer det som brukaren har skrive inn til eit integer og putter den i variabelen alder
    if (alder < 12 || alder > 67 ){ //sjekker om alderen er lagare enn 12 eller hogare enn 67
      System.out.println("Billetten koster 25kr"); //skriv ut at billetten er til halv pris om brukaren kvalifiserer til det
    }
    else{
      System.out.println("Billetten koster 50kr"); //skriv ut full billettpris om brukaren er mellom 12 og 67.
    }

  }

}
