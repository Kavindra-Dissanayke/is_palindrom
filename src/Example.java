//
//import java.util.*;
//class Example{
//    public static void main(String []args) {
//        Scanner input=new Scanner(System.in);
//       // int a,b,c,d,e,f,g,h,k,j;
//        int [] a= new int[10];
//        int tot=0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Input number "+(i+1)+": ");
//            a[i]=input.nextInt();
//        }
//        for (int j = 0; j <10 ; j++) {
//            tot+=a[j];
//        }
//        System.out.println("Total : "+tot);
//
//    }
//}
//
//
//
//import java.util.*;
//class Example{
//    public static void main(String []args){
//        Scanner input=new Scanner(System.in);
//        System.out.print("Input array size : ");
//        int num= input.nextInt();
//        Random random=new Random();
//        int[] a=new int[num];
//
//        //Read,input, store integers into array “a”  Using Random numbers  [0 to 100]
//        for (int i = 0; i <num ; i++) {
//            a[i]= random.nextInt(100);
//        }
//
//        //--------------------------------
//        int total=0;
//        for(int i=0; i<num; i++){
//
//            total+=a[i];
//        }
//
//        //insert code here to prints data using a for-loop
//        //eg->[78, 56, 34, 12, 89, 12,.....]
//        System.out.print("[");
//        for(int i=0; i<num; i++){
//            System.out.print(a[i]+", ");
//        }
//        System.out.println("\b\b]");
//
//        System.out.println("Total : "+total);
//    }
//}
//
//
//import java.text.DecimalFormat;
//import java.util.*;
//
//class Example {
//
//    static final DecimalFormat df = new DecimalFormat("0.00");//0.000 , 0.0000
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input array size : ");
//        int num = input.nextInt();
//        Random random = new Random();
//        int[] a = new int[num];
//
//        //Read,input, store integers into array “a”  Using Random numbers  [0 to 100]
//        for (int i = 0; i < num; i++) {
//            a[i] = random.nextInt(100);
//        }
//
//        //--------------------------------
//        int total = 0;
//        for (int i = 0; i < num; i++) {
//
//            total += a[i];
//        }
//      /*  int max = 0;
//        for (int i = 0; i < num; i++) {
//            if (a[i] > max) {
//                max = a[i];
//
//            }
//        }
//*/
//        int max =a[0];
//        for (int i = 1; i < num; i++) {
//            if (a[i] > max) {
//                max = a[i];
//
//            }
//        }
//
//        int min = a[0];
//        for (int i = 1; i < num; i++) {
//            if (a[i] < min) {
//                min = a[i];
//
//            }
//        }
//        double avg=(double)total/num;
//        //double avg=total/num;
//        System.out.print("[");
//        for (int i = 0; i < num; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        System.out.println("\b\b]");
//
//        System.out.println("Total : " + total);
//        System.out.println("Max : " + max);
//        System.out.println("Min : " + min);
//        System.out.println("Average : "+df.format(avg));
//    }
//}
//import java.util.*;
//class Example{
//    public static void main(String []args) {
//        Scanner input=new Scanner(System.in);
//        int[] a=new int[10];
//
//        //Read,input, store integers [0 to 100] Using Random numbers
//        Random r=new Random();
//        for (int i = 0; i < 10; i++){
//            a[i]=r.nextInt(101); //0 to 100
//        }
//
//        //Find total
//        int total=0;
//        for(int i=0; i<10; i++){
//            total+=a[i];
//        }
//
//        //find maximum
//        int max=a[9];
//        for(int i=0; i<10; i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        //find minimum
//        int min=a[8];
//        for(int i=0; i<10; i++){
//            if(a[i]<min){
//                min=a[i];
//            }
//        }
//        System.out.print("[");
//        for(int i=0; i<10; i++){
//            System.out.print(a[i]+", ");
//        }
//        System.out.println("\b\b]");
//        System.out.println("Total   : "+total);
//        System.out.println("Maximum : "+max);
//        System.out.println("Minimum : "+min);
//    }
//}
//
//import java.util.*;
//
//class Example {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("Input no of students : ");
//        final int N = input.nextInt();
//        int marks[] = new int[N];
//        for (int i = 0; i < N; i++) {
//            marks[i] = random.nextInt(101);
//        }
//
//        //1. Create an array to store student's marks, named "marks", size “N”
//
//        //2. Read and store marks [Read random number 0 to 100]
//
//        //3. Find Total
//
//        //4. Find max
//
//        int total = 0;
//        for (int i = 0; i < N; i++) {
//            total += marks[i];
//        }
//
//        int max = marks[0];
//        for (int i = 0; i < N; i++) {
//            if (marks[i] > max) {
//                marks[i] = max;
//            }
//        }
//        int min = marks[0];
//        for (int i = 0; i < N; i++) {
//            if (marks[i] < min) {
//                min = marks[i];
//            }
//
//        }
//        System.out.print("[");
//        for (int k = 0; k < N; k++) {
//            System.out.print(marks[k] + ", ");
//        }
//        System.out.println("\b\b]");
//
//
//        //5. Find min
//
//        //6. Print marks [45, 23,.....]
//
//        System.out.println("Total   : " + total);
//        System.out.println("Maximum : " + max);
//        System.out.println("Minimum : " + min);
//    }
//}
//import java.util.*;
//class Example{
//    public static void main(String []args){
//        int[] xr={34,23,65,87,91,12,16,78,29,81,49};
//        String s1=Arrays.toString(xr);
//        System.out.println(s1);//[34,23,65,87,91,12,16,78,29,81,49]
//
//        Arrays.sort(xr);
//        System.out.println(Arrays.toString(xr));//[12, 16, 23, 29, 34, 49, 65, 78, 81, 87, 91]
//    }
//}
//import java.util.*;
//class Example{
//    public static void main(String []args){
//        int[] xr={90,78,87,12,54,14,71,19,56,76};
//      //  System.out.println(printArray(xr));   //[90,78,87,12,54,14,71,19,56,76]
//        System.out.println( printArray(xr));
//    }
//    public static String printArray(int [] a){
//      //  System.out.println(Arrays.toString(a));
//
//       return Arrays.toString(a);
//    }
//}
//
//import java.util.*;
//class Example{
//    public static void main(String []args){
//        int[] xr={90,78,87,12,54,14,71,19,56,76};
//        printArray(xr); //[90,78,87,12,54,14,71,19,56,76]
//    }
//    public  static void printArray(int a[]){
//        System.out.print("[");
//        for (int b:a){
//            System.out.print(b+", ");
//        }
//        System.out.println("\b\b]");
//    }
//}
//import java.util.*;
//
//class Example{
//    public static void printArray(int [] xr){
//        System.out.print("[");
//        for (int i = 0; i < xr.length; i++){
//            System.out.print(xr[i]+", ");
//        }
//        System.out.println("\b\b]");
//    }
//    public static void main(String []args){
//        int[] xr={90,78,87,12,54,14,71,19,56,76};
//        printArray(xr); //[90,78,87,12,54,14,71,19,56,76]
//    }
//}
//import java.util.*;
//class Example{
//    public static void increment(int a, int b, int c, int d){
//        a++;
//        b++;
//        c++;
//        d++;
//        System.out.println(a+","+b+","+","+c+","+d);
//    }
//    public static void main(String []args){
//        int[] xr={100,200,300,400};
//        System.out.println(Arrays.toString(xr));
//
//        increment(xr[0],xr[1],xr[2],xr[3]);
//        System.out.println(Arrays.toString(xr));
//    }
//}
//
//
/*
import java.util.*;
class Example{
    public static void increment(int[] a){
        a[0]++;
        a[1]++;
        a[2]++;
        a[3]++;
    }
    public static void main(String []args){
        int[] xr={100,200,300,400};
        System.out.println(Arrays.toString(xr));

        increment(xr);
        System.out.println(Arrays.toString(xr));
    }
}
*/

