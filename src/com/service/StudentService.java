package com.service;

import com.entity.XW;
import com.util.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

  public List<XW> getStudents() {
    List<XW> students= new ArrayList<>();
    String sql = "SELECT * FROM xw";
    try(Connection conn = DataSourceUtils.getConnection();
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery()) {
      while(rs.next()) {
        XW s = new XW();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name"));
        s.setClazz(rs.getString("clazz"));
        s.setContent(rs.getString("content"));
        students.add(s);
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return students;
  }
}
