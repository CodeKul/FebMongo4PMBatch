package com.example.SpringBatchFebMongo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "saveOrder")
    public String saveOrder(@RequestBody User user) {
        userRepository.save(user);
        return "Order Saved....!";
    }

    @GetMapping(value = "getOrder")
    public List<User> getOrders(){
        return userRepository.findAll();
    }

}
