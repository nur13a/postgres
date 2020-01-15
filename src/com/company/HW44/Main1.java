package com.company.HW44;

import com.company.HW44.City;
import com.company.HW44.DBeaver;
import com.company.model.Country;

import java.sql.SQLException;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        DBeaver dBeaver=new DBeaver();
        dBeaver.addCity(new City("Bishkek",8000));
        dBeaver.addCity(new City("Chuy",3000));

        dBeaver.addCity1(new City("Moscow",5000));
        dBeaver.addCity1(new City("Kiev",9000));
    }
}