package com.curry.domain.departure;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartureMapper {

    // 출국 정보 저장
    void save(DepartureRequest params);
}
