public class Duck extends Animal{
    public Duck() {
    }

    public Duck(int weight, int age, String name) {
        super(weight, age, name);
    }

    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }
}
