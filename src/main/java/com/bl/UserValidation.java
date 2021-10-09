package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public  String firstName(String firstName){


        String pattern ="^[A-z][3,8]";

        Pattern r= Pattern.compile(pattern);

        Matcher m= r.matcher(firstName);

        if(m.matches()){
            System.out.println(" First Name is matched ");
        }else{
            System.out.println(" Not Matched ");
        }


        return pattern;
    }
}
