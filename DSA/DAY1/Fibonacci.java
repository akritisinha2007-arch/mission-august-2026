void main() {
    Scanner input =new Scanner(System.in);
    int n = input.nextInt();
    int a=0;
    int b=1;
    System.out.print(a+ " " +b + " ");
    int count=2;
    while(count<=n){
        int temp=b;
        b=a+b;
        a=temp;
        count++;
        System.out.print(b + " ");

    }
    System.out.println(b);
}
