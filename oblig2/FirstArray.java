import java.util.Scanner;

public class FirstArray{
  public static void main(String[]args){
    int[] tabell1 = new int[4]; //lager ein tabell av integers og gir den fire plasser
    int j = 1; //lager ein integer som starter paa 1
    int i = 0;//lager ein integer som starter paa 0, og vil bli brukt til aa koeyre while-loeka
    while (i != 4){ //loekke som fyller inn int-tabellen med tal fraa 1 til 4
      tabell1[i] = j;
      i++;
      j++;
    }
    tabell1[0] = 1337; //byter plass fyrste og siste plass i tabellen med 1337
    tabell1[3] = 1337;

    String[] tabellnamn = new String[5]; //lager ein teksttabell og gir den 5 plasser
    Scanner inn = new Scanner(System.in); //lager ein innlesar
    System.out.println("Skriv inn 5 namn"); //gir brukaren beskjed om kva hen skal gjera
    for(int k=0; k<5; k++){ //forloekke som leser inn det brukaren skriv 5 gonger, og putter det inn i teksttabellen
      tabellnamn[k] = inn.nextLine();
    }

    //Skriv ut innhaldet i integer- og teksttabellen
    System.out.println("Innhald i int-arrayen:");
    int k = 0;
    while(k <4){
      System.out.println( + tabell1[k]);
      k++;
    }
    System.out.println("Innhald i String-arrayen:");
    int l = 0;
    while (l<5){
      System.out.println(tabellnamn[l]);
      l++;
    }



  }


}
