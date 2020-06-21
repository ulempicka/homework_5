package bartender;

public class TestBarman {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Kowalski", 17);
        Person person2 = new Person("Piotr", "Nowak", 35);

        Drink drink1 = new Drink("Mojito", 29, true);
        Drink drink2 = new Drink("White Russian", 32, true);
        Drink drink3 = new Drink("Lemonade", 12, false);
        Barman barman1 = new Barman();

        barman1.order(person1,drink1);
        barman1.order(person1,drink3);

        barman1.order(person2,drink2);
        barman1.order(person2, drink3);
    }
}
