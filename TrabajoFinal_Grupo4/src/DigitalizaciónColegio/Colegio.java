package DigitalizaciónColegio;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private static Colegio colegio = new Colegio();
    private String nombre;
    private static List<Alumno> alumnos;

    private Colegio() {
    }
    public static Colegio obtenerInstancia(String nombre){
        colegio.setNombre(nombre);
        alumnos = new ArrayList<>();
        return colegio;
    }


    public void registrar(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(List<Alumno> alumnos) {
        Colegio.alumnos = alumnos;
    }
}
