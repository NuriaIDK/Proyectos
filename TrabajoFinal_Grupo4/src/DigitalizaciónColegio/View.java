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

}
