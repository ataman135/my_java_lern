public class Main {
    public static void main(String[] args) {
        Phone me = new Phone("89023984997", "9A", 500);
        System.out.println(me.number);
        me.receiveCall("Тоха", "89023984997");
    }
}
