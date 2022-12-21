package com.cust.Anno.controller;

import com.cust.Anno.Entity.User;
import com.cust.Anno.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Control {

    private final UserService service;

    public Control(UserService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user)
    {
        System.out.println("Saved");
        User r = service.save(user);
        return ResponseEntity.status(HttpStatus.OK).body(r);
    }
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(user));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<User> fetchProduct(@PathVariable(name="id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(name="id")  long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }
}