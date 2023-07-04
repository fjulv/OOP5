package homework5;

import java.util.Map;
import java.util.Scanner;

public class UserPresenter implements Creatable, Changable, Enterable, Showable{
    private User user;
    private UserView view;
    Scanner scanner = new Scanner(System.in);

    public UserPresenter(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    public void addUserName() {
        user.setName(view.getName());
    }

    public void addUserLogin() {
        user.setLogin(view.getLogin());
    }

    public void addUserPassword() {
        String pass = view.getPassword();
        System.out.println("Повтори пароль: ");
        String checkPass = scanner.nextLine();
        if (checkPass.equals(pass)) {
            user.setPassword(pass);
            System.out.println("Данные сохранены");
        } else {
            System.out.println("Введенные пароли не совпадают");
        }
    }

    public void changeUserName() {
        user.setName(view.changeName());
    }

    public void changeUserLogin() {
        user.setLogin(view.changeLogin());
    }

    public void changeUserPassword() {
        System.out.println("Для изменения пароля введи старый пароль: ");
        String oldPass = scanner.nextLine();
        if (oldPass.equals(user.getPassword())) {
            user.setPassword(view.changePassword());
        } else {
            System.out.println("Старый пароль введен неверно. Изменение невозможно. Введи верный пароль.");
        }
    }

    public void userInput() {
        Map<String, String> userIn = view.enter();
        if (userIn.containsKey(user.getLogin())) {
            if (userIn.containsValue(user.getPassword())) {
                System.out.println("Добро пожаловать!");
            }
            System.out.println("Введен неверный логин и/или пароль. Попробуй еще раз");
        } else {
            System.out.println("Введен неверный логин и/или пароль. Попробуй еще раз");
        }
    }

    public void showData() {
        Map<String, String> userIn = view.enter();
        if (userIn.containsKey(user.getLogin())) {
            if (userIn.containsValue(user.getPassword())) {
                System.out.println("Добро пожаловать!");
                String isShow = view.showMyData();
                if (isShow.equalsIgnoreCase("да")) {
                    System.out.println(user.toString());
                } else {
                    System.out.println("Ну что ж, может в другой раз :) ");
                }
            }
        } else {
            System.out.println("Введен неверный логин и/или пароль. Попробуй еще раз");
        }
    }
}
