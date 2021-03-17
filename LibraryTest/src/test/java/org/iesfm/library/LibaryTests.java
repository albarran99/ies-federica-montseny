package org.iesfm.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LibaryTests {

    @Test
    public void hasGenreTest() {
        HashSet<Book> books = new HashSet<>();
        HashSet<String> genres = new HashSet<>();
        genres.add("terror");
        books.add(new Book(1, "TituloTerror", "pepe", genres));
        Library library = new Library("LibreriaPepe", books, new LinkedList<>(), new TreeSet<>());

        Set<Book> terrorBooks = library.findBooks("terror");

        Set<Book> expectedTerrorBooks = new HashSet<>();
        expectedTerrorBooks.add(new Book(1, "TituloTerror", "pepe", genres));

        Assert.assertEquals(expectedTerrorBooks, terrorBooks);
    }
}
