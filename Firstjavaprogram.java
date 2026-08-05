import java.sql.SQLOutput;
import java.util.Scanner;

public class Firstjavaprogram {
    public static void main(String[] args){
        System.out.print(2345 );
        System.out.println("Hello world!");
        Scanner input= new Scanner(System.in);
        System.out.println(input.next());
        System.out.println(input.nextInt());
        System.out.println(input.nextLine());//reads an entire line of input until a line separator is encountered.
        // It is commonly used for reading strings that may include spaces.
    }


}
