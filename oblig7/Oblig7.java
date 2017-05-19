/*Denne klassen inneheld main-metoden. Den opprett ein dvdadministrasjon, skriv ut menyn til brukaren, tar i mot brukarinputen og sender det til dei forskjellege metodane i dvdadministrasjonen.
*/

import java.util.*;
import java.io.*;

public class Oblig7{

  public static void main(String[] args) throws Exception{

    //Deklarer skanner som tar i mot brukarinput, lagar nytt dvdadministrasjon-objekt, lagrar menyen i ein string, skriv den ut i terminalen naar programmet startar.
    Scanner inn = new Scanner(System.in);
    Dvdadministrasjon kjor = new Dvdadministrasjon();

    kjor.lesFil("dvdarkiv.txt"); //Køyrer metoden lesFil og sender namnet paa fila som skal bli lese

    String meny = "Meny (trykk inn tal for aa velje): \n1: Registrer ny person\n2: Registrer kjoep av DVD\n3: Registrer laan av DVD\n4: Vis oversikt over person\n5: Vis oversikt over alle personane i arkivet\n6: Returner ein laant DVD\n7: Avslutt";
    System.out.println(meny);
    int i = Integer.parseInt(inn.nextLine()); //lagrar valet til brukaren.

    //Lagar variablar til aa lagra forskjellege input fraa brukaren:
    String dvd;
    String laaner;
    String eigar;
    String namn;


    //Koeyrer programmet saa lange brukaren skriv inn noko anna enn 7:
      while(i != 7){
        //Gir feilmelding om brukaren skriv noko anna enn tal fraa 1-7:
        if(i<1 || i>7){
          System.out.println("Me finn ikkje ein kommando for " + i + ", venlegst vel eit tal fraa menyen");
          System.out.println(meny);
          i = Integer.parseInt(inn.nextLine());
        }
        //køyrer dei forskjellege metodane basert paa kva brukaren vel:
        else{
        switch(i){
          case 1: System.out.println("Skriv inn namnet paa personen du vil registrera");
            kjor.leggTilPerson(inn.nextLine());
            break;
          case 2: System.out.println("Skriv inn namnet paa personen som kjøper:");
            namn = inn.nextLine();
            System.out.println("Skriv inn namnet paa DVDen");
            dvd = inn.nextLine();
            kjor.kjopDvd(namn, dvd);
            break;
          case 3: System.out.println("Skriv inn namnet paa den som skal laane:");
            laaner = inn.nextLine();
            System.out.println("Skriv inn namnet paa den det skal lanes fraa:");
            eigar = inn.nextLine();
            System.out.println("Skriv inn namnet paa DVDen");
            dvd = inn.nextLine();
            kjor.laanDvd(laaner, eigar, dvd);
            break;
          case 4: System.out.println("Skriv inn namnet paa personen du vil sjaa oversikt over, skriv * for aa vise alle");
            kjor.oversiktPerson(inn.nextLine());
            break;
          case 5:
            kjor.visOversikt();
            break;
          case 6: System.out.println("Skriv inn namnet paa personen som leverer:");
            laaner = inn.nextLine();
            System.out.println("Skriv inn namnet paa dvden som blir levert:");
            namn = inn.nextLine();
            kjor.returner(laaner, namn);
            break;
        }
        System.out.println(meny);
        i = Integer.parseInt(inn.nextLine());
      }


  }
}
}
