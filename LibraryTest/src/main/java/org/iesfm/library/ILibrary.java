package org.iesfm.library;

import java.util.Set;

public interface ILibrary {

    Set<Book> findBooks(String genre);
}
