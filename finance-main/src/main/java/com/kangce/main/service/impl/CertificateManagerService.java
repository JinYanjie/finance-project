package com.kangce.main.service.impl;

import com.kangce.main.dto.CertificateParam;

import java.util.List;
import java.util.Map;

public interface CertificateManagerService {

    /**
     * 添加凭证
     *
     * @param certificateList
     * @return
     */
    public int addCertificate(List<CertificateParam> certificateList);

    /**
     * 显示凭证
     */
    public List<Map<String,Object>> getCertificate(int state);

    /**
     * 审核凭证
     *
     * @param userId 审核人员iD
     * @param state  审核状态
     * @return
     */
    public int update(String certificateNum,int currentNum,int userId, int state);
}
