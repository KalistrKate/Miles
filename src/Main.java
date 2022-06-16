public class Main {
    public static void main(String[] args) {
        int amount = 100; // Стоимость билета
        int bonus = 20; // Бонусные мили
        int miles = amount / bonus;
        System.out.print(miles + " миль начислено");
    }
}
