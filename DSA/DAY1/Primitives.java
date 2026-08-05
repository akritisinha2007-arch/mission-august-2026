import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
             //  int rollno=64;
//         char letter='r';
//         float marks=98.67f;
//         double largedecimal=6358987240.63463;
//         long largeinteger=8759732983865L;
//         boolean check=false;

// //capita; I in Integer makes it a class--this is known as Wrapper classes
//         Integer rno= 64;


//         //String is not primitive data type
//         String name="Akriti";

        //INTEGER INPUT :-
        Scanner input=new Scanner(System.in);
        System.out.println("please enter some number");
        System.out.print("please enetr some input :");
        int rollno = input.nextInt();
        System.out.println("Your roll number is :" + rollno);
        int a=234_000_000;//underscores are ignored..underscores are used because commas are not allowed
        System.out.println(a);

        //STRING INPUT :-
        Scanner str=new Scanner(System.in);
        String name = str.nextLine();//prints full sentence
        System.out.println(name);
        String word =str.next();//prints first word only , not the full sentence
        System.out.println(word);

        //FLOAT INPUT :-
        Scanner marks=new Scanner(System.in);
        float mark = marks.nextFloat();
        System.out.println(mark);








    }

}
