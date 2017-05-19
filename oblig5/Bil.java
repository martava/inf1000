import java.text.*;

class Bil{

  private int kilometerstand = 0; //variabel som lagrar kor lant bilen har koeyrd totalt og set den til 0.
  private double bensin; //variabel som lagrar kor mykje bensin det er paa tanken
  final double bensinforbruk; //variabel som lagrar bensinforbruket
  final double tankstorleik; //variabel som lagrar tankstorleiken

  public Bil (double b, double t){
    //tar i mot parametra ved oprettinga av objektet, og fastset bensinforbruket og tankstorleik. I tillegg saa set med bensinmenga til tankstorleiken, sidan me reknar med at bilen blir levert med full tank
    bensinforbruk = b;
    bensin = t;
    tankstorleik = t;
  }

  //metode for aa koeyre tur,
  public void kjorTur(int km){

    if (hentMaksDistanse() > km){ //viss maksdistansen som er mogleg aa koyre er stoerre enn kor langt brukaren vil koyre paa tr saa:
      kilometerstand += km; //aukar kilometerstanden
      bensin -= (bensinforbruk*(double)km); //bensinmengda minkar tilsvarande kor mange km brukaren koyrer og kor stort bensinforbruk bilen har
      System.out.println("Du har no koyrd " + km +"km"); //skriv ut tilbakemelding
    }
    else{//viss det ikkje er no bensin til aa koyre saa langt som brukaren vil, saa blir det skrive ut tilbakemelding om det
      System.out.println("Du har ikkje nok bensin til aa koyre sa langt.");
    }


  }
  //metode for aa fylle paa bensing
  public boolean fyllTank(double liter){
    if ((tankstorleik-bensin) > liter){ //viss det er plass, saa fyller me opp, skriv ut tilbakemelding og returnerer true
      bensin += liter;
      System.out.println("Du har no " + bensin + " liter paa tanken");
      return true;
    } //viss ikkje saa blir det printa ut at brukaren ikkje har plass, og metoden returnerer false. Her er det ikkje naudsynt aa ha else, sidan metoden blir avslutta saa snart den har returnert noko og om det er plass paa bensintanken saa blir true returnert.
    System.out.println("Du har ikkje nok plass paa tanken til aa fylle saa mykje");
    return false;

  }

  public double hentMaksDistanse(){ //metode som reknar ut maksdistansen basert paa bensinforbruket og kor mykje bensin det er og returnerer den
    return bensinforbruk*bensin;
  }

  public int hentKilometerstand(){ //metode som returnerer kor mykje bilen har koyrd totalt
    return kilometerstand;
  }


}
