import java.util.*;

public class NegativeTall{
  public static void main(String[] args){
    int[] heltall = {1, 4, 5, -2, -4, 6, 10, 3, -2};
    int negativeTal = 0; //variabel som lagrar kor mange negative tal det er
    int i = 0; //integer som blir brukt til aa koeyre while-loekka
    while (i < 9){ //sjekker om i er mindre enn 9, som er talet paa kor mange posisjonar det er i arrayen.
      if (heltall[i] < 0){ //viss talet i denne posisjonen i arrayen er mindre enn 0
        negativeTal++; //tel opp kor mange negative tal me her
        heltall[i] = i; //erstattar talet med deira posisjon i arrayen
      }
      i++;
    }
    for (int k = 0; k<9; k++){ //brukar ei vor-loekke til aa skrive ut alle tala i arrayen, med eit linjeskift mellom kvart tal
      System.out.println(heltall[k] + "\n");
    }
  }
}
