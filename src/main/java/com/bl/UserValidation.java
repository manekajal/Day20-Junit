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
    public static String email(String str)
    {

        String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern r= Pattern.compile(pattern);

        Matcher m;
        m = r.matcher(str);

        if(m.matches()){
            System.out.println(" Email is Matched :" );

        }else
        {
            System.out.println("  Email is Not Matched :");
        }
        return pattern;
    }
    public static String password(String str)
    {

        String pattern = "\"(?=.*?[A-Z])(?=.*?[0-9])[A-Za-z]{8,}";
        Pattern r= Pattern.compile(pattern);

        Matcher m;
        m = r.matcher(str);

        if(m.matches()){
            System.out.println(" password is Matched :" );

        }else
        {
            System.out.println("  password is Not Matched :");
        }
        return pattern;
    }


}
