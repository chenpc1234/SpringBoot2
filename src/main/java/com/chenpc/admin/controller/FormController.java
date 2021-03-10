package com.chenpc.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/8/03/08  16:49
 */
@Controller
@Slf4j
public class FormController {

    @GetMapping("/form_layouts")
    private String goFormLayouts() {
        return "forms/form_layouts";
    }

    @PostMapping("/upload")
    private String upload(@RequestParam("email") String email,
                          @RequestParam("password") String password,
                          @RequestPart("photo") MultipartFile photo,
                          @RequestPart("photos") MultipartFile[] photos) {
        log.info(email);
        log.info(password);
        log.info(String.valueOf(photo.getSize()));
        log.info(String.valueOf(photos.length));
        return "main";
    }
}
