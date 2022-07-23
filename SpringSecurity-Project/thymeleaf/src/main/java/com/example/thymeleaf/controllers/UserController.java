package com.example.thymeleaf.controllers;

import javax.validation.Valid;

import com.example.thymeleaf.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thymeleaf.repository.UserRepository;

@Controller
public class UserController {
private final UserRepository userRepository;

@Autowired
public UserController (UserRepository userRepository) {
	this.userRepository=userRepository;
}

@GetMapping("/index")
public String showUserList(Model model) {
	model.addAttribute("users",userRepository.findAll());
	return"index";
}

@GetMapping("/signup")
public String showform(User user) {
	return "addUser";
}
@PostMapping("/adduser")
public String addUser(@Valid User user,BindingResult result ,Model model) {
	if(result.hasErrors()) {
		return "addUser";
	}
	userRepository.save(user);
	return "redirect:/index";
}
@GetMapping("/edit/{id}")
public String showUpdateForm(@PathVariable("id") long id, Model model) {
    User user =userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    model.addAttribute("user", user);
    
    return "updateUser";
}

@PostMapping("/update/{id}")
public String updateUser(@PathVariable("id") long id, @Valid User user, BindingResult result, Model model) {
    if (result.hasErrors()) {
        user.setId(id);
        return "updateUser";
    }
    
    userRepository.save(user);

    return "redirect:/index";
}

@GetMapping("/delete/{id}")
public String deleteUser(@PathVariable("id") long id, Model model) {
    User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    userRepository.delete(user);
    
    return "redirect:/index";
}
}

