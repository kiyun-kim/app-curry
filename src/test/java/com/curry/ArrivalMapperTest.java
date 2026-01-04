package com.curry;

import com.curry.domain.post.ArrivalMapper;
import com.curry.domain.post.ArrivalRequest;
import com.curry.domain.post.ArrivalResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class ArrivalMapperTest {

    @Autowired
    ArrivalMapper arrivalMapper;

    @Test
    void save() {
        ArrivalRequest params = new ArrivalRequest();
        params.setPassport_no("M1234345");
        params.setSurname("hong");
        params.setGiven_name("gildong");
        params.setDate_of_birth(LocalDate.of(2000,10,24));
        params.setGender("Male");
        params.setNationality("Korea");
        params.setDate_of_issue(LocalDate.of(2019,1,1));
        params.setDate_of_expiry(LocalDate.of(2029,1,1));
        arrivalMapper.save(params);
    }
}
