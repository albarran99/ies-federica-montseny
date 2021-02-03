package org.iesfm;

import java.util.Objects;

public class BookLend {
    private int isbn;
    private String lendDate;
    private String nifMember;
    private String retrieveDateLoan;

    public BookLend(int isbn, String lendDate, String nifMember, String retrieveDateLoan) {
        this.isbn = isbn;
        this.lendDate = lendDate;
        this.nifMember = nifMember;
        this.retrieveDateLoan = retrieveDateLoan;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getNifMember() {
        return nifMember;
    }

    public void setNifMember(String nifMember) {
        this.nifMember = nifMember;
    }

    public String getRetrieveDateLoan() {
        return retrieveDateLoan;
    }

    public void setRetrieveDateLoan(String retrieveDateLoan) {
        this.retrieveDateLoan = retrieveDateLoan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return isbn == bookLend.isbn &&
                Objects.equals(lendDate, bookLend.lendDate) &&
                Objects.equals(nifMember, bookLend.nifMember) &&
                Objects.equals(retrieveDateLoan, bookLend.retrieveDateLoan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, lendDate, nifMember, retrieveDateLoan);
    }


}