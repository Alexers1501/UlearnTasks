package Customers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command;
        CustomerStorage storage = new CustomerStorage();

        storage.addCustomer("Sasha Ivanova 89089478529 sasha.@gmail.com");
        storage.addCustomer("Ivan Nikolaev 89078478529 nik.@gmail.com");

        do{
            System.out.println("Для получения списка команд введите help");
            System.out.println("Введите команду");
            String s = sc.nextLine();
            command = s.split(" ")[0];
            String data = s.replace(command, "").strip();
            switch (command){
                case "add": {
                    storage.addCustomer(data);
                };break;
                case "list":{
                    storage.listCustomers();
                };break;
                case "remove":{
                    storage.removeCustomer(data);
                };break;
                case "count":{
                    System.out.println(storage.getCount());
                };break;
                case "help":{
                    System.out.println("СПИСОК КОМАНД (ввод данных без скобок!): \n" +
                                        "add <name surname phone email>- добавить клиента;\n" +
                                        "list - вывести список всех лиентов;\n" +
                                        "remove <name surname>- удалить клиента;\n" +
                                        "count - подсчитать всех клиентов;\n" +
                                        "help - примеры команд;\n" +
                                        "exit - выход из приложения.\n");
                };break;
                case "exit": break;
                default:
                    System.out.println("Команды не существует. Введите команду из списка!");
            }
        }while(!command.equals("exit"));
    }
}
