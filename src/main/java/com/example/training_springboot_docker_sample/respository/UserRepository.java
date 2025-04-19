package com.example.training_springboot_docker_sample.respository;


import com.example.training_springboot_docker_sample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
