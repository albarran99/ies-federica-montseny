package org.iesfm;

import org.iesfm.reader.LibraryReader;

public class MainLibrary {

    public static void main(String[] args) {
        LibraryReader libraryReader = new LibraryReader();
        Library library = libraryReader.readLibrary();
        library.showBooks();

    }

}
