package finalproject;

import java.time.LocalDate;

public class ProcessingDate {
    private LocalDate date;

    public ProcessingDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
