package com.jyh.mall.service;

import com.jyh.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: jyh
 * @Date: 2020/3/3
 * @Description: com.jyh.mall.service
 * @version: 1.0
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
