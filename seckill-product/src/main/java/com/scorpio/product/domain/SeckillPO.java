package com.scorpio.product.domain;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * @author st
 */
@Data
@Table(name = "t_seckill")
public class SeckillPO {
    @Id
    @Column(name = "seckill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seckillId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 库存数量
     */
    private Integer inventory;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 总数量
     */
    @Column(name = "total_number")
    private Integer totalNumber;
}