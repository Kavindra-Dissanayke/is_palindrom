class Example{
    public static boolean isPalindrome(int num){
        int reverse=0;
        int temp=num;
        while(num!=0){
            reverse=reverse*10;
            reverse=reverse+num%10;
            num/=10;
        }
        return reverse==temp?true:false;
    }
    public static void main(String args[]){
        for(int i=0; i<1000; i++){
            if(isPalindrome(i)){
                System.out.println(i);
                System.out.println();
            }
        }
    }
}