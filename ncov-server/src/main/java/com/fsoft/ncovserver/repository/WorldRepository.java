package com.fsoft.ncovserver.repository;

import com.fsoft.ncovserver.model.World;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorldRepository extends MongoRepository<World, String> {

}