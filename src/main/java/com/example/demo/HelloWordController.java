package com.example.demo;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")

public class HelloWordController {

    @ApiOperation("get userinfo")
    @ApiImplicitParam(name = "id",value = "user")
    @GetMapping("get/{id}")
    public String welcome(@PathVariable Long id) {
        return "abc";
    }

}
