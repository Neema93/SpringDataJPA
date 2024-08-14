package com.demo.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplstubTest {
    DataServiceStub dataServiceStub =new DataServiceStub();
    SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceStub);
    @Test
    void test(){
        int result=businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}
class DataServiceStub implements DataService{
    public int[] retriveAllData(){
        return new int[]{25, 15, 5};
    }
}
