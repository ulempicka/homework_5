package leapYear;

public class YearCheck {

    boolean isLeap(int year){
        if(year % 4 == 0 && year % 100 != 0){   //zamiast else if mozna by bylo tutaj dodac LUB
           return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    void showIsLeap(int year){
        System.out.println("Czy rok " + year + " jest przestepny: " + isLeap(year));
    }
}
