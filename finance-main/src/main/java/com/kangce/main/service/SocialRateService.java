package com.kangce.main.service;

import com.kangce.main.dto.SocialRateParam;
import com.kangce.mybatis.model.Utsocialrate;

import java.util.List;

public interface SocialRateService {
    /**
     * 查询
     */
    List<Utsocialrate> getSocialRate();
    /**
     * 修改  使用list 一次可以修改多种  税率
     */
    Object update(List<SocialRateParam> list);

}
