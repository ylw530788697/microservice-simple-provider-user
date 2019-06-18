package com.itmuch.dao;

import com.itmuch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/16 22:50
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
