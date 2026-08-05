void main() {
    Scanner input =new Scanner(System.in);
    char c= input.next().trim().charAt(0);
    if(c>'A'&& c<'Z') {
        System.out.println("Upper case");
    }
    else if(c>'a' && c<'z'){
        System.out.println("lower case");
    }
    else{
        System.out.println("input alphabet");
    }

}