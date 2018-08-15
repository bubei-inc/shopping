package dao;

import model.MemberInfo;

public interface MemberInfoMapper {
    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);
}