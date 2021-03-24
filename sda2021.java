package lab1;
import java.util.Scanner;

public class sda2021 {


public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    int n,suma,dif,min=0,max=0,dist;
    float media;
    System.out.println("Introduceti primul numar ");
    int a1 = scanner.nextInt();
    System.out.println("Introduceti al doilea numar ");
    Scanner sc=new Scanner(System.in);
    int b1 = scanner.nextInt();


    suma=a1+b1;
    System.out.println("Suma : "+suma);

    dif=a1-b1;
    System.out.println("Diferenta : " +dif);

    media=(float)(a1+b1)/2;
    System.out.println("Media : "+media);

     {
         if(a1>b1) {
             max=a1;
             min=b1;
             dist=a1-b1;
             }

             else {
                 max=b1;
                 min=a1;
                 dist=b1-a1;
         }


         }

     System.out.println("Maximul: "+max);
     System.out.println("Minimul: "+min);
     System.out.println("Distanta : "+dist);
     }



}