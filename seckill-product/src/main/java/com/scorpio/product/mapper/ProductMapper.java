package com.scorpio.product.mapper;


import com.scorpio.product.domain.ProductPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author st
 */
@Mapper
public interface ProductMapper extends tk.mybatis.mapper.common.Mapper<ProductPO> {
}
