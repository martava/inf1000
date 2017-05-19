class Ord{

  private int antall = 0;
  private String ord;

  Ord(String tekst){
    //ved oppretting av kvart objekt saa vil antallet bli auka til 1, og stringen bli lagra i strin-variablen ord.
    antall++;
    ord = tekst;
  }

  public String toString(){
    //Returnerer string-variabelen ord
    return ord;
  }

  public int hentAntall(){
    //returnerer antallet paa ordet
    return antall;
  }

  public void oekAntall(){
    //Auker antall med 1
    antall++;
  }

  public int hentLengde(){
    //Returnerer lengda paa ordet som heiltal
    return ord.length();
  }

  public int plassiDokument(){
    //Returnerer kor stor plass ordet tar i dokumentet ved aa multiplisere kor antallet av ordet med lengda
    return (hentLengde()*hentAntall());
  }

}
