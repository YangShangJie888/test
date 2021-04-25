package com.tyust.controller;

import com.tyust.dao.EmployeeDao;
import com.tyust.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author ysj
 * @create 2021-01-28 {TIME}
 */
@Controller
public class AjaxTestController {

    @Autowired
    EmployeeDao employeeDao;

    /**
     * 将返回的数据放在反应体中：
     * 如果是对象，jackon自动将对象转为json格式
     * @return
     */
    @ResponseBody
    @RequestMapping("/getallajax")
    public Collection<Employee> ajaxGetAll(){
        Collection<Employee> all = employeeDao.getAll();
        return all;
    }
}
