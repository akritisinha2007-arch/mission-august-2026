void main() {
    Scanner input=new Scanner(System.in);
    int i= input.nextInt();
    String dept= input.next();
    switch (i) {
        case 1 -> System.out.println("Akriti sinha");
        case 2 -> System.out.println("Arav sinha");
        case 3 -> {
            System.out.println("Emp3");
            switch (dept) {
                case "IT":
                    System.out.println("IT");
                    break;
                case "HR":
                    System.out.println("HR");
                    break;
                default:
                    System.out.println("INvalid dept");
            }
        }
        default -> System.out.println("invalid empid");
    }


}