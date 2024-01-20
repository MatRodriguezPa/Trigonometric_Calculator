import Model.Model;
import View.View;
import Controller.Controller;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.start(true);
    }

}
