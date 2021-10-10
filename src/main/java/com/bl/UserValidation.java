package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation
{
    public static String firstName(String firstName){
        String pattern ="^[A-Za-z][3,8]$";

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

        String pattern= "^[A-Za-z]{3,17}$";
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
    public static String mobileNumber(String str)
    {

        String pattern = "(0/91)?[7-9][0-9]{10,18}";
        Pattern r= Pattern.compile(pattern);

        Matcher m;
        m = r.matcher(str);

        if(m.matches()){
            System.out.println(" Mobile Number is Matched :" );

        }else
        {
            System.out.println("  Mobile Number is Not Matched :");
        }
        return pattern;
    }
}
