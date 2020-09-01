package com.Team3.loanProject.services;

import com.Team3.loanProject.entities.Data;
import com.Team3.loanProject.repositories.ApplicantRepository;
import com.Team3.loanProject.repositories.DataRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.*;

import java.util.Optional;


public class DataServiceTest {

    @Mock
    private DataRepository dataRepository;

    @InjectMocks
    private DataService dataService;

    @Test
    @Ignore
    public void getData(){
        Data data=new Data();
        data.setD2y(0);
        data.setEacr("2/15/1994  10:39:00 AM");
        data.setId(54734);
        data.setIl6m(0);
        data.setMsld(120);
        data.setMslr(130);
        data.setOpenaccount(10);
        data.setPublicrecord(0);
        data.setRevolbalance(28854);
        data.setRevolutil(0.52);
        data.setTotalaccounts(42);

        given(dataRepository.findById(54734)).willReturn(Optional.of(data));

        assertEquals(dataService.getData(54734), data);

    }



}
