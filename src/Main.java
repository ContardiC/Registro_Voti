public class Main {
    public static void main(String[] args) {
        StudentModel model=new StudentModel();
        View vista=new View("Registro");
        Controller controller=new Controller(vista,model);
        controller.assegnaGestori();
    }
}