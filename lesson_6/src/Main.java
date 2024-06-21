public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(2, 5, "Шарик");
        dog.move();

        Duck duck = new Duck(3, 1, "Кря");
        duck.walk();
        duck.move();
    }
}