///*import java.util.*;
//
//class Example {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input no of students : ");
//        final int N = input.nextInt();
//
//        //1. Create an array to store student's marks, named "marks", size
//        int[] marks = createAnArray(N);
//
//        //2. Read and store marks [Read random number 0 to 100]
//        readMarks(marks);
//
//        //3. Find Total
//        int total = findTotal(marks);
//
//        //4. Find max
//        int max = findMax(marks);
//
//        //5. Find min
//        int min = findMin(marks);
//
//
//        //6. Print marks [45, 23,.....]
//        printMarks(marks);
//
//        System.out.println("Total   : " + total);
//        System.out.println("Maximum : " + max);
//        System.out.println("Minimum : " + min);
//    }
//
//    private static int findMin(int[] d) {
//        int minn = d[0];
//        for (int i = 1; i < d.length; i++) {
//            if (d[i] < minn) {
//                minn = d[i];
//            }
//        }
//        return minn;
//    }
//
//    public static int[] createAnArray(int n) {
//     *//*   int y[]= new int[n];
//        return y;*//*
//        return new int[n];
//    }
//
//    public static void readMarks(int[] marks) {
//        Random r = new Random();
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = r.nextInt(101);
//        }
//        // System.out.println(Arrays.toString(marks));
//    }
//
//    public static int findTotal(int[] b) {
//        int tot = 0;
//        for (int i = 0; i < b.length; i++) {
//            tot += b[i];
//        }
//        return tot;
//    }
//
//    public static int findMax(int[] c) {
//        int maxx = c[0];
//        for (int i = 1; i < c.length; i++) {
//            if (c[i] > maxx) {
//                maxx = c[i];
//            }
//        }
//
//        return maxx;
//    }
//    public static void printMarks(int []e){
//        System.out.println(Arrays.toString(e));
//    }
//
//}*/

