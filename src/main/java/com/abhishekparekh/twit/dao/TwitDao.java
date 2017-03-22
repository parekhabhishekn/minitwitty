package com.abhishekparekh.twit.dao;

import com.abhishekparekh.twit.models.Twit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by abhishek on 3/21/17.
 */
@Repository
public interface TwitDao extends CrudRepository<Twit,Long> {
    @Query("select t from Twit t where t.user.id=:#{principal.id}")
    List<Twit> findAllTwits();
}
