package Logger;


public class DefaultLogger extends AbstractLogger {

    public DefaultLogger(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("%s - DefaultLogger", this.getName());
    }
}
