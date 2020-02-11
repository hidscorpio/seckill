package com.scorpio.product.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品表
 * @author st
 */
@Data
@Table(name = "t_product")
public class ProductPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "status")
    private Integer status;
    @Column(name = "create_time")
    private Date createTime;
}
