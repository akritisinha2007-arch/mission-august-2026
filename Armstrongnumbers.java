import java.util.Scanner;

public class Armstrongnumbers {
    //print all 3 digit armstrong num.
    static void main() {
//        Scanner input = new Scanner(System.in);
//        int n=input.nextInt();
        for (int i = 100; i <1000 ; i++) {
            if(armstrong(i)) {
                System.out.println(i);
            }
        }

    }
    static boolean armstrong(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
