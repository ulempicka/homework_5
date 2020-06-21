package leapYear;

public class TestYear {
    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();

        yearCheck.showIsLeap(2020);
        yearCheck.showIsLeap(2019);
        yearCheck.showIsLeap(2012);
        yearCheck.showIsLeap(2100);
        yearCheck.showIsLeap(2000);
    }
}
