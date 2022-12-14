public class Test {
    public static void main(String[] args) {
        Employee model = new Employee();
        model.setName("Евгений");
        model.setHours(100);
        model.setHourPayment(1000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeHourPayment(5000);
        controller.updateView();
    }
}