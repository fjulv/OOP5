package homework5;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        UserView userView = new UserView();
        UserPresenter userPresenter = new UserPresenter(user, userView);

        userPresenter.addUserName();
        userPresenter.addUserLogin();
        userPresenter.addUserPassword();
        userPresenter.userInput();
        userPresenter.showData();

        userPresenter.changeUserPassword();
        userPresenter.showData();

    }
}
