import java.util.Scanner;

public class EnkelKalkulator{

  //Metode som tar i mot to tal som parametre og legger dei saman
  public static void Addere(int a, int b){
    int sum = a+b;
    System.out.println("Summen er " + sum);

  }

  //Metode som tar i mot to tal som parametre og subtraherer
  public static void Subtrahere(int a, int b){
    int dif = a-b;
    System.out.println("Differansen er " + dif);
  }
  //metode som tar i mot to tal og multipliserer dei
  public static void Multiplisere(int a, int b){
    int prod = a*b;
    System.out.println("Produktet er " + prod);
  }

  //program som leser inn to tal fraa brukaren
  public static void main (String[]args){
    System.out.println("Skriv inn to tal");
    Scanner inn = new Scanner(System.in);
    int c = Integer.parseInt(inn.nextLine());
    int d = Integer.parseInt(inn.nextLine());

    //Koeyrer dei tre metodane:
    Addere(c, d);
    Subtrahere(c,d);
    Multiplisere(c,d);
  }
}
