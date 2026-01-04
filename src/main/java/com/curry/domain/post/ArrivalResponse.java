package com.curry.domain.post;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
public class ArrivalResponse {

    private String passport_no;
    private String surname;
    private String given_name;
    private String gender;
    private String nationality;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_of_birth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_of_issue;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_of_expiry;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date_of_arrival;
}
