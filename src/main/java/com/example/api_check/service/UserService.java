package com.example.api_check.service;

import com.example.api_check.DTO.UserDTO;
import com.example.api_check.entity.User;
import com.example.api_check.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){

    userRepo.save(modelMapper.map(userDTO, User.class));
    return userDTO;

    }

    public List<UserDTO> getAllUsers(){
       List<User> userList =  userRepo.findAll();
       return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }


    public UserDTO updateUser(UserDTO userDTO){
       userRepo.save(modelMapper.map(userDTO,User.class));
       return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

}
