import java.util.*;
import java.io.*;

class TestInnlesing{


 public static void main (String[] args) throws Exception{
  // ArrayList<Person> personliste = new ArrayList<>();
  ArrayList<String> personliste = new ArrayList<>();
    //Les inn fila linje for linje og legg til orda med metoden leggTilOrd:
    Scanner fil = new Scanner(new File("dvdarkiv.txt"));
    ArrayList<String> innlestListe = new ArrayList<>();
    HashMap<String, String> dvdMaps = new HashMap<String, String>();

    while(fil.hasNextLine()){
      innlestListe.add(fil.nextLine());
    }
    int index = innlestListe.indexOf("-");
    int siste = innlestListe.lastIndexOf("-");

    for(int i = 0; i<index; i++){
      personliste.add(innlestListe.get(i));
      innlestListe.set(i, null);
      /*if(s.charAt(0) != '-'){
        personliste.add(s);
      }
      if(s.charAt(0) == '-'){

      break;
    }*/
    }

   for(int i = index; i<innlestListe.size(); i++ ){
     if(index <= siste){
       if(innlestListe.get(i).equals("-")){
         index = i;
       }
       else{
         dvdMaps.put(innlestListe.get(index+1), innlestListe.get(i));
       }

     }

     }



    for(String s : personliste){
      System.out.println(s);
    }
    String liste ="";
    for(Map.Entry<String,String> e: dvdMaps.entrySet()){
      if(e.getKey() != null){
        liste = liste + "\n" + e.getKey() + e.getValue();
        /*
        if(e.getValue() != null){
          liste = liste + "\n" + e.getKey() + "\n*" + e.getValue();
        }
        else{
          liste = liste + "\n" + e.getKey();
        }*/

      }

    }
    System.out.println(liste);
}
}
