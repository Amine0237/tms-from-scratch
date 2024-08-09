package com.workshop.tms_fs_withoutjwt.service.mapper;

import com.workshop.tms_fs_withoutjwt.domain.UserApp;
import com.workshop.tms_fs_withoutjwt.service.DTO.UserAppDTO;
import org.springframework.stereotype.Service;

@Service
public class UserAppMapper {
    public UserApp toEntity(UserAppDTO userAppDTO){
        UserApp userApp = new UserApp();
        userApp.setId(userAppDTO.getId());
        userApp.setEmail(userAppDTO.getEmail());
        userApp.setPassword(userAppDTO.getPassword());
        userApp.setUsername(userAppDTO.getUsername());
        userApp.setFirstName(userAppDTO.getFirstName());
        userApp.setLastName(userAppDTO.getLastName());

        return userApp;
    }
}
