void main() {
    sum();
    System.out.println(sum2());
    int ans=sum3(20,30);
    System.out.println(ans);
}
void sum(){
        Scanner in=new Scanner(System.in);
        int a,b,sum;
        a=in.nextInt();
        b= in.nextInt();
        sum=a+b;
        System.out.println(sum);
    }

//return the value;
int sum2(){
    Scanner in=new Scanner(System.in);
    int a,b,sum;
    a=in.nextInt();
    b= in.nextInt();
    sum=a+b;
    return sum;
    //System.out.println(sum);//error: java: unreachable statement
//return means function ends here
}

//pass the value of numbers when u r calling the method in main()
int sum3(int a,int b){
    int sum=a+b;
    return sum;
}