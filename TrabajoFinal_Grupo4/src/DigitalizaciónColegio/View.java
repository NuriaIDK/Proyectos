package DigitalizaciónColegio;

import java.util.List;

public class View {
    public void imprimirListado(List<Alumno> alumnos) {
        System.out.println("\nAlumnos del colegio científico Marie Curie");
        for(Alumno p:alumnos){
            System.out.println(p.toString());
        }
        System.out.println("\nFIN");
    }

    public void mostrarBusquedaxDNIalumno(Alumno p) {
        System.out.println("\nBusqueda por DNI alumno: ");
        System.out.println("\nSus datos registrados son los siguientes: " + "\n"+p.toString());
    }
}
