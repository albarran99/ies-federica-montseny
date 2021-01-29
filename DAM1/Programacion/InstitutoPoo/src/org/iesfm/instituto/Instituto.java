package org.iesfm.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Instituto {
    private String nombre;
    private Grupo[] grupo;

    public Instituto(String nombre, Grupo[] grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public void infoInstituto() {
        System.out.println("El instituto tiene de nombre " + nombre + " Con grupos " + grupo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo[] getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo[] grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) &&
                Arrays.equals(grupo, instituto.grupo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(grupo);
        return result;
    }
}
