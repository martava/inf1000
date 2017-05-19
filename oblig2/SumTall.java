import java.util.Scanner; //importerer scanner til

public class SumTall{
  public static void main (String []args){

    System.out.println("Skriv tala som du vil addere. For aa avslutte programmet og sjaa summen av alle tala, skriv 0"); //Fortel brukaran kva hen skal gjere
    Scanner inn = new Scanner(System.in); //deklarerer scanner
    int tal = Integer.parseInt(inn.nextLine()); //konverterer det brukaren har skrive inn til integer
    int sum = 0; //lager ein variabel for aa legge saman alle tale brukaren har skrive inn
    while( tal != 0 ){ //while-loekke som leser inn tal fraa brukaren og leger dei saman i variabelen sum saa lenge brukaren skriv inn eit anna tal enn 0.
      sum += tal;
      tal = Integer.parseInt(inn.nextLine());
    }
    System.out.println("Summen av tala er " + sum); //Skriv ut summen av alle tala brukaren har skrive inn.
  }
}
