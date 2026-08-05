import org.w3c.dom.ls.LSInput;

void main() {
    //WHILE LOOP
    int c=1;
    while(c!=5){
        System.out.println(c);
        c++;
    }
    //FOR LOOP
    for(int i=1;i<=5;i+=2){
        System.out.println(i);
    }
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for (int i = 1; i <n ; i++) {
        //System.out.println(i);//in next line
        System.out.print(i+" ");//in same line

    }
    //DO-WHILE LOOP
    int f=1;
    do {
        System.out.println(f);//loop executes atleast once
        f++;

    }while(f<=6);

}
