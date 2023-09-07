package com.study0907.study0907;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {
    UsersRepository usersRepository;

    public Users getUsers(String id){
        return usersRepository.findById(id).orElseThrow(null);
    }

    public void createUsers(UsersDTO usersDTO){
        usersRepository.save(Users.of(usersDTO.id(), usersDTO.password(), usersDTO.email()));
    }
}
