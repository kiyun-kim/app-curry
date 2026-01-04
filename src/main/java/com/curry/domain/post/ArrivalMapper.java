package com.curry.domain.post;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArrivalMapper {

    // 입국 정보 저장
    void save(ArrivalRequest params);
}
