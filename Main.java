import BackEnd.Controller.EventController;
import FrontEnd.MainUI;

public class Main {
    public static void main(String[] args) {
        EventController controller = new EventController();
        javax.swing.SwingUtilities.invokeLater(() -> new MainUI(controller));
    }
}
