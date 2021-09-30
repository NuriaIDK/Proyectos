package DigitalizaciónColegio;

public class Controller {

    private Colegio colegio;
    private View view;

    public Controller(String nombre) {
        colegio = Colegio.obtenerInstancia(nombre);
        view = new View();
    }

    public void registrarAlumno(String... arg) {
        Alumno alumno = Factoria.dameObjeto(arg);
        colegio.registrar(alumno);
    }

    public void mostrarListadoAlumno() {
        view.imprimirListado(colegio.getAlumnos());
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
