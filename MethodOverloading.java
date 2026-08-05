public class MethodOverloading {
    static void main() {
        fun(67);
       fun("akriti");
      // fun();//error : ambiguity method call
        //no suitable method found for fun(no arguments)
        //    method MethodOverloading.fun(int) is not applicable
        //      (actual and formal argument lists differ in length)
        //    method MethodOverloading.fun(java.lang.String) is not applicable
        //      (actual and formal argument lists differ in length)
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    //two functions of same name can exist if their parameters are different
  //method overloading happens at compile time
    //either  number of arguments should be different or the type of argument should be different


}
