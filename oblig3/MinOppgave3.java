/*
Lag eit program  som genererer eit tilfeldig tal som brukaren skal gjette seg fram til. Gi brukaren
tilbakemelding paa om dei maa skriva eit hoegare eller laagare tal.
*/

import java.util.*;

public class MinOppgave3{

  public static void main(String[] args){

    int hemmelegTal = (int) (Math.random()*1000) + 1; //Lager eit tilfeldig tal mellom 1 og 1000.
    Scanner inn = new Scanner(System.in); //Deklarerer ein scanner som les inn kva brukar skriv
    System.out.println("Tipp eit tal mellom 0 og 1000"); //Gir brukaren beskjed om kva hen skal gjera
    int tipp = Integer.parseInt(inn.nextLine()); //lager ein heiltalvariabel som konverterer det brukaren skriv om til int og lagrar det

    while ( tipp != hemmelegTal){ //while-loekke som koeyrer saa lenge brukaren har skrive feil tal
        if ( tipp < hemmelegTal){
          System.out.println("Feil tal, du maa hoegare!"); //gir beskjed om at brukaren har skrive eit for laagt tal
          tipp = Integer.parseInt(inn.nextLine());
        }
        else if (tipp > hemmelegTal){
          System.out.println("Feil, du maa laagare!"); //gir beskjed om at brukaren har skrive eit for hoegt tal
          tipp = Integer.parseInt(inn.nextLine());
        }
      }
  System.out.println("Du tippa rett, talet er " + hemmelegTal); //seier at brukaren har faatt rett og skriv ut fasiten.
  }
}
