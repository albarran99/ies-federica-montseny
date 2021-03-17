package org.iesfm.library;

import java.util.Objects;

public class BookLend {
    private int ISBN;
    private String memberNif;
    private String retriveDate;

    public BookLend(int ISBN, String memberNif, String retriveDate) {
        this.ISBN = ISBN;
        this.memberNif = memberNif;
        this.retriveDate = retriveDate;
    }

    public int compareTo(BookLend bookLend) {
        int nifCompare = memberNif.compareTo(bookLend.getMemberNif());
        if (nifCompare == 0) {
            return retriveDate.compareTo(bookLend.getRetriveDate());
        } else {
            return nifCompare;
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getMemberNif() {
        return memberNif;
    }

    public void setMemberNif(String memberNif) {
        this.memberNif = memberNif;
    }

    public String getRetriveDate() {
        return retriveDate;
    }

    public void setRetriveDate(String retriveDate) {
        this.retriveDate = retriveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookLend)) return false;
        BookLend bookLend = (BookLend) o;
        return ISBN == bookLend.ISBN && Objects.equals(memberNif, bookLend.memberNif) && Objects.equals(retriveDate, bookLend.retriveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, memberNif, retriveDate);
    }
}
