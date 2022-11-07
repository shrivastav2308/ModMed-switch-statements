public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) System.out.println("1");
//        else if(value == 2) System.out.println("2");
//        else System.out.println("Not 1 or 2");
        int switchVal = 5;
        switch (switchVal) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }
//        challenge
        char ch = 'Z';
        switch (ch) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(ch);
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}