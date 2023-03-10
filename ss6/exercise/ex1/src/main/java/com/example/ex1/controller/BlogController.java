package com.example.ex1.controller;

import com.example.ex1.model.Blog;
import com.example.ex1.service.IBlogService;
import com.example.ex1.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogTypeService iBlogTypeService;
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false) String tittle){
        model.addAttribute("tittle",tittle);
        model.addAttribute("blogList",iBlogService.findAll(tittle));
        return "/list";
    }
    @GetMapping("/create-form")
    public String createBlog(Model model){
        model.addAttribute("blogTypeList",iBlogTypeService.findAll());
        model.addAttribute("blog",new Blog());
        return "/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","successful new creation");
        iBlogService.save(blog);
        return "redirect:/blog";
    }
    @GetMapping("/edit-form")
    public String editForm(Model model, @RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes){
        if(iBlogService.findById(id)!=null){
            model.addAttribute("blogTypeList",iBlogTypeService.findAll());
            model.addAttribute("blog", iBlogService.findById(id));
        }else {
            redirectAttributes.addFlashAttribute("msg","ID does not exist");
            return "redirect:/blog";
        }
        return "/edit";
    }
    @PostMapping("edit")
    public String edit(@ModelAttribute Blog blog,RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","Successful upgrade");
        iBlogService.edit(blog);
        return "redirect:/blog";
    }
    @GetMapping("delete")
    public String delete(@RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes){
        if(iBlogService.findById(id)!=null){
            redirectAttributes.addFlashAttribute("msg","Successful delete");
            iBlogService.delete(id);
        }else {
            redirectAttributes.addFlashAttribute("msg","ID does not exist");
        }
        return "redirect:/blog";
    }
}
