package com.fsoft.ncovserver.controller;

import java.util.List;

import com.fsoft.ncovserver.model.Account;
import com.fsoft.ncovserver.model.Declarer;
import com.fsoft.ncovserver.model.Vietnam;
import com.fsoft.ncovserver.model.World;
import com.fsoft.ncovserver.repository.AccountRepository;
import com.fsoft.ncovserver.repository.DeclarerRepository;
import com.fsoft.ncovserver.repository.VietnamRepository;
import com.fsoft.ncovserver.repository.WorldRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class MainController {

    private VietnamRepository vietnamRepository;
    private WorldRepository worldRepository;
    private AccountRepository accountRepository;
    private DeclarerRepository declarerRepository;

    public MainController(VietnamRepository vietnamRepository, WorldRepository worldRepository, AccountRepository accountRepository, DeclarerRepository declarerRepository) {
        this.vietnamRepository = vietnamRepository;
        this.worldRepository = worldRepository;
        this.accountRepository = accountRepository;
        this.declarerRepository = declarerRepository;
    }

    //Vietnam
    @GetMapping("/vietnam")
    public List<Vietnam> getAllVietnam() {
        return vietnamRepository.findAll();
    }

    @PostMapping("/vietnam")
    public void insertVietnam(@RequestBody Vietnam vietnam){
        this.vietnamRepository.insert(vietnam);
    }

    @PutMapping("/vietnam")
    public void updateVietnam(@RequestBody Vietnam vietnam){
        this.vietnamRepository.save(vietnam);
    }

    @DeleteMapping("/vietnam/{id}")
    public void deleteVietnam(@PathVariable("id") String id){
        this.vietnamRepository.deleteById(id);;
    }


    //World
    @GetMapping("/world")
    public List<World> getAllWorld() {
        return worldRepository.findAll();
    }

    @PostMapping("/world")
    public void insertWorld(@RequestBody World world){
        this.worldRepository.insert(world);
    }

    @PutMapping("/world")
    public void updateWorld(@RequestBody World world){
        this.worldRepository.save(world);
    }

    @DeleteMapping("/world/{id}")
    public void deleteWorld(@PathVariable("id") String id){
        this.worldRepository.deleteById(id);;
    }

    //Account
    @GetMapping("/account")
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @PostMapping("/account")
    public void insertAccount(@RequestBody Account account){
        this.accountRepository.insert(account);
    }

    @PutMapping("/account")
    public void updateAccount(@RequestBody Account account){
        this.accountRepository.save(account);
    }

    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") String id){
        this.accountRepository.deleteById(id);;
    }

    //Declarer
    @GetMapping("/declarer")
    public List<Declarer> getAllDeclarer() {
        return declarerRepository.findAll();
    }

    @PostMapping("/declarer")
    public void insertDeclarer(@RequestBody Declarer declarer){
        this.declarerRepository.insert(declarer);
    }

    @PutMapping("/declarer")
    public void updateDeclarer(@RequestBody Declarer declarer){
        this.declarerRepository.save(declarer);
    }

    @DeleteMapping("/declarer/{id}")
    public void deleteDeclarer(@PathVariable("id") String id){
        this.declarerRepository.deleteById(id);;
    }
}