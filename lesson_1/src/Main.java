import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Integer a = 2;
        float b = 2;
        Phone me = new Phone("89023984997", "9A", 500);
        System.out.println(me.number);
        me.receiveCall("Тоха", "89023984997");
        System.out.println(a.equals(b));
    }
}
