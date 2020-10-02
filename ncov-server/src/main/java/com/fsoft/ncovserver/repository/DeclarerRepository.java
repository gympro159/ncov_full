package com.fsoft.ncovserver.repository;

import com.fsoft.ncovserver.model.Declarer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeclarerRepository extends MongoRepository<Declarer, String> {

}