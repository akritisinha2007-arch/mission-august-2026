void main() {
    Scanner in = new Scanner(System.in);
    String fruit=in.next();

//SWITCH STATEMENT ENHANCED
    System.out.println(switch (fruit) {
        case "mango" -> "King of fruits";
        case "apple" -> "red fruit";
        case "orange" -> "round fruit";
        case "grapes" -> "small fruit";
        default -> "Invalid fruit";
    });

    Scanner date = new Scanner(System.in);
    int day=date.nextInt();
    switch (day) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Invalid day number");
    }
    Scanner d = new Scanner(System.in);
    int daa=d.nextInt();
    switch (daa){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day number");
    }

    Scanner din = new Scanner(System.in);
    int dinn=din.nextInt();
    switch (dinn) {
        case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        case 6, 7 -> System.out.println("Weekend");
        default -> System.out.println("Invalid day number");
    }
//    switch (dinn){
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//        case 5:
//            System.out.println("Weekday");
//            break;
//        case 6:
//        case 7:
//            System.out.println("Weekend");
//            break;
//        default:
//            System.out.println("Invalid day number");
//    }



}
