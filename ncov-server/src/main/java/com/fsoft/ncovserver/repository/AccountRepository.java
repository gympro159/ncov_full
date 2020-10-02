package com.fsoft.ncovserver.repository;

import com.fsoft.ncovserver.model.Account;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

}