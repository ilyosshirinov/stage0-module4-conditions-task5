package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0 )  || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("kabisa yili");
        } else {
            System.out.println("kabisa yili emas!!!");
        }
    }

    public static void main(String[] args) {
        LeapYearPrinter printer = new LeapYearPrinter();
        printer.isLeapYear(1932);
    }
}
