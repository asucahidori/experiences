package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.FamilyMember;
import com.gatz.discovery.modules.cidm.model.FamilyMemberExample;
import com.gatz.discovery.modules.cidm.model.FamilyMemberKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyMemberMapper {
    int countByExample(FamilyMemberExample example);

    int deleteByExample(FamilyMemberExample example);

    int deleteByPrimaryKey(FamilyMemberKey key);

    int insert(FamilyMember record);

    int insertSelective(FamilyMember record);

    List<FamilyMember> selectByExample(FamilyMemberExample example);

    FamilyMember selectByPrimaryKey(FamilyMemberKey key);

    int updateByExampleSelective(@Param("record") FamilyMember record, @Param("example") FamilyMemberExample example);

    int updateByExample(@Param("record") FamilyMember record, @Param("example") FamilyMemberExample example);

    int updateByPrimaryKeySelective(FamilyMember record);

    int updateByPrimaryKey(FamilyMember record);
}