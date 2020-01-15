package com.company.HW44;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBeaver {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }



    public ArrayList<City> addCity(City city){
        ArrayList<City>result=new ArrayList<City>();
        String SQL="insert into cities1 (name,people_count) values (?,?)";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            //stmt.setInt(1,city.getID());
            stmt.setString(1, city.getName());
            stmt.setInt(2, city.getPeopleCount());
            result.add(city);
            stmt.executeLargeUpdate();
            result.add(city);
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    public ArrayList<City> addCity1(City city){
        ArrayList<City>result=new ArrayList<City>();
        String SQL="insert into cities1 (name,people_count)values (?,?) on conflict (id) do update set name=?,people_count=?";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            //если объявлять ID от руки то данные обновляются, а при serial данные просто добавляются
            //stmt.setInt(1, city.getID());
            stmt.setString(1, city.getName());
            stmt.setInt(2, city.getPeopleCount());
            stmt.setString(3, city.getName());
            stmt.setInt(4, city.getPeopleCount());
            result.add(city);
            stmt.executeLargeUpdate();
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

}
