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
        System.out.println();

        return pattern;
    }


    public static String lastName(String lastName){



        String pattern= "^[A-z]{3,}";
        Pattern r= Pattern.compile(pattern);

        Matcher m = r.matcher(lastName);


        if(m.matches()){
            System.out.println(" Last Name Matched Pattern:" );

        }else
        {
            System.out.println("Last Name  No Matched :");
        }

        return pattern;
    }
}