//import java.util.*;
//
//class Example {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input no of students : ");
//        final int N = input.nextInt();
//
//        //1. Create an array to store student's marks, named "marks", size
//        int[] marks = createAnArray(N);
//
//        //2. Read and store marks [Read random number 0 to 100]
//        readMarks(marks);
//        printMarks(marks);
//        System.out.println("Total   : " + findTotal(marks));
//        System.out.println("Maximum : " + findMax(marks));
//        System.out.println("Minimum : " + findMin(marks));
//    }
//
//    private static int findMin(int[] d) {
//        int minn = d[0];
//        for (int i :d) {
//            if (i< minn) {
//                minn = i;
//            }
//        }
//        return minn;
//    }
//
//    public static int[] createAnArray(int n) {
//     /*   int y[]= new int[n];
//        return y;*/
//        return new int[n];
//    }
//
//    public static void readMarks(int[] marks) {
//        Random r = new Random();
//        for (int i=1;i<marks.length;i++) {
//           marks[i] = r.nextInt(101);
//        }
//        // System.out.println(Arrays.toString(marks));
//    }
//
//    public static int findTotal(int[] b) {
//        int tot = 0;
//        for (int i :b) {
//            tot += i;
//        }
//        return tot;
//    }
//
//    public static int findMax(int[] c) {
//        int maxx = c[0];
//        for (int i :c) {
//            if (i > maxx) {
//                maxx = i;
//            }
//        }
//
//        return maxx;
//    }
//    public static void printMarks(int []e){
//       // System.out.println(Arrays.toString(e));
//        System.out.print("[");
//        for (int x:e){
//            System.out.print(x+",");
//        }
//        System.out.println("\b\b]");
//    }
//
//}
//
import java.util.*;
import java.util.*;
class Example{
    public static void main(String []args) {
        int[] ar={54,67,98,12,43,58,91,47,29,99,61};
        reversePrint(ar); //[61,99,29,47,91,58,43,12,98,67,54]
    }
    public static void reversePrint(int [] ar){
        int tempArray[]=new int[ar.length];
       /* for (int i = 1; i <= ar.length ; i++) {
       tempArray[i-1]=ar[ar.length-i];*/
    /*   tempArray[0]=ar[ar.length-1];
    /*   tempArray[1]=ar[ar.length-2];
       tempArray[2]=ar[ar.length-3];
       tempArray[3]=ar[ar.length-4];*/
            for (int i = 0; i < ar.length ; i++) {
                tempArray[i] = ar[ar.length - (i+1)];
            }
        /*}*/
        System.out.println(Arrays.toString(tempArray));
    /*    System.out.println(tempArray[1]);
        System.out.println(tempArray[2]);
        System.out.println(tempArray[3]);*/
    }
}


