package com.demo.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplMockTest {
  
    @Test
    void test(){
        DataService dataServiceMock=mock(DataService.class);
       

  when(dataServiceMock.retriveAllData()).thenReturn(new int[]{25, 15, 5});
  
        SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceMock);
        int result=businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}

