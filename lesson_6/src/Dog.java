public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int weight, int age, String name) {
        super(weight, age, name);
    }

    public void move() {
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле");
    }
}
