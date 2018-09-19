package com.gradletest.gradle.repositories;

import com.gradletest.gradle.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,Integer> {


}
