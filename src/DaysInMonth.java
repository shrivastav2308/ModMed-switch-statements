public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1500));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(0));

        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2021));
    }
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) return false;
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) return true;
        if(year % 4 == 0 && year % 100 != 0) return true;
        else return false;
    }
    public static int getDaysInMonth(int mm, int yy) {
        if(mm < 1 || mm > 12 || yy < 1 || yy > 9999) return -1;
        switch(mm){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                boolean b = isLeapYear(yy);
                if(b){
                    return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
        }
        return -1;
    }
}
