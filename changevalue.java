import java.util.Arrays;

public class changevalue {
    static void main(String[] args) {
        //create an array
        int[] a={1,3,45,6,2};//a is object's reference
        change(a);//when ref. is passed to this parameter,the ref itself is passed by call by value because the value i.e. passsed refers to the object
        System.out.println(Arrays.toString(a));

    }
    static void change(int[] nums){ //nums will be another value of the a reference variable pointing to the object
        nums[0]=59;//if you make a change to thee object via this ref variable ,same object will be changed
    }
    //value is changed because both nums and a point to the same object and in function no new object is created
    //we are not modifying the string ,we are modifying array
    //strings are immutable

}
