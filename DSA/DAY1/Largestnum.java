void main() {
    Scanner input=new Scanner(System.in);
    int a= input.nextInt();
    int b= input.nextInt();
    int c=input.nextInt();
    //METHOD-1
    if(a>b && a>c){
        System.out.println(a);
    }
    else if(b>a && b>c){
        System.out.println(b);
    }
    else{
        System.out.println(c);
    }
    //METHOD 2
    int d=input.nextInt();
    int e=input.nextInt();
    int f= input.nextInt();
    int max=d;
    if(e>max){
        max=e;
    }
    if(f>max){
        max=f;
    }
    System.out.println(max);

//METHOD 3
    int maximum=Math.max(c,Math.max(a,b));

    //int maximum=Math.max(a,b);
//    if(c>maximum) {
//        maximum=c;
//    }
    System.out.println(maximum);

}
