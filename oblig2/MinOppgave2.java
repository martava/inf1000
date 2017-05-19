/* Lag eit program som les inn hoegda til brukaren og avgjer om brukaren
faar lov aa reise med berg- og dalbanen eller ei. Brukaren maa vera over 150cm
for aa faa lov. Prgrammet skal innehalde ein metode som tar i mot hoegda som parameter.
*/
import java.util.Scanner;

public class MinOppgave2{

  //Metode som tar i mot hoegda som ein parameter og skriv ut om brukaren faar reise paa berg- og dalbanen eller ei
  public static void HoegNok(double a){
    if (a < 150){
      System.out.println("Du er for laag til aa reise paa berg- og dalbanen");
    }
    else {
      System.out.println("Du kan faa reise paa berg- og dalbanen!");
    }
  }

  public static void main (String[]args){
    System.out.println("Skriv inn hoegda di i centimeter"); //Fortel brukaren kva hen skal gjera
    Scanner inn = new Scanner(System.in); //Lager ein scanner som les inn det brukaren skriv
    double a = Double.parseDouble(inn.nextLine()); //konverterer det brukaren har skrive om til ein double og lagrer det i variabelen a
    HoegNok(a); //koeyrer metoden HoegNok og gir den parameteren a, som er det brukaren har skrive inn

  }

}
