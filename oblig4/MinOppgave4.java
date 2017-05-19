/* Lag eit program som les inn tal fraa tekstfila tall.txt og lagrar det i ein tabell.
FIla har 91 linjer med eit tal pr linje fraa 1-9. Lag fyrst ein metode som skriv ut kor mange det er
av kvart tal, lag saa metodar som returnerer gjennomsnittet, medianen og typetalet av alle tala i tekstfila*/

import java.util.*;
import java.io.*;

public class MinOppgave4{

  //Metod som tar i mot ein tabell med heiltal,tel opp kor mange det er av kvart tal og legg det inn i ein ny tabell som blir returnrt
  public static int[] teljeTal(int[] tal){
    int[] antalTal = new int[9];
    for(int i=0; i<tal.length; i++){
      for(int j=0; j<9; j++){
        if(tal[i] == j+1){
          antalTal[j] ++;
        }
      }
    }
    return antalTal;
  }

  //Metode som tar i mot ein heiltaltabell, sorterer tala i den og saa finner ut medianen av alle tala og returnerer det
  public static int median (int[] tal){
    Arrays.sort(tal);
    int median = tal[tal.length/2 - 1];
    return median;

  }

  //metode som tar imot ein heiltaltabell og finner typetalet av alle tala i den tabellen og returnerer det
  public static int typetal (int[] tal){
    int[] antalTal = new int[9];
    int typetal = 0;
    int flestTal = 0;
    for(int i=0; i<tal.length; i++){
      for(int j=0; j<9; j++){
        if(tal[i] == j+1){
          antalTal[j] ++;
        }
      }
    }
    for(int k = 0; k<9; k++){
      if(antalTal[k] > flestTal){
        flestTal = antalTal[k];
        typetal = k+1;
      }
    }
    return typetal;
  }

  //Metode som tar i mot ein heiltaltabell og reknar ut gjennomsnittet av alle tala i tabellen
  public static double gjennomsnitt(int[] tal){
    double gjsnitt = 0;
    for(int i =0; i<tal.length; i++){
      gjsnitt += tal[i];
    }
    return (gjsnitt/tal.length);
  }

  public static void main (String[]args) throws Exception{

    Scanner fil = new Scanner(new File("tall.txt")); //Importerer fila og les den med ein scanner
    int talTabell[] = new int[91]; //lagar ein tabell til aa lagre alle tala i fila

    for(int i=0; i<91; i++){ //loekke som konverterer alle linjene i fila til heiltal og lagrar det i heiltalltabellen
      talTabell[i] = Integer.parseInt(fil.nextLine());
    }

    //Koyrer alle metodane og skriv det ut i tabellen:
    System.out.println("\nAntal av dei forskjellege tala er: ");
    int[] teljar = teljeTal(talTabell);
    for(int i = 0; i<teljar.length; i++){
      System.out.println( i+1 + ": " + teljar[i]);
    }
    System.out.println("\nTypetalet er " + typetal(talTabell));
    System.out.println("Gjennomsnittet er " + gjennomsnitt(talTabell));
    System.out.println("Medianen er " + median(talTabell));

  }
}
