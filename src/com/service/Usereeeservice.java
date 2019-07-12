package com.service;

import com.entity.Usereee;
import com.service.impl.UserServiceImpl;
import com.util.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Usereeeservice {
    // 模拟从数据库查询出相应用户信息
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    public Usereee getUser(String userName, String password) {
        Usereee user=new Usereee() ;

        // 假设数据库中包含相应用户


        String sql = "SELECT * FROM users WHERE schoolid=?;";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, userName);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    user.setPassword(rs.getString("password"));
                    user.setPower(rs.getInt("power"));
                    user.setUserName(rs.getString("schoolid"));
                    user.setId(rs.getInt("id"));
                    logger.info("id:::::"+String.valueOf(user.getId()));
                    user.setName(rs.getString("name"));
                    user.setCollege(rs.getString("college"));
                    user.setZhuanye(rs.getString("zhuanye"));
                    user.setMobile(rs.getString("mobile"));
                    user.setSex(rs.getString("sex"));


                }
            }
        }catch (SQLException e) {
            // TODO: handle exception
            logger.warning(e.getMessage());
        }

        if (user.getPassword()!=null&&user.getPassword().equals(password)) {
            return user;

        }else{
            user=null; return user;
        }

    }

}
