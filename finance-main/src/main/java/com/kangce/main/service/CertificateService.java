package com.kangce.main.service;

import com.kangce.main.dto.CertificateWordParam;
import com.kangce.mybatis.model.Utcredentialsword;

import java.util.List;

/**
 * 凭证字
 */
public interface CertificateService {
    /**
     * 获取 凭证字
     *
     * @return
     */
    List<Utcredentialsword> getWord();

    /**
     * 修改凭证字
     */
    int editWord(CertificateWordParam utcredentialsword);

    /**
     * 增加 凭证字
     */
    int addWord(CertificateWordParam utcredentialsword);

    /**
     * 删除凭证字
     */
    int deleteWord(int id);

}
