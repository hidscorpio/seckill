package com.scorpio.product.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 上传的Controller
 * @author st
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    public HttpEntity<?> picUpload(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
