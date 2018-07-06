package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(1)
                .username("Zygfryd Kolanko")
                .sex('M')
                .birthdate(LocalDate.of(1980, 11, 11))
                .postsPublished(0)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(2)
                .username("Żaneta Podgardle")
                .sex('F')
                .birthdate(LocalDate.of(1993, 2, 13))
                .postsPublished(100)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(3)
                .username("Ireneusz Boczek")
                .sex('M')
                .birthdate(LocalDate.of(2000, 1,  31))
                .postsPublished(5)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(4)
                .username("Amanda Ramionko")
                .sex('F')
                .birthdate(LocalDate.of(1983, 12, 14))
                .postsPublished(2)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(5)
                .username("Arletta Wątroba")
                .sex('F')
                .birthdate(LocalDate.of(1975, 4, 22))
                .postsPublished(2)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(6)
                .username("Zawisza Biały")
                .sex('M')
                .birthdate(LocalDate.of(1989, 8, 17))
                .postsPublished(1)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(7)
                .username("Roland Kiełbaska")
                .sex('M')
                .birthdate(LocalDate.of(1977, 6, 1))
                .postsPublished(0)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(8)
                .username("Armand Zielonka")
                .sex('M')
                .birthdate(LocalDate.of(1965, 2, 2))
                .postsPublished(74)
                .build());

        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(9)
                .username("Irmina Nerka")
                .sex('F')
                .birthdate(LocalDate.of(1998, 9, 30))
                .postsPublished(0)
                .build());
        theUserList.add(new ForumUser.ForumUserBuilder()
                .userID(10)
                .username("Donata Jakubik")
                .sex('F')
                .birthdate(LocalDate.of(1999, 7, 20))
                .postsPublished(0)
                .build());

    }

    public List<ForumUser> getTheUserList() { return new ArrayList<>(theUserList); }
}
