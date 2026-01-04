package com.curry;

import com.curry.domain.departure.DepartureMapper;
import com.curry.domain.departure.DepartureRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class DepartureMapperTest {

    @Autowired
    DepartureMapper departureMapper;

    @Test
    void save() {
        DepartureRequest params = new DepartureRequest();
        params.setPassport_no("M1234345");
        params.setSurname("hong");
        params.setGiven_name("gildong");
        params.setDate_of_birth(LocalDate.of(2000,10,24));
        params.setGender("Male");
        params.setNationality("Korea");
        params.setDate_of_issue(LocalDate.of(2019,1,1));
        params.setDate_of_expiry(LocalDate.of(2029,1,1));
        departureMapper.save(params);
    }
}
