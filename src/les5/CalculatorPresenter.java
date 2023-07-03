package les5;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double number = view.getInputNumber();
        char operator = view.getInputOperator();
        double number2 = view.getInputNumber();
        model.setResult(number);

        switch (operator) {
            case '+':
                model.add(number2);
                break;
            case '-':
                model.subtract(number2);
                break;
            case '*':
                model.multiply(number2);
                break;
            case '/':
                model.divide(number2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        view.displayResult(model.getResult());
    }
}
