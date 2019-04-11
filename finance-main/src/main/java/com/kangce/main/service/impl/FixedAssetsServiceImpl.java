package com.kangce.main.service.impl;

import com.kangce.main.service.FixedAssetsService;
import com.kangce.mybatis.mapper.FixedAssetsMapper;
import com.kangce.mybatis.mapper.UtassettypeMapper;
import com.kangce.mybatis.model.FixedAssets;
import com.kangce.mybatis.model.FixedAssetsExample;
import com.kangce.mybatis.model.Utassettype;
import com.kangce.mybatis.model.UtassettypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixedAssetsServiceImpl implements FixedAssetsService {

    @Autowired
    FixedAssetsMapper fixedAssetsMapper;

    @Autowired
    UtassettypeMapper utassettypeMapper;

    @Override
    public int addAssets(FixedAssets fixedAssets) {
        return fixedAssetsMapper.insert(fixedAssets);
    }

    @Override
    public List<FixedAssets> loadFixedAssetsList() {
        return fixedAssetsMapper.selectByExample(new FixedAssetsExample());
    }

    /**
     * 获取资产类型对应的code
     *
     * @param type
     * @return
     */
    @Override
    public String getAssetsCode(int type) {

        FixedAssetsExample fixedAssetsExample = new FixedAssetsExample();
        fixedAssetsExample.createCriteria().andAssetsTypeEqualTo(type);
        List<FixedAssets> assetsCount = fixedAssetsMapper.selectByExample(fixedAssetsExample);

        UtassettypeExample utassettypeExample = new UtassettypeExample();
        utassettypeExample.createCriteria().andIdEqualTo(type);
        List<Utassettype> utassettypes = utassettypeMapper.selectByExample(utassettypeExample);

        if (utassettypes == null || utassettypes.size() == 0) {
            return null;
        }

        Utassettype utassettype = utassettypes.get(0);
        String encode = utassettype.getEncodingtype();

        if (assetsCount == null || assetsCount.size() == 0) {
            //没有存储过该类型的资产
            String substring = encode.substring(0, encode.length()-1);
            substring += "1";
            return substring;
        } else {
            String code = (assetsCount.size() + 1) + "";
            String substring = "";
            if(code.length()<=4){
                substring = encode.substring(0, encode.length()-code.length());
            }else{
                substring = encode.substring(0, encode.length()-4);
            }
            substring += code;
            return substring;
        }

    }

    @Override
    public FixedAssets loadFixedAssetsById(int assetsId) {

        FixedAssetsExample fixedAssetsExample = new FixedAssetsExample();
        fixedAssetsExample.createCriteria().andIdEqualTo(assetsId);

        List<FixedAssets> fixedAssets = fixedAssetsMapper.selectByExample(fixedAssetsExample);
        if(fixedAssets==null || fixedAssets.size()==0){
            return null;
        }else{
            return fixedAssets.get(0);
        }

    }

    @Override
    public int updateAssets(int id, int changWay) {
        FixedAssetsExample example = new FixedAssetsExample();
        example.createCriteria().andIdEqualTo(id);
        List<FixedAssets> fixedAssets = fixedAssetsMapper.selectByExample(example);
        if(fixedAssets==null || fixedAssets.size()==0){
            return -1;
        }

        FixedAssets assets = fixedAssets.get(0);
        assets.setChangeWay(changWay);




        return fixedAssetsMapper.updateByExample(assets,example);
    }
}
