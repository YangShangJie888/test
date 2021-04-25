package com.tyust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ysj
 * @create 2021-01-28 {TIME}
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "username",required = false) String username,
                         @RequestParam(value = "headerimg") MultipartFile file,
                         Model model){
        System.out.println("上传的文件信息");
        System.out.println("文件的名字" + file.getName());
        System.out.println("文件的名字" + file.getOriginalFilename());
        //文件保存
        try {
            file.transferTo(new File("D:\\yy\\" + file.getOriginalFilename()));
            model.addAttribute("msg","上传成功");
        } catch (Exception e) {
            model.addAttribute("msg","上传失败" + e.getMessage());
        }
        return "forward:/index.jsp";
    }
    @RequestMapping("/upload1")
    public String upload1(@RequestParam(value = "username",required = false) String username,
                         @RequestParam(value = "headerimg") MultipartFile[] file,
                         Model model){
        System.out.println("上传的文件信息");

        for (MultipartFile multipartFile : file) {

            if (!multipartFile.isEmpty()){

                //文件保存
                try {
                    multipartFile.transferTo(new File("D:\\yy\\" + multipartFile.getOriginalFilename()));
                    model.addAttribute("msg","上传成功");
                } catch (IOException e) {
                    model.addAttribute("msg","上传失败" + e.getMessage());
                }

            }

        }
        return "forward:/index.jsp";
    }

}
