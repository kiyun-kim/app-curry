package com.curry;

import com.curry.domain.departure.DepartureRequest;
import com.curry.domain.departure.DepartureService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class DepartureServiceTest {
    @Autowired
    DepartureService departureService;

    @Test
    void save() {
        DepartureRequest params = new DepartureRequest();
        params.setPassport_no("M44215345");
        params.setSurname("kim");
        params.setGiven_name("gilsoo");
        params.setDate_of_birth(LocalDate.of(2000,1,1));
        params.setGender("Male");
        params.setNationality("Republic of Korea");
        params.setDate_of_issue(LocalDate.of(2019,1,1));
        params.setDate_of_expiry(LocalDate.of(2029,1,1));
        departureService.saveDeparture(params);
    }
}
