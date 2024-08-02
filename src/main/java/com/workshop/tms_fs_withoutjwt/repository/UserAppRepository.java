package com.workshop.tms_fs_withoutjwt.repository;

import com.workshop.tms_fs_withoutjwt.domain.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAppRepository extends JpaRepository<UserApp, Long> {
}
