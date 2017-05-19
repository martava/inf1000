public class Oppgave54{

  public static void main(String[] args){

    Isbod sorenga = new Isbod("Soerenga", 8); //Oppretter ny isbod paa Soerenga med molegheit for 8 tilsete
    //utfoerar operasjonar:
    sorenga.ansett("Bjarte");
    sorenga.ansett("Steinar");
    sorenga.ansett("TOre");
    sorenga.printAlleAnsatte();
    sorenga.giSistemannSparken();
    sorenga.ansett("Helga");
    sorenga.printAlleAnsatte();

    Isbod egertorget = new Isbod("Egertorget", 5); //Oppretter ei isbod paa Egertorget med moglegheit for 5 tilsette
    egertorget.ansett("q"); //tilset folk
    egertorget.ansett("w");
    egertorget.giSistemannSparken(); //gir siste mann sparken
    egertorget.ansett("e"); //ansetter fleire
    egertorget.ansett("r");
    egertorget.ansett("t");
    egertorget.ansett("y");
    egertorget.printAlleAnsatte(); //skriv ut alle ansatte

  }
}
