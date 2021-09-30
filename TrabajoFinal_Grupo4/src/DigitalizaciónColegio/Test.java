package DigitalizaciónColegio;

public class Test {
    public static void main(String[] args) {
        Controller controller = new Controller("Marie Curie");
        controller.registrarAlumno("AR","780315694","Fernando","Tobar","13","2","16.5");
        controller.registrarAlumno("AN","712315645","Ricardo","Juarez","12","1","nacional");
        controller.mostrarListadoAlumno();
    }
}
