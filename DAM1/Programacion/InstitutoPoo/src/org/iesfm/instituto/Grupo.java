package org.iesfm.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Grupo {
    private String nombre;
    private String aula;
    private Alumno[] alumno;

    public String getNombre() {
        return nombre;
    }

    public void infoGrupo() {
        System.out.println("El grupo es " + nombre + " Se realiza en el alua " + aula + " Y con la siguiente lista de alumnos " + alumno);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }

    public Grupo(String nombre, String aula, Alumno alumno[]) {
        this.nombre = nombre;
        this.aula = aula;
        this.alumno = alumno;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(nombre, grupo.nombre) &&
                Objects.equals(aula, grupo.aula) &&
                Arrays.equals(alumno, grupo.alumno);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, aula);
        result = 31 * result + Arrays.hashCode(alumno);
        return result;
    }
}
