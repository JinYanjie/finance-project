package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestParam("name") String name ){
        int count = departmentService.add(name);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

}
