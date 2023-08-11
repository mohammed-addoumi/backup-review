package com.backreview.backreview.dao;

import com.backreview.backreview.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
