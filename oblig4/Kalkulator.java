import java.util.Scanner;

public class Kalkulator{

  //Metode som tar i mot to tal som parametre og returnerer produktet av dei
  private static int addisjon(int a, int b){
    int sum = a+b;
    return sum;

  }

  //Metode som tar i mot to tal som parametre og returnerer differansen av dei
  public static int subtraksjon(int a, int b){
    int dif = a-b;
    return dif;
  }
  //metode som tar i mot to heiltal og dividerer dei og returnerer heiltal av svaret
  public static int heltallsdivisjon(int a, int b){
    int heilKvot  = a/b;
    return heilKvot;
  }
  //metode som tar i mot to tal og dividerer dei og returnerer kommatal av svaret
  public static double divisjon(double a, double b){
    double kvot = a/b;
    return kvot;
  }

  public static void main (String[]args){
    //Koeyrer dei fire metodane:
    int addSvar = addisjon (3, 4);
    int subSvar = subtraksjon (5, 2);
    int helDivSvar = heltallsdivisjon (10, 3);
    double divSvar = divisjon(10, 3);

    //Printer ut resultata:
    System.out.println(addSvar + "\n"  + subSvar + "\n"  + helDivSvar + "\n"  + divSvar );
  }
}
