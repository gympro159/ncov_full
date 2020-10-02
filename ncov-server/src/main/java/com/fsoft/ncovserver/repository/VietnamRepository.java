package com.fsoft.ncovserver.repository;

import com.fsoft.ncovserver.model.Vietnam;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VietnamRepository extends MongoRepository<Vietnam, String> {

}