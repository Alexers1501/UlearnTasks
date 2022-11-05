package Logger;

import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();

        InputControllLogger inputLogger1 = new InputControllLogger("Вход пользователя");
        inputLogger1.setCalendar(
                TimeZone.getDefault(), 2022,11, 5, 9, 10, 15);
        InputControllLogger inputLogger2 = new InputControllLogger("Обнаружен неавторизованный доступ в систему");
        inputLogger2.setCalendar(
                TimeZone.getDefault(), 2022,11, 5, 9, 10, 30);

        DefaultLogger defaultLogger1 = new DefaultLogger("Обнаружен пользователь");
        defaultLogger1.setCalendar(
                TimeZone.getDefault(), 2022,11, 5, 9, 12, 30);
        DefaultLogger defaultLogger2 = new DefaultLogger("Не удалось найти данные пользователя");
        defaultLogger2.setCalendar(
                TimeZone.getDefault(), 2022,11, 5, 9, 12, 35);

        logManager.addLogger(inputLogger1);
        logManager.addLogger(inputLogger2);
        logManager.addLogger(defaultLogger1);
        logManager.addLogger(defaultLogger2);

        logManager.printLoggers();

        System.out.println(inputLogger1.info("msg1"));
        System.out.println(inputLogger2.debug("msg2"));
        System.out.println(defaultLogger1.error("msg3"));
        System.out.println(defaultLogger2.warning("msg4"));

        System.out.println(logManager.getLogger("Вход пользователя"));
        System.out.println(logManager.getLogger("Вход пользователя2222"));


    }
}
