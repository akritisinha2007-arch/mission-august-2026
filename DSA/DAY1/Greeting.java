import java.util.Scanner;

public class Greeting {
    static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);
//        String message=mygreet("AKRITI");
//        System.out.println(message);
        Scanner input=new Scanner(System.in);
        String name=input.next();
        String message=mygreet(name);
        System.out.println(message);

        String naam="akritisinha";
        change(naam);
        System.out.println(naam);
        //it gives output as akritisinha only and not aks
        //bcz its not changing the oobject ,rather creating a new object

        //System.out.println(nam); -- shows error
        // its scope is only in change method


    }

    static void change(String nam) {
        nam="aks";
    }
    //scoping basically means u can't access the variables defined in a method outside that method

    static String mygreet(String name) {
        String words="Hello"+name;
        return words;

    }

    static String greet(){
        String greeting="how's you";
        return greeting;

    }


}
