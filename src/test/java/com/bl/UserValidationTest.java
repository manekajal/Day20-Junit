package com.bl;

import org.junit.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public  void firstName()  {
        UserValidation valid = new UserValidation();
        String result=valid.firstName("Kajal");
        Assert.assertTrue(true);
    }
   @Test
    public void lastName(){
        UserValidation valid = new UserValidation();
       String result = valid.lastName("mane");
        Assert.assertEquals(true, result);
    }
    @Test
    public void mobileNumber(){
        UserValidation valid = new UserValidation();
        String result=valid.mobileNumber("91 9765326068");
        Assert.assertEquals(true, valid);
    }
    @Test
    public void email(){
        UserValidation valid = new UserValidation();
        String result=valid.email("manekajal2014@gmail.com");
        Assert.assertEquals(true, valid);
    }
}
