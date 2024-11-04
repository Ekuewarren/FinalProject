package finalproject;

import java.time.LocalDate;

public class ExpirationDate {
    private LocalDate date;

    public ExpirationDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(date);
    }

    @Override
    public String toString() {
        return date.toString();
    }
}

