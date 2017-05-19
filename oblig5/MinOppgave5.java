/* Lag eit program kor du kan registrera medlemmar i ein organisasjon. Kvart medlem er eit objekt,
og ved opprettinga skal det bli lagra telefonnummer, e-postadresse, postadresse og eit automatisk medlems-
nummer. All denne informasjonen skal kunne bli henta igjen, baade separat og all informasjonen samla, og ein
skal kunne endra paa dei i mainklassen, i tillegg til at du
skal lage ein metode kor ein kan registrera
om personen har betalt medlemsskapet. Medlemsnummeret skal ikkje bli endra paa.

*/
public class MinOppgave5{


  public static void main(String[] args){

    int nyttNr = 100; //oppretter ein int som blir brutk til aa lage medlemsnummer
    Medlem per = new Medlem("Per Persen", "Gatevegen 1, 0203 Oslo", "12345678", "epost@adresse.no", nyttNr); //lagar nytt medlem og send inn informajson om medlemmet
    nyttNr++;//endrer paa variaben som lagar medlemsnumer
    Medlem ola = new Medlem("Ola Olsen", "Gatevegen 2, 0203 Oslo", "34568745", "epost2@adresse.no", nyttNr); //agar nytt medlem

    //tester ut dei forskjellege metodane
    System.out.println(per.hentInformasjon());
    per.harBetalt();
    per.endreTlfnr("56784576");
    System.out.println(per.hentTlfnr());
    per.betaler();
    per.harBetalt();
    System.out.println(ola.hentInformasjon());


  }

}
