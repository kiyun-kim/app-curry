package com.curry.domain.departure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartureService {
    private final DepartureMapper departureMapper;

    // 출국정보 저장
    public String saveDeparture(final DepartureRequest params){
        departureMapper.save(params);
        return params.getPassport_no();
    }
}
