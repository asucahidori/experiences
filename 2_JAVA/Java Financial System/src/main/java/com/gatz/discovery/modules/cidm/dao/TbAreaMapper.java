package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.model.TbAreaExample;

import java.util.List;

public interface TbAreaMapper extends GenericDao<TbArea,Long> {
    int countByExample(TbAreaExample example);

//    List<TbArea> selectByExample(TbAreaExample example);

    TbArea selectByPrimaryKey(Integer id);

    List<TbArea> selectAllCity();

    List<TbArea> selectDataOfCity(TbArea example);
}
