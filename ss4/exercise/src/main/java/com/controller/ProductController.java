package com.controller;

import com.model.Product;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("productList", productService.findALl(name));
        return "/list";
    }

    @GetMapping("createForm")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("mess", "add successful");
        productService.save(product);
//        xí nữa hỏi lại
     return "redirect:/product";
    }

    @GetMapping("editForm")
    public String editForm(Model model, @RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes) {
        Product product = productService.findById(id);
        if (product != null) {
            model.addAttribute("product", product);
        } else {
            redirectAttributes.addFlashAttribute("mess", "id not available");
        }
        model.addAttribute("product", new Product());
        return "/edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("mess", "edit successful");
        productService.edit(product);
        return "redirect:/product";
    }

    @GetMapping("delete")
    public String delete(Model model, @RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes) {
        if (productService.findById(id) != null) {
            redirectAttributes.addFlashAttribute("mess", "delete successful");
            productService.delete(id);
        } else {
            redirectAttributes.addFlashAttribute("mess", "id not available");
        }
        return "redirect:/product";
    }
    @GetMapping("detailForm")
    public String detail(@RequestParam(required = false) Integer id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/detail";
    }
}
