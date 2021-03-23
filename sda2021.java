package lab1;
import java.util.Scanner;

public class sda2021 {


public static void main(String[] args) {

    int n,a,b,suma,dif,min=0,max=0,dist;
    float media;
    System.out.println("Introduceti cele 2 numere: ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();

    suma=a+b;
    System.out.println("Suma dintre cele 2 numere este: "+suma);

    dif=a-b;
    System.out.println("Diferenta dintre cele 2 numere este: " +dif);

    media=(float)(a+b)/2;
    System.out.println("Media celor 2 numere este: "+media);

     {
         if(a>b) {
             max=a;
             min=b;
             dist=a-b;
             }

             else {
                 max=b;
                 min=a;
                 dist=b-a;
         }


         }

     System.out.println("Maximul dintre cele 2 numere este: "+max);
     System.out.println("Minimul dintre cele 2 numere este: "+min);
     System.out.println("Distanta dintre cele 2 numere este: "+dist);
     }



}