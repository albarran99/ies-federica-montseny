package org.iesfm;

import java.util.Objects;

public class Member {
    private String nif;
    private String name;
    private String surname;
    private int numberMember;
    private int cp;

    public Member(String nif, String name, String surname, int numberMember, int cp) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.numberMember = numberMember;
        this.cp = cp;
    }
    public void info(){
        System.out.println("El socio tiene nombre " + name + " con apellido" + surname + " con numero de socio" + numberMember + " con un nif" + nif + " y codigo postal" + cp);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return numberMember == member.numberMember &&
                cp == member.cp &&
                Objects.equals(nif, member.nif) &&
                Objects.equals(name, member.name) &&
                Objects.equals(surname, member.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, numberMember, cp);
    }


}
