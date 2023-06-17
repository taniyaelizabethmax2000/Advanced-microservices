package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.resource.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//1 repository can persist only 1 resource.here resource is user
}
