public class Array {
    static void main() {
        //syntax
//        datatype[] variable_name=new datatype[size]
        int[] rolln=new int[5];
        //index of array starts from 0
        //arrays are mutable i.e their values can change
        int[] rnos={2,4,5,76,2,67};

        System.out.println(rolln[0]);//0

        String[] arr=new String[4];
        System.out.println(arr[0]);//null -special literal ..u can cast it to any particular reference type but u can't create a null type , u can't declare its variable type
        //null a= new null[]    not possible shows error
        //String str=null; - who can do this
        //int num=null; - gives error .. null cannot be assigned to any primitives , only assign to non primitives


    }
}
