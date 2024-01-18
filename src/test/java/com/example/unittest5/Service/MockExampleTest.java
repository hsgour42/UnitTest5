package com.example.unittest5.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class MockExampleTest {
    @Mock
    private List<Integer> list;
    @Mock
    private Map<String , Integer> map;

    @Test
    public void listSizeTest() {
        Mockito.when(list.size()).thenReturn(5);
        int expectedListSize = 5;
        Assertions.assertEquals(expectedListSize , list.size() );
    }

    @Test
    public void mapPositionValueTest() {
        Mockito.when(map.get("First")).thenReturn(35).thenReturn(24).thenReturn(55);
        int expectedValue = 35;
        Assertions.assertEquals(expectedValue , map.get("First") );
        Assertions.assertEquals(24 , map.get("First") );
        Assertions.assertEquals(55 , map.get("First") );
    }


}
