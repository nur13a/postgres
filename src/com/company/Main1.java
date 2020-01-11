package com.company;

import com.company.model.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        DB db=new DB();
//       // db.printAllStudents();
//        db.addCities("Bishkek",11,1);
//        db.addCities("Almaty",1,2);
//        db.addCities("Nursultan",12,2);
//        db.addCities("Moscow",13,1);
//        db.addCities("Chuy",10,2);


        List<Country> list=db.getAllCountries();

    }


}