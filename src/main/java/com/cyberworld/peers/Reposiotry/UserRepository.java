package com.cyberworld.peers.Reposiotry;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyberworld.peers.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
