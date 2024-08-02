package com.workshop.tms_fs_withoutjwt.service;

import com.workshop.tms_fs_withoutjwt.domain.UserApp;
import com.workshop.tms_fs_withoutjwt.repository.UserAppRepository;
import com.workshop.tms_fs_withoutjwt.service.DTO.UserAppDTO;
import com.workshop.tms_fs_withoutjwt.service.mapper.UserAppMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserAppService {

    private final UserAppRepository userAppRepository;
    private final UserAppMapper userAppMapper;
    public List<UserApp> findAll() {
        return userAppRepository.findAll();
    }

    public Optional<UserApp> findById(Long id) {
        return userAppRepository.findById(id);
    }

    public UserApp save(UserAppDTO userAppDTO) {
        return userAppRepository.save(userAppMapper.toEntity(userAppDTO));
    }

    public void deleteById(Long id) {
        Optional<UserApp> userAppOptional = userAppRepository.findById(id);
        if (userAppOptional.isPresent()) {
            userAppRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("UserApp not found with id " + id);
        }
    }
}

