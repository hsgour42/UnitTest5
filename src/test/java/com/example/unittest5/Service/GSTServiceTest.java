package com.example.unittest5.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.annotation.Annotation;

@ExtendWith(MockitoExtension.class) //another way to initialize
public class GSTServiceTest {

    @Mock
    private GSTProvider gstProvider;
    @InjectMocks
    private GSTService gstService;

//    @BeforeEach
//    public void init(){
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void gstCalculate1WayTest(){
         //Mock Object (1st Way)
        GSTProvider mock =  Mockito.mock(GSTProvider.class);
        Mockito.when(mock.getGSTDetails()).thenReturn(18);

         //check main logic of gst not other services
         GSTService gstService1 = new GSTService(mock);
         int result = gstService1.calculateGst();

         int expected = 18;
        Assertions.assertEquals(expected , result);
    }

    @Test
    public void gstCalculate2WayTest(){
        //Mock Object (1st Way)
        Mockito.when(gstProvider.getGSTDetails()).thenReturn(18);

        int result = gstService.calculateGst();
        int expected = 18;
        Assertions.assertEquals(expected , result);
    }
}
