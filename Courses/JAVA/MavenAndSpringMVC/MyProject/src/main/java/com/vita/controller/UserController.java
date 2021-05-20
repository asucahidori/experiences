package com.vita.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vita.domain.User;
import com.vita.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

 public UserController() {
     System.out.println("UserController");
 }

 @Resource
 private UserServiceImpl userService;

 @RequestMapping(value = "/showUser", method = RequestMethod.GET)
 public String toIndex(HttpServletRequest request, Model model) {
     System.out.println("UserController showUser");
     int id = Integer.parseInt(request.getParameter("id"));
     User user = userService.getUserById(id);
     System.out.println("user: " + user);
//       request.setAttribute("user", user);
     model.addAttribute("user", user);
     return "showUser";
 }
}