package com.curry.domain.post;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArrivalService {

    private final ArrivalMapper arrivalMapper;

    // 입국정보 저장
    public String saveArrival(final ArrivalRequest params){
        arrivalMapper.save(params);
        return params.getPassport_no();
    }
}
