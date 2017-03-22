package com.abhishekparekh.twit.services;

import com.abhishekparekh.twit.dao.TwitDao;
import com.abhishekparekh.twit.models.Twit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by abhishek on 3/21/17.
 */
@Service
public class TwitServiceImpl implements TwitService {

    @Autowired
    private TwitDao twitDao;

    @Override
    public Iterable<Twit> findAllTwits() {
        return twitDao.findAllTwits();
    }

    @Override
    public Twit findOneTwit(Long id) {
        return twitDao.findOne(id);
    }

    @Override
    public void save(Twit twit) {
        twitDao.save(twit);
    }
}
