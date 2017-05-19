class Isbod{


  private int antallTilsette = 0; //heiltalvariabel som lagrar kor mange som er tilsett
  final String isbodnamn; //String som lagrar namnet til isbua, slik at det blir mogleg aa skilje dei forskjellege isbuene fraa kvarandre i utskriften
  final int maksAnsatte; //heiltalsvariabel som lagrar kor mange som er maks mogleg aa tilsette
  private String[] tilsette; //array som lagrar alle tilsette, strorleiken er avhengig av parameter som blir sendt ved oppretting av objekt

  public Isbod(String n, int i){
    //Tar i mot parametre og lagrar informasjonen om objektet i variablar
    isbodnamn = n;
    maksAnsatte = i;
    tilsette = new String[i];
  }

  //metode for aa tilsetje folk
  public void ansett(String namn){

    if (antallTilsette < maksAnsatte){ //viss det er plass til aa tilsetje folk, saa:
      tilsette[antallTilsette] = namn; // legg til den til tilsette i arrayen, i plassen som er lik kor mange tilsette det er
      antallTilsette++; //aukar kor mange som er tilsatt med 1
      System.out.println("Du har tilsett " + namn); //SKriv ut tilbakemelding paa skjem
    }
    else{ //viss det er nok tilsette, saa skriv det ut tilbakemelding om det paa skjerm
      System.out.println("Du har for mange tilsette");
    }
  }

  //metode som gir sistemann som blei tilsett sparken:
  public void giSistemannSparken(){
    if(antallTilsette > 0){ //viss det er folk aa sparke:
      System.out.println("Du har sparka " + tilsette[antallTilsette-1]); //skriv ut kven som har blitt sparka
      tilsette[antallTilsette-1] = ""; //toemmer array-plassen til den sparka tilsette
      antallTilsette--; //minkar talet paa kor mange som er tilsett
    }
    else{ //skriv ut feilmelding om det ikkje skulle vera tilsette
      System.out.println("Du har ingen tilsette aa sparke");
    }
  }

  //metode som skriv ut liste over alle tilsette:
  public void printAlleAnsatte(){
    if(antallTilsette > 0){ //viss det er nokon som er tisatt, saa:
      System.out.println("Tilsette ved " + isbodnamn + " er:");
      for(int i=0; i<antallTilsette; i++){ //skriv ut alle i tabellen
        System.out.println(tilsette[i]);
      }
    }
    else{ //gir tilbakemelding om det ikkje er nokon som er tilsat i bua.
      System.out.println("Du har ingen tilsette");
    }
  }
}
