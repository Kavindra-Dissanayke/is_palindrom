import java.util.*;
class Example{
    public static boolean isPrime(int num){
        boolean isPrime=true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        for(int i=2; i<=1000; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
