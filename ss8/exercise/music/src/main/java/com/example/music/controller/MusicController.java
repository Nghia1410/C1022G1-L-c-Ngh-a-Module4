package com.example.music.controller;


import com.example.music.dto.MusicDTO;
import com.example.music.model.Music;
import com.example.music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/music")
@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("musicList", iMusicService.findAll());
        return "/list";
    }

    @GetMapping("create-form")
    public String createForm(Model model) {
        model.addAttribute("musicDTO", new MusicDTO());
        return "/create";
    }

    @PostMapping("create")
    public String create(@Validated @ModelAttribute() MusicDTO musicDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("musicDTO", musicDTO);
            return "/create";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDTO, music);
        iMusicService.create(music);
        redirectAttributes.addFlashAttribute("mess", "thêm mới thành công");
        return "redirect:/music";
    }

    @GetMapping("edit-form")
    public String editForm(Model model, @RequestParam(required = false) Integer id) {
        model.addAttribute("musicDTO", iMusicService.findById(id));
        return "/edit";
    }

    @PostMapping("edit")
    public String edit(@Validated @ModelAttribute() MusicDTO musicDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("musicDTO", musicDTO);
            return "/edit";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDTO, music);
        iMusicService.edit(music);
        redirectAttributes.addFlashAttribute("mess", "chỉnh sửa bài hát thành công");
        return "redirect:/music";
    }
}
