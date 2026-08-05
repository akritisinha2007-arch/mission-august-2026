public class Shadowing {
    static int x=100;//this will be shadowed at line 7

    static void main(String[] args) {
        System.out.println(x);//100
        int x;
        //System.out.println(x);
        //java: variable x might not have been initialized
        //shows error because shadowing happens when the variable is declared

        x=39;
        //scope begins when value is initialised

        System.out.println(x);//39
        // x is initialised again..so the scope overlaps..so the variable at higher level scope is hidden
        fun();
    }

    private static int fun() {
        System.out.println(x);//100
        return 0;
    }
}
