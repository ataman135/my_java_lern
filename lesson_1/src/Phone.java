public class Phone {
    int weight;
    String model, number;
    static String country;

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String nameCall) {
        receiveCall(nameCall, "");
    }

    public void receiveCall(String nameCall, String numberCall) {
        System.out.println("Звонит абонент по имени " + nameCall + ((numberCall != "") ? " номер " + numberCall : ""));
    }

}
