package com.kangce.main.service;

import com.kangce.mybatis.model.Utbasebalancesheet;
import com.kangce.mybatis.model.Utbasecashflowstatement;
import com.kangce.mybatis.model.Utbaseincomestatement;

import java.util.List;

public interface SheetService {
    /**
     * 资产负债表
     *
     * @return
     */
    public List<Utbasebalancesheet> getBalanceSheet(int type);

    /**
     * 现金流量表
     *
     * @return
     */
    public List<Utbasecashflowstatement> getCashFlowSheet();

    /**
     * 损益表
     *
     * @return
     */
    public List<Utbaseincomestatement> getIncomeSheet();
}
