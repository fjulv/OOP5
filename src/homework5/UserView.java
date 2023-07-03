package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        System.out.println("Введи свое имя: ");
        String name = scanner.nextLine();
        System.out.println("Данные сохранены");
        return name;
    }

    public String getLogin() {
        System.out.println("Придумай логин: ");
        String login = scanner.nextLine();
        System.out.println("Данные сохранены");
        return login;
    }

    public String getPassword() {
        System.out.println("Придумай пароль: ");
        return scanner.nextLine();
    }

    public String changeName() {
        System.out.println("Для изменения имени введи свое новое имя: ");
        String newName = scanner.nextLine();
        return newName;
    }

    public String changeLogin() {
        System.out.println("Для изменения логина введи новый логин: ");
        String newLogin = scanner.nextLine();
        return newLogin;
    }

    public String changePassword() {
        System.out.println("Для изменения пароля введи новый пароль: ");
        String newPassword = scanner.nextLine();
        return newPassword;
    }

    public Map<String, String> enter() {
        Map<String, String> userEnter = new HashMap<>();
        System.out.println("Для входа введи логин: ");
        String logIn = scanner.nextLine();
        System.out.println("Для входа введи пароль: ");
        String passIn = scanner.nextLine();
        userEnter.put(logIn, passIn);
        return userEnter;
    }

    public String showMyData() {
        System.out.println("Хотите увидеть Ваши данные? (Да/Нет)");
        String isShow = scanner.nextLine();
        return isShow;
    }

}
