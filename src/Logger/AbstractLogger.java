package Logger;

import java.time.LocalDate;
import java.util.TimeZone;

public abstract class AbstractLogger {

    protected String calendar;
    private String name;

    public AbstractLogger(String name) {
        this.name = name;
    }

    abstract String debug (String message);
    abstract String info (String message);
    abstract String warning (String message);
    abstract String error (String message);

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
     return null;
    }

    public void setCalendar(TimeZone timeZone, int year, int month, int day, int hour, int min, int sec){
        LocalDate date = LocalDate.of(year, month, day);
        calendar = String.format("<%s %s %d %d:%d:%d %s %d>",
                date.getDayOfWeek().name(), date.getMonth().name(), day,
                hour, min, sec, timeZone.getDisplayName(), year);
    }
}
