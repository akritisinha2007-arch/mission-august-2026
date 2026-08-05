public class Scope {
    static void main(String[] args) {
        int a=10;
        int b=20;
        a=90;
        {
           // int a=78; //Second scope:-BlOCK SCOPE  if u have defined a variable inside a function , u can modify it but cannot define it again
            a=78;//reassign the original ref variable to some other value
            //its not creating a new object as to create a new one it should be initialised first
            
            int c=99;//values initialised in this block , remains in the block only
        }
        int c=100;
        System.out.println(c);
        System.out.println(a);//value is modified
       // System.out.println(c);
        //shows error : i.e if u initialise or create a new variable inside the brackets or inside a block, so can only be accessed in that block

        
        //SCOPING IN FOR LOOP
        for (int i = 0; i <4 ; i++) {
            System.out.println(i);
            int num=90;
           // int a=0;//cannot be initialised again ..since its already initialised inside the method ..but can be modified
        }
       // System.out.println(i); //cannot be accessed outside the for loop
    }
    static void random(int marks){
        int n=200;
        System.out.println(n);
       // System.out.println(a);
        //First scope:- function scope  if u define any variable in a function u can access that variable inside the function only
    //same thing for parameters as well
    }
}
//ANYTHING INITIALISED OUTSIDE CANNOT BE INITIALISED AGAIN BUT CAN BE USED INSIDE.. AND ANYTHING INITIALISED INSIDE CANNOT BE USED OUTSIDE
