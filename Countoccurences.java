void main() {
    Scanner input =new Scanner(System.in);
    int n = input.nextInt();
    int target = input.nextInt();
    int c=0;
    while(n!=0){
        int rem=n%10;
        if(rem==target){
            c++;
        }
        n=n/10;
    }
    System.out.println(c);

}