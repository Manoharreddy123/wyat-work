package com.wyat.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wyat.dao.domain.AddressEntity;


@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

}
