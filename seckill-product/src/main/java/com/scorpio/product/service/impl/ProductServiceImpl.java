package com.scorpio.product.service.impl;

import com.scorpio.product.domain.ProductPO;
import com.scorpio.product.mapper.ProductMapper;
import com.scorpio.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author st
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductPO add(ProductPO data) {
        data.setStatus(1);
        data.setCreateTime(new Date());
        productMapper.insertSelective(data);
        return productMapper.selectByPrimaryKey(data.getId());
    }
}
