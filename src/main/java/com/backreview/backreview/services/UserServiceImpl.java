package com.backreview.backreview.services;

import com.backreview.backreview.dao.UserDao;
import com.backreview.backreview.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
