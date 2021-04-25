package com.tyust.controller;

import com.tyust.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ysj
 * @create 2021-01-24 {TIME}
 */
@RequestMapping("haha")

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String firstRequest(){


        System.out.println("请求收到");

        return "success";

    }
    @RequestMapping(value = "/user/{id}",params = {"username"})
    public String testPathVariable(@PathVariable("id") String id){

        System.out.println(id);

        return "success";
    }
    @RequestMapping(value = "/book/{bid}" ,method = RequestMethod.PUT)
    public String deleteBook(@PathVariable("bid") String bid){
        System.out.println("put" + bid + ".");
        return "success";
    }
    @RequestMapping("/book")
    public String addBook(Book book, BindingResult result){

        List<ObjectError> allErrors = result.getAllErrors();
        System.out.println(book);
        return "success";
    }
}
