package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TStreetCoordinate;
import com.gatz.discovery.modules.cidm.model.TStreetCoordinateExample;
import com.gatz.discovery.modules.cidm.model.TStreetCoordinateWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TStreetCoordinateMapper {
    int countByExample(TStreetCoordinateExample example);

    int deleteByExample(TStreetCoordinateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStreetCoordinateWithBLOBs record);

    int insertSelective(TStreetCoordinateWithBLOBs record);

    List<TStreetCoordinateWithBLOBs> selectByExampleWithBLOBs(TStreetCoordinateExample example);

    List<TStreetCoordinate> selectByExample(TStreetCoordinateExample example);

    TStreetCoordinateWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStreetCoordinateWithBLOBs record, @Param("example") TStreetCoordinateExample example);

    int updateByExampleWithBLOBs(@Param("record") TStreetCoordinateWithBLOBs record, @Param("example") TStreetCoordinateExample example);

    int updateByExample(@Param("record") TStreetCoordinate record, @Param("example") TStreetCoordinateExample example);

    int updateByPrimaryKeySelective(TStreetCoordinateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TStreetCoordinateWithBLOBs record);

    int updateByPrimaryKey(TStreetCoordinate record);
    
    public TStreetCoordinateWithBLOBs selectByStreetId(int streetId);
    
    /**
	 * 高德地图，查询区域坐标
	 * @param id
	 * @param type
	 * @return
	 */
	public List selectMapWithBLOBsGaode(Map<String,Object> params);
}