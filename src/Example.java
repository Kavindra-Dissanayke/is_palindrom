/*
import java.util.*;
class Example{
    public static void main(String []args) {
        Scanner input=new Scanner(System.in);
       // int a,b,c,d,e,f,g,h,k,j;
        int [] a= new int[10];
        int tot=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Input number "+(i+1)+": ");
            a[i]=input.nextInt();
        }
        for (int j = 0; j <10 ; j++) {
            tot+=a[j];
        }
        System.out.println("Total : "+tot);

    }
}
*/
/*

import java.util.*;
class Example{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("Input array size : ");
        int num= input.nextInt();
        Random random=new Random();
        int[] a=new int[num];

        //Read,input, store integers into array “a”  Using Random numbers  [0 to 100]
        for (int i = 0; i <num ; i++) {
            a[i]= random.nextInt(100);
        }

        //--------------------------------
        int total=0;
        for(int i=0; i<num; i++){

            total+=a[i];
        }

        //insert code here to prints data using a for-loop
        //eg->[78, 56, 34, 12, 89, 12,.....]
        System.out.print("[");
        for(int i=0; i<num; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println("\b\b]");

        System.out.println("Total : "+total);
    }
}
*/

/*
import java.text.DecimalFormat;
import java.util.*;

class Example {

    static final DecimalFormat df = new DecimalFormat("0.00");//0.000 , 0.0000
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size : ");
        int num = input.nextInt();
        Random random = new Random();
        int[] a = new int[num];

        //Read,input, store integers into array “a”  Using Random numbers  [0 to 100]
        for (int i = 0; i < num; i++) {
            a[i] = random.nextInt(100);
        }

        //--------------------------------
        int total = 0;
        for (int i = 0; i < num; i++) {

            total += a[i];
        }
      */
/*  int max = 0;
        for (int i = 0; i < num; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }
*//*

        int max =a[0];
        for (int i = 1; i < num; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }

        int min = a[0];
        for (int i = 1; i < num; i++) {
            if (a[i] < min) {
                min = a[i];

            }
        }
        double avg=(double)total/num;
        //double avg=total/num;
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b]");

        System.out.println("Total : " + total);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Average : "+df.format(avg));
    }
}
*/
