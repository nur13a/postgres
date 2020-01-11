package com.company;

import com.company.model.Country;
import com.company.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {


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


    public int getStudentsCount() {
        String SQL = " Select count(*)FROM students";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;

    }

    public void printAllStudents() {
        String SQL = " Select * FROM students";
        List<Student> list = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " ");
                System.out.println(rs.getString("fio") + " ");
                System.out.println(rs.getInt("group_1") + " ");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public void printGroup() {
        String SQL = "Select * from gender";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.print(rs.getInt("ID") + " ");
                System.out.println(rs.getString("gender") + " ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void addPerson(String name, int age) {

        String SQL = "insert into people (name,age) values (?,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.executeLargeUpdate();
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printInfo() {
        String SQL = "select id , faculty from groups_1";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.print(rs.getInt("ID") + " ");
                System.out.println(rs.getString("faculty") + " ");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void addCountry(String name, int president) {

        String SQL = "insert into countries (name,president) values (?,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, name);
            stmt.setInt(2, president);
            stmt.executeLargeUpdate();
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void addCities(String name, int people_id,int country_id) {

        String SQL = "insert into cities (name,people_id,country_id) values (?,?,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, name);
            stmt.setInt(2, people_id);
            stmt.setInt(3, country_id);
            stmt.executeLargeUpdate();
            System.out.println("Successfully1");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<Country>getAllCountries(){
        List<Country>result=new ArrayList<Country>();
        String SQL="select *from countries";

        try(Connection conn=connect();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(SQL)){
            while (rs.next()){
                Country c=new Country();
                c.getName(rs.getString("NAME"));
                c.getPresidentId(rs.getInt("PRESIDENT"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }


}
