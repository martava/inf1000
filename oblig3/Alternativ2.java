public class Alternativ2{

 //Mainmetode som har to forskjellege arrayer, ein som inneheld to ugldige poengsummar og ein som har berre gyldige poengsummar.
  public static void main(String[] args){

    int[] poengUgyldig = {37, 25, -20, 31, 33, 2, 38, 41, 26, 24, 20, 23, 40};
    int[] poengGyldig = { 21, 32, 28, 1, 21, 31, 18, 36};

    System.out.println("Test 1: "); //Markerer at dette er test 1
    skrivKarakterprotokoll(poengUgyldig); //Koeyrer metoden med arrayen som har ugyldig poengsummer
    System.out.println("Test 2:"); //Markerer at dette er test 2
    skrivKarakterprotokoll(poengGyldig); //Koeyrer metoden med arrayen som har gyldige poengsummer
  }

  //Metode som gjer poengsummar som den faar i ein array om til karakterar og skriv den ut saman men tilhoeyrande kandidatnummer
  static void skrivKarakterprotokoll(int[] poeng){

    String karakter[] = new String[poeng.length]; //agar ny String-array som skal innehalde karakterane sm er like lang som arrayen som blir sendt inn

    String feilmelding = "Ugyldig poengsum er gitt til kandidat nummer: "; //String som gir beskjed om ugyldige poengsummar
    boolean feil = false; //boolean-variabel som er false, men blir true om det finst ugyldige poengsummar i arrayen
    for (int i=0; i<karakter.length; i++){
      //Sjekker om det er ugyldige poengsummar, og om det er det saa blir kandidatnummeret lagt til i feilmeldinga, og boolean feil blir true
      if (poeng[i] > 40 || poeng[i] < 0){
        feilmelding +=  i + ", ";
        feil = true;
      }
    }


    //Viss det er feil i arrayen (og boolean feil er true), saa blir feilmeldinga skrive ut og metoden avslutta.
    if(feil){
      System.out.println(feilmelding);
    }

    //Viss boolean feil er false, saa koeyrer programmet vidare og brukar ei vor-loekke og if-setningar til aa bestemme rett karakter basert paa poengsummen og putter den inn i arrayen.
    else{

      for (int i=0; i<karakter.length; i++){

        if (poeng[i] > 35){
          karakter[i] = "A";
        }
        else if (poeng[i] > 30 && poeng[i] < 36){
          karakter[i] = "B";
        }
        else if (poeng[i] > 22 && poeng[i] < 31){
          karakter[i] = "C";
        }
        else if (poeng[i] > 17 && poeng[i] < 23){
          karakter[i] = "D";
        }
        else if (poeng[i] > 15 && poeng[i] < 18){
          karakter[i] = "E";
        }
        else if(poeng[i] > 0 && poeng[i] < 16){
          karakter[i] = "F";
        }
        //Printer til slutt ut kvar kandidat og medhoeyrande karakter:
        System.out.println("Kandidatnummer " + i + ": " + karakter[i]);
      }
  }

  }
}
