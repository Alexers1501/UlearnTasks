package Logger;

import java.util.ArrayList;
import java.util.List;

public class LogManager {
    static List<AbstractLogger> listLogger;

    public LogManager() {
        listLogger = new ArrayList<>();
    }

    public void addLogger(AbstractLogger logger){
        listLogger.add(logger);
    };

    public AbstractLogger getLogger(String name){
        for (AbstractLogger logger : listLogger)
            if (logger.getName().equals(name))
                return logger;
        return new DefaultLogger("");
    };
    public void printLoggers(){
        for (AbstractLogger logger: listLogger)
            System.out.println(logger);
    };
}
