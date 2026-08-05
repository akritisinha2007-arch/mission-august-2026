
void main() {
    Scanner input = new Scanner(System.in);
    //Take input from usser till user doesn't press x or X
    int ans=0;
    while(true){
        System.out.print("Enter the operator:");
        char op=input.next().trim().charAt(0);
        System.out.println();
        if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
            //input 2 numbers
            System.out.println("Enter two numbers:");
            int a= input.nextInt();
            int b= input.nextInt();
            if (op == '+') {
                ans=a+b;
            }
            else if(op=='-'){
                ans=a-b;
            }
            else if(op=='*'){
                ans=a*b;
            }
            else if(op=='/'){
                if(b==0){
                    System.out.println("Division by zero");
                }else{
                    ans=a/b;
                }
            }
            else if(op=='%'){
                ans=a%b;
            }
        }
        else if(op=='x' || op=='X'){
            break;
        }
        else{
            System.out.println("Invalid operation");
        }
        System.out.println(ans);
    }

}