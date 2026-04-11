package com.ead.authuser.services;

import com.ead.authuser.dtos.UserRecordDto;
import com.ead.authuser.models.UserModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    List<UserModel> findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UserModel userModel);

    UserModel registerUser(UserRecordDto userRecordDto);

    boolean existsByUserName(String username);

    boolean existsByEmail(String email);

    UserModel updateUser(UserRecordDto userRecordDto, UserModel userModel);
}
