package com.controller;

import com.model.Mail;
import com.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MailController {
    @Autowired
    private IMailService mailService;

    @ModelAttribute("languages")
    public String[] arrayLanguages() {
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }

    @ModelAttribute("pageSize")
    public String[] arrayPageSize() {
        return new String[]{"5", "10", "15", "25", "50", "100"};
    }

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("listSetting", mailService.findAll());
        return "list";
    }

    @GetMapping("update-form/{id}")
    public String showSetting(@PathVariable("id") int id, Model model) {
        Mail mail = mailService.findById(id);
        model.addAttribute("mail", mail);
        return "edit";
    }

    @PostMapping("edit/save")
    public String save(@ModelAttribute("mail") Mail mail, RedirectAttributes redirectAttributes) {
        mailService.confirm(mail);
        redirectAttributes.addFlashAttribute("mess", "edit successful");
        return "redirect:list";
    }
}
