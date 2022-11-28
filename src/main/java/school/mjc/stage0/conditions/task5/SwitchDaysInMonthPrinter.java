package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1:
                System.out.println("Yanvar oyi 31 kundan iborat!!!");
                break;
            case 2:
                System.out.println("Febral oyi 28 kundan iborat!!!");
                break;
            case 3:
                System.out.println("Mart oyi 31 kundan iborat!!!");
                break;
            case 4:
                System.out.println("Aprel oyi 30 kundan iborat!!!");
                break;
            case 5:
                System.out.println("May oyi 31 kundan iborat!!!");
                break;
            case 6:
                System.out.println("Iyun oyi 30 kundan iborat!!!");
                break;
            case 7:
                System.out.println("Iyul oyi 31 kundan iborat!!!");
                break;
            case 8:
                System.out.println("Avgust oyi 31 kundan iborat!!!");
                break;
            case 9:
                System.out.println("Sentyabr oyi 30 kundan iborat!!!");
                break;
            case 10:
                System.out.println("Octyabr oyi 31 kundan iborat!!!");
                break;
            case 11:
                System.out.println("Noyabr oyi 30 kundan iborat!!!");
                break;
            case 12:
                System.out.println("Dekabr oyi 31 kundan iborat!!!");
                break;
            default:
                System.out.println("Bunaqa oy mavjud emas!!!");

        }
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter printer=new SwitchDaysInMonthPrinter();
        printer.amountOfDays(13);
    }
}
