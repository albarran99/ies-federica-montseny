package Library.org.iesfm.library;

public interface ILibrary {
    void showBooks();

    void showBooksByGenre(String genre);

    void showMembers();

    void showMembers(int postCode);

    void showMemberLends(String nif);

    void showMemberLends(int numberMember);

    boolean memberHasLend(int numberMember, int isbn);
}
