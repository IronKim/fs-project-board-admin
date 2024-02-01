package com.fs.projectboardadmin.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("url")
    public String exposeUrl(HttpServletRequest request) {
        return request.getRequestURI();
    }
}
