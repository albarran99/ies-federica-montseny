package org.iesfm.datastructures;

import java.util.Objects;

public class Nodo {
    private Nodo next;
    private int value;

    public Nodo(Nodo next, int value) {
        this.next = next;
        this.value = value;
    }

    public Nodo (int value) {
        this (null, value);
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        Nodo nodo = (Nodo) o;
        return value == nodo.value && Objects.equals(next, nodo.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, value);
    }
}
