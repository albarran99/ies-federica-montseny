package Library.org.iesfm.library;

import java.util.Objects;

public class Member {
    private String nif;
    private String name;
    private String surname;
    private int postcode;
    private int numbermember;

    public Member(String nif, String name, String surname, int postcode, int numbermember) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.postcode = postcode;
        this.numbermember = numbermember;
    }

    public boolean isFrom (int postcode){
        return this.postcode == postcode;
    }

    public void info() {
        System.out.println(name + " , " + surname + " . NIF: " + nif + ". Numero De Socio: " + numbermember + ". Codigo Postal " + postcode);
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

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getNumbermember() {
        return numbermember;
    }

    public void setNumbermember(int numbermember) {
        this.numbermember = numbermember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return postcode == member.postcode && numbermember == member.numbermember && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surname, member.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, postcode, numbermember);
    }
}
