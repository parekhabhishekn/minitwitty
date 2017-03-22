package com.abhishekparekh.twit.dao;

import com.abhishekparekh.twit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abhishek on 3/21/17.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
