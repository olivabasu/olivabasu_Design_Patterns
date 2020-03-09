package com.epam.AdapterPattern;

//import java.io.*;
import java.util.*;

public class OrderDetails extends Burger implements My_Order {
    public void getBurger()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the burger name :");
            String burger_name=sc.next();
            System.out.println("Enter the burger size:");
            String burger_size=sc.next();
            System.out.println("Enter the burger price:");
            int burger_price=sc.nextInt();  

            setBurgerName(burger_name);
            setBurgerPrice(burger_price);
            setBurgerSize(burger_size);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public String getBurgerDetails() {
        String burger_name=getBurgerName();
        String burger_size=getBurgerSize();
        int burger_price=getBurgerPrice();
        return ("Burger name: "+burger_name
        		+ "\nBurger size: "+burger_size+"\nPrice is Rs "+burger_price);
    }
}

