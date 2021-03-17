package com.example.demo.service.mapper;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDtoRequest;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapFromDto(UserDtoRequest request) {
        User user = new User();
        user.setName(request.getName());
        return user;
    }
}
