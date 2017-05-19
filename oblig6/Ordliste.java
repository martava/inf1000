import java.util.*;
import java.io.*;

class Ordliste{

  ArrayList<Ord> ordliste = new ArrayList<>(); //Array som lagrar alle objekta som blir laga

  public void lesBok(String filnamn) throws Exception{
    //Les inn fila linje for linje og legg til orda med metoden leggTilOrd:
    Scanner fil = new Scanner(new File(filnamn));
    while(fil.hasNextLine()){
      leggTilOrd(fil.nextLine());
    }
  }

  private void leggTilOrd(String ord){
    //Tar ordetog samanliknar det med alle orda som er allereie lagra som objekt i arraylista ved hjelp av metoden finnOrd. Om ordet ikkje er lagra fraa foer, saa legg den til som eit nytt objekt.
    if (finnOrd(ord) == null){
        ordliste.add(new Ord(ord.toLowerCase()));
    }
  }

  public Ord finnOrd(String tekst){
    //Gaar gjennom orda som er lagra i arraylista. Viss ordet er likt eit ord som er lagra, saa aukar den foerekomensten med 1. Viss ikkje returnerer metoden null.
    for(Ord o : ordliste){
      if(o.toString().equals(tekst.toLowerCase())){
        o.oekAntall();
        return o;
      }
    }
    return null;
  }

  public int antallOrd(){
    //Returnerer eit heiltal som seier kor mange ord som er lagra i arraylista.
    return ordliste.size();
  }
  public int antallForekomster(String tekst){
    //Returnerer eit heiltal som seier kor mange gonger ordet som er sendt inn som string dukkar opp i fila
    for(Ord o : ordliste){
      if(o.toString().equals(tekst.toLowerCase())){
        return o.hentAntall();
      }
    }
    return 0;
  }

  public Ord[] vanligste5(){
    //Metode som returnerer ein array med dei fem vanlegaste orda

    //Oppretter ein array med 5 plasser og legg dei fem fyrste objekta fraa arraylista ord inn i den, for aa ha noko aa samanlikna med:
    Ord[] vanleg = new Ord[5];
    for(int i=0; i<5; i++){
      vanleg[i] = ordliste.get(i);
    }

    //Gaar gjennom alle orda i arraylista og samanliknar antal foerekomster med kvart ord i arrayen. Om ordet har hoegare antall foerekomst, saa vil den bli putta inn i array'en, og dei orda som ligg lengre bak i arrayen vil bli flytta eit hakk bakover.
    for(Ord o : ordliste){
      for(int i = 0; i<5; i++){
        if(o.hentAntall() >= vanleg[i].hentAntall()){
          if(i == 0){
            vanleg[4] = vanleg[3];
            vanleg[3] = vanleg[2];
            vanleg[2] = vanleg[1];
            vanleg[1] = vanleg[0];
            vanleg[0] = o;
          }
          else if(i == 1){
            vanleg[4] = vanleg[3];
            vanleg[3] = vanleg[2];
            vanleg[2] = vanleg[1];
            vanleg[1] = o;
          }
          else if(i==2){
            vanleg[4] = vanleg[3];
            vanleg[3] = vanleg[2];
            vanleg[2] = o;

          }
          else if(i==3){
            vanleg[4] = vanleg[3];
            vanleg[3] = o;
          }
          else if(i==4){
            vanleg[4] = o;
          }
          break;
        }
      }
    }
    return vanleg;
  }

  public Ord finnLengste(){
    //Finn det lengste ordet i arraylista ved aa fyrst opprette eit objekt som er likt det fyrste objektet i arraylista, og saa brukar ei for-loeke til aa samanlikna alle orda i arraylista med dette, og returnere det stoerste.
    Ord d = ordliste.get(0);
    for(Ord o : ordliste){
      if(o.hentLengde() > d.hentLengde()){
        d = o;
      }
    }
    return d;

  }
  public Ord finnKorteste(){
    //Finn det kortaste ordet i arraylista paa same maate som i metoden finnLengste.
    Ord d = ordliste.get(0);
    for(Ord o : ordliste){
      if(o.hentLengde() < d.hentLengde()){
        d = o;
      }
    }
    return d;
  }

  public Ord tarMestPlassIDokument(){
    //Finn det ordet som tar mest plass i arraylista paa same maate som i metoden finnLengste
    Ord d = ordliste.get(0);
    for(Ord o : ordliste){
      if(o.plassiDokument() > d.plassiDokument()){
        d = o;
      }
    }
    return d;
  }
}
