import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine();
        wine.setDate(LocalDate.of(2007, 1, 1));
        wine.getWinePeriod(LocalDate.now());

    }
}