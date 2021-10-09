package com.bl;

import org.junit.Assert;
import org.junit.Test;



public class ModifierAnalyseTest {


    @Test
    public  void firstName() throws Exception {
        UserValidation valid = new UserValidation();
        String result = valid.firstName("Kajal");
        Assert.assertEquals(true, result);
    }@Test
    public void lastName(){
        UserValidation valid = new UserValidation();
        String result = valid.lastName("mane");
        Assert.assertEquals(true, result);
    }

}
