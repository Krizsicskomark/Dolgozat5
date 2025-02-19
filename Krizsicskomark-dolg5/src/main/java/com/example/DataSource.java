/*
* File: Cylinder.java
* Author: Krizsicskó Márk
* Copyright: 2025, Krizsicskó Márk
* Group: Szoft II/1/N
* Date: 2025-02-19
* Github: https://github.com/krizsicskomark/
* Licenc: GNU GPL
*/

package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
  public static void tryCreateCylinder(Cylinder cylinder) {
    try {
      createCylinder(cylinder);
    } catch (SQLException e) {
      System.err.println("Hiba! Új adatok felvétele sikeretelen!");
      System.err.println(e.getMessage());
    }
  }

  public static void createCylinder(Cylinder cylinder) throws SQLException {
    Mariadb mairadb = new Mariadb();
    Connection conn = mairadb.connect();

    String sql = "INSERT INTO cylinder" + 
    "(radius, height, surface) VALUES" + 
    "(?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setDouble(1, cylinder.radius);
    ps.setDouble(2, cylinder.height);
    ps.setDouble(3, cylinder.surface);
    ps.execute();
    
  }
}
