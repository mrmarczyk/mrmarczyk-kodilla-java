package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooksWithShallowCopy() {

        //given
        //creating set of books for library
        Library library = new Library("library1");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.of(1977,1,1))));
        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        //when
        //then
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
    }

    @Test
    public void testGetBooksWithDeepCopy() {

        //given
        //creating set of books for library
        Library library = new Library("library1");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.of(1977,1,1))));
        System.out.println(library);

        //making a shallow clone of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //when
        deepClonedLibrary.getBooks().remove(new Book("Title1", "Author1", LocalDate.of(1977,1,1)));
        System.out.println(deepClonedLibrary);
        //then
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(9, deepClonedLibrary.getBooks().size());
    }
}
