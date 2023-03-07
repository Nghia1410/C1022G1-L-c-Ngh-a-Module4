package com.example.validate.controller;

import com.example.validate.dto.UserDto;
import com.example.validate.model.User;
import com.example.validate.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public String findAll(Model model) {
        model.addAttribute("userList", userService.showAll());
        return "/list";
    }

    @GetMapping("/user/create-form")
    public String showFormCreate(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/create";
    }

    @PostMapping("/user/create")
    public String Create(@Validated @ModelAttribute UserDto userDto,
                         BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDto", userDto);
            return "/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userService.save(user);
        redirectAttributes.addFlashAttribute("mess", "thêm mới thành công");
        return "redirect:/user";
    }

}
