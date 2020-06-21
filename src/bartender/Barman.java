package bartender;

public class Barman {
    void order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.getContainsAlcohol()) {
            System.out.println("odmowa sprzedaży");
        } else {
            System.out.println(person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty: " + drink.getPrice());
        }
    }
}
