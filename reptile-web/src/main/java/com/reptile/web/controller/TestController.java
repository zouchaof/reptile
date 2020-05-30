package com.reptile.web.controller;

import com.github.pagehelper.PageHelper;
import com.reptile.mapper.dao.product.ProductInfoMapper;
import com.reptile.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestController {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @RequestMapping("test")
    @ResponseBody
    public String fun(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setBarcode("123");
        productInfoMapper.insertSelective(productInfo);
        PageHelper.startPage(1,10);
        System.out.println(productInfoMapper.selectAll());
        return "1";
    }

}
