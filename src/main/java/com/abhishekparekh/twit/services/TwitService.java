package com.abhishekparekh.twit.services;

import com.abhishekparekh.twit.models.Twit;

/**
 * Created by abhishek on 3/21/17.
 */
public interface TwitService {

    Iterable<Twit> findAllTwits();
    Twit findOneTwit(Long id);
    void save(Twit twit);

}
