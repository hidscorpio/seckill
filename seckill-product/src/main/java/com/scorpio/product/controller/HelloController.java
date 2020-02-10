package com.scorpio.product.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author st
 */
@RestController
@Api(tags = "HelloController",description = "欢迎接口")
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ApiOperation(value = "测试接口",notes = "TestApi")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "name",dataType = "String"),
            @ApiImplicitParam(paramType = "query",name = "age",dataType = "int")
    })
    public void hello(String name,Integer age){
        System.out.println(name+"今年" + age);
    }
}
