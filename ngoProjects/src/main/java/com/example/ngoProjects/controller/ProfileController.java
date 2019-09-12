package com.example.ngoProjects.controller;

import com.example.ngoProjects.entity.User;
import com.example.ngoProjects.repo.RoleRepo;
import com.example.ngoProjects.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @GetMapping(value = "/profile")
    public String profileView(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user",authentication.getName());
        User user = this.userRepo.findByUsername(authentication.getName());
        model.addAttribute("fname",user.getFirstName());
        model.addAttribute("lname",user.getLastName());
        model.addAttribute("age",user.getAge());
        model.addAttribute("birthDate",user.getBirthDate());
        model.addAttribute("gender",user.getGender());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("mobile",user.getMobile());

        model.addAttribute("list",this.userRepo.findAll());
        /*
                        <td th:text="${user.id}"></td>
                        <td th:text="${user.username}"></td>
                        <td th:text="${user.firstName}"></td>
                        <td th:text="${user.lastName}"></td>
                        <td th:text="${user.birthDate}"></td>
                        <td th:text="${user.age}"></td>
                        <td th:text="${user.gender}"></td>
                        <td th:text="${user.address}"></td>
                        <td th:text="${user.regiDate}"></td>
                        <td th:text="${user.email}"></td>
                        <td th:text="${user.mobile}"></td>
                        <td th:text="${user.password}"></td>
                        <td th:text="${user.lastModifiedDate}"></td>

                        <td th:text="${user.status}"></td>
                        <td th:text="${user.conformationToken}"></td>
         */

        return "profile";
    }
}

