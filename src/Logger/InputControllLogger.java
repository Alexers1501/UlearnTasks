package Logger;


public class InputControllLogger extends AbstractLogger{

    public InputControllLogger(String name) {
        super(name);
    }

    @Override
    String debug(String message) {
        return String.format("[DEBUG] %s %s - %s", calendar.toString(), this.getName(), message);
    }

    @Override
    String info(String message) {
        return String.format("[INFO] %s %s - %s", calendar.toString(), this.getName(), message);

    }

    @Override
    String warning(String message) {
        return String.format("[WARNING] %s %s - %s", calendar.toString(), this.getName(), message);

    }

    @Override
    String error(String message) {
        return String.format("[ERROR] %s %s - %s", calendar.toString(), this.getName(), message);

    }

    @Override
    public String toString() {
        return String.format("%s - InputControllLogger", this.getName());
    }
}
