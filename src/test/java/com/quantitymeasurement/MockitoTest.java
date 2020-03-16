//package com.quantitymeasurement;
//
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//
//public class MockitoTest {
//
//    @Rule
//    public MockitoRule mockitoRule= MockitoJUnit.rule();
//
//    @Test
//    public void customerReaderTest() {
//        Customer sampleCustomer=new Customer("Susan","Ivanova");
//        EntityManager entityManager=mock(EntityManager.class);
//        when(entityManager.find(Customer.class,1L)).thenReturn(sampleCustomer);
//        CustomerReader customerReader=new CustomerReader();
//        customerReader.setEntityManager(entityManager);
//        String fullName = customerReader.findFullName(1L);
//        Assert.assertEquals("Susan Ivanova",fullName);
//    }
//}
