package com.wyat.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wyat.dao.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAddress(String emailAddress);

    @Override
    void delete(User customerEntity);
}
