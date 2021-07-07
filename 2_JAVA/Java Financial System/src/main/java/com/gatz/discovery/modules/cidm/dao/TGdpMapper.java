package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.AreaMapVo;
import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.model.TGdpExample;

public interface TGdpMapper {
    int countByExample(TGdpExample example);

    int deleteByExample(TGdpExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(TGdp record);

    int insertSelective(TGdp record);

    List<TGdp> selectByExample(TGdpExample example);

    TGdp selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") TGdp record, @Param("example") TGdpExample example);

    int updateByExample(@Param("record") TGdp record, @Param("example") TGdpExample example);

    int updateByPrimaryKeySelective(TGdp record);

    int updateByPrimaryKey(TGdp record);
    
    /**
     * 查询生产总值
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchGdp(TGdp record);
    
    /**
	 * @desc 人均可支配收入，人均消费支出
	 * @author xzl
	 */
	public List<AreaMapVo> queryAvgGdpByArea(Map<String,Object> map);
	
	/**
	 * 根据地区名称查找ID
	 * @param map
	 * @return
	 */
	public Long selectAreaIdByName(Map<String,Object> map);
	
	public void insertGdplists(List list);
	
	public void updateGdplists(List list);
}