package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User justin = new Millenials("Justin Bieber");
        User xavier = new YGeneration( "Xavier Nielsen");
        User paulien = new ZGeneration("Paulien Carnegie");

        //When
        String justinWillPost = justin.sharePost();
        System.out.println("Justin will post on: " + justinWillPost);
        String xavierWillPost = xavier.sharePost();
        System.out.println("Xavier will post on: " + xavierWillPost);
        String paulienWillPost = paulien.sharePost();
        System.out.println("Paulien will post on: " + paulienWillPost);

        //Then
        Assert.assertEquals("Facebook", justinWillPost);
        Assert.assertEquals( "Twitter", xavierWillPost);
        Assert.assertEquals("Snapchat", paulienWillPost);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User justin = new Millenials("Justin Bieber");

        //When
        String justinWillPost = justin.sharePost();
        System.out.println("Justin is posting on: " + justinWillPost);
        justin.setSocialPublisher(new SnapchatPublisher());
        justinWillPost = justin.sharePost();
        System.out.println("Justin will now post on: " + justinWillPost);

        //Then
        Assert.assertEquals("Snapchat", justinWillPost);
    }
}
