package com.scorpio.product.controller;

import com.scorpio.product.domain.ProductPO;
import com.scorpio.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author st
 */
@RestController
@RequestMapping("/product")
@Api(value = "ProductController", description = "商品 API")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ApiOperation(value = "添加", nickname = "ProductController-add", response = ProductPO.class)
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public HttpEntity<?> add(@RequestBody ProductPO data) {
        ProductPO product = productService.add(data);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
