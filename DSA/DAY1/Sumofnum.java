import java.sql.SQLOutput;

void main() {
    Scanner input=new Scanner(System.in);
    float num1=input.nextInt();
    float num2= input.nextFloat();// if u r asking for float but giving integer it will work but if u r asking for int but giving float , it won't work because
    //DESTINATION TYPE SHOULD BE GREATER THAN SOURCE TYPE
    //TYPE CONVERSION AUTOMATICALLY ..SHOWS NO ERROR ON GIVING AN INTEGER VALUE
    float sum=num1+num2;
    System.out.println("Sum:"+sum);

    //TYPE CASTING
    int num=(int)(67.56f);
    System.out.println(num);

    //AUTOMATIC TYPE PR0MOTION IN EXPRESSIONS
    int a=257;
    byte b=(byte)(a);//maximum range of byte variable is 256
    //thus it gives output as the remainder after dividing a by 256
    System.out.println(b);

    byte c=40;
    byte d=50;
    byte e=100;
    int f=c*d/e;//this expression is performed in int and not byte since java automatically promotes each byte to int when this expression is evaluated

    System.out.println(f);

   // byte g=50;
 //   g=g*2; //gives error:- java: incompatible types: possible lossy conversion from int to byte
    //because the expression is promoted to int while evaluatipn ,so how can an int value assigned to a byte variable

    int number ='A';
    System.out.println(number);//automatic conversion

    System.out.println(3*34.4361327f);

    byte g=42;
    char h='a';
    short i=1024;
    int j=59900;
    float k=5.66f;
    double l=0.123456;
    double result=(k*g)+(j/h)-(l-i);
    System.out.println((k*g)+"  " + (j/h) +"  " + (l-i));
    System.out.println(result);



}
