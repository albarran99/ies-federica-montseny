package Library.org.iesfm.library;

import java.util.Objects;

public class BookLend {
    private String memberNif;
    private int isbn;
    private String LendDate;
    private String retrievedate;

    public BookLend(String memberNif, int isbn, String lendDate, String retrievedate) {
        this.memberNif = memberNif;
        this.isbn = isbn;
        LendDate = lendDate;
        this.retrievedate = retrievedate;
    }

    public String getMemberNif() {
        return memberNif;
    }

    public void setMemberNif(String memberNif) {
        this.memberNif = memberNif;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getLendDate() {
        return LendDate;
    }

    public void setLendDate(String lendDate) {
        LendDate = lendDate;
    }

    public String getRetrievedate() {
        return retrievedate;
    }

    public void setRetrievedate(String retrievedate) {
        this.retrievedate = retrievedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return isbn == bookLend.isbn && Objects.equals(memberNif, bookLend.memberNif) && Objects.equals(LendDate, bookLend.LendDate) && Objects.equals(retrievedate, bookLend.retrievedate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNif, isbn, LendDate, retrievedate);
    }
}
