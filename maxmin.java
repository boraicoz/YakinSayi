import java.util.Arrays;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     int []dizi={15,12,788,1,-1,-778,2,0};
        System.out.println("Girilen Sayi:");
       int sayi=in.nextInt();
       int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;

       for(int i:dizi)
       {
           if(i<sayi)
           {
               if(i>min)
                min=i;
           }
           if(i>sayi)
                if(i<max)
                  max=i;
       }
        System.out.println("Yakin Min:"+min+"\nYakin Max:"+max);


    }



}

