import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name, mark, country, description;
    private LocalDate date;

    public Wine() {
    }

    public Wine(String name, String mark, String country, String description, LocalDate date) {
        this.name = name;
        this.mark = mark;
        this.country = country;
        this.description = description;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void getWinePeriod(LocalDate now) {
        System.out.println("Выдержка вина: " + Period.between(date, now).getYears());
    }
}
