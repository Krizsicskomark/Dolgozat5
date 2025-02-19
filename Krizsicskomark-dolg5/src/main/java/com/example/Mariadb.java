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
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb {
  public Connection tryConnect() {
    try {
      return connect();
    } catch (SQLException e) {
      System.err.println("Hiba! A csatlakozás sikertelen");
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Connection connect() throws SQLException {
    String user = "root";
    String pass = "";
    String url = "jdbc:mariadb://localhost:3306/cylinders";
    Connection conn = DriverManager.getConnection(url, user, pass);
    return conn;
  }
}
