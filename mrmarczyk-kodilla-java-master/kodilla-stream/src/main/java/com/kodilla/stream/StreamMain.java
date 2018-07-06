package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        //Zadanie 7.1: Upiększacz tekstów

/*
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("string", (string) -> string.toUpperCase());
        poemBeautifier.beautify("string", (string) -> "*** " + string + " ***");
        poemBeautifier.beautify("string", (string) -> string.replace("r", ""));
*/

        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultlistOfForumUsers = theForum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (LocalDate.now().minusYears(20).isAfter(forumUser.getBirthdate())))
                .filter(forumUser -> forumUser.getPostsPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultlistOfForumUsers.size());
        theResultlistOfForumUsers.entrySet().stream().map(entry -> entry.getKey() + ":" + entry.getValue()).forEach(System.out::println);

        /*
        BookDirectory theBookDirectory = new BookDirectory();

        //toList()
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        //toMap()
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        //joining()
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        */

    }
}