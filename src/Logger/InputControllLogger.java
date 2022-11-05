package Logger;


public class InputControllLogger extends AbstractLogger{

    public InputControllLogger(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return String.format("%s - InputControllLogger", this.getName());
    }
}
