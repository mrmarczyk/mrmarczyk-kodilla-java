package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Zygfryd Kolanko", 'M', 1980, 11, 11, 0));
        theUserList.add(new ForumUser(2, "Żaneta Podgardle", 'F', 1993, 2, 13, 100));
        theUserList.add(new ForumUser(3, "Ireneusz Boczek", 'M', 2000, 1, 31, 5));
        theUserList.add(new ForumUser(4, "Amanda Ramionko", 'F', 1975, 4, 22, 2));
        theUserList.add(new ForumUser(5, "Arletta Wątroba", 'F', 1983, 12, 14, 2));
        theUserList.add(new ForumUser(6, "Zawisza Biały", 'M', 1989, 8, 17, 1));
        theUserList.add(new ForumUser(7, "Roland Kiełbaska", 'M', 1977, 6, 1, 0));
        theUserList.add(new ForumUser(8, "Armand Zielonka", 'M', 1965, 2, 2, 74));
        theUserList.add(new ForumUser(9, "Irmina Nerka", 'F', 1998, 9, 30, 0));
        theUserList.add(new ForumUser(10, "Donata Jakubik", 'F', 1999, 7, 20, 0));
    }

    public List<ForumUser> getTheUserList() { return new ArrayList<>(theUserList); }
}
