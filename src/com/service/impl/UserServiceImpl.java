package com.service.impl;

import com.entity.*;
import com.service.UserService;
import com.util.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class UserServiceImpl implements UserService {
	private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

	@Override
	public void addUsers( String schoolid) {
		String sql = "INSERT INTO users(schoolid,password) VALUES(?,?);";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setString(1, schoolid);
			st.setString(2, schoolid);
			st.executeUpdate();

		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}

	}
    @Override
    public List<tongzhi> listtongzhi() {
        // TODO Auto-generated method stub
        List<tongzhi> ttt = new ArrayList<>();
        String sql = "SELECT * FROM tongzhi;";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                tongzhi tongzhi = new tongzhi();
                tongzhi.setId(rs.getInt("id"));
                tongzhi.setUserid(rs.getInt("userid"));
                tongzhi.setTitle(rs.getString("title"));
                tongzhi.setContext(rs.getString("context"));
                ttt.add(tongzhi);
                logger.info("add");
            }
        } catch (SQLException e) {
            // TODO: handle exception
            logger.warning(e.getMessage());
        }
        return ttt;

    }

    public List<shetuan> getshetuan() {
        // TODO Auto-generated method stub
        List<shetuan> ttt = new ArrayList<>();
        String sql = "SELECT * FROM shetuan;";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                shetuan shetuan=new shetuan();
                shetuan.setId(rs.getInt("id"));
                shetuan.setIntention(rs.getString("intention"));
               shetuan.setItem(rs.getString("item"));
               shetuan.setJg(rs.getInt("jg"));
               shetuan.setName(rs.getString("name"));
               shetuan.setTeacher(rs.getString("teacher"));
               shetuan.setTelephone(rs.getString("telephone"));
               shetuan.setWechat(rs.getString("wechat"));
               shetuan.setYs(rs.getInt("ys"));
                ttt.add(shetuan);
                logger.info("add");
            }
        } catch (SQLException e) {
            // TODO: handle exception
            logger.warning(e.getMessage());
        }
        return ttt;

    }


	public List<shetuan> getshetuan2() {
		// TODO Auto-generated method stub
		List<shetuan> ttt = new ArrayList<>();
		String sql = "SELECT * FROM shetuan where ys=1;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery()) {
			while (rs.next()) {
				shetuan shetuan=new shetuan();
				shetuan.setId(rs.getInt("id"));
				shetuan.setIntention(rs.getString("intention"));
				shetuan.setItem(rs.getString("item"));
				shetuan.setJg(rs.getInt("jg"));
				shetuan.setName(rs.getString("name"));
				shetuan.setTeacher(rs.getString("teacher"));
				shetuan.setTelephone(rs.getString("telephone"));
				shetuan.setWechat(rs.getString("wechat"));
				shetuan.setYs(rs.getInt("ys"));
				ttt.add(shetuan);
				logger.info("add");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return ttt;

	}


	public List<shetuan> getshetuan3() {
		// TODO Auto-generated method stub
		List<shetuan> ttt = new ArrayList<>();
		String sql = "SELECT * FROM shetuan where jg=1;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery()) {
			while (rs.next()) {
				shetuan shetuan=new shetuan();
				shetuan.setId(rs.getInt("id"));
				shetuan.setIntention(rs.getString("intention"));
				shetuan.setItem(rs.getString("item"));
				shetuan.setJg(rs.getInt("jg"));
				shetuan.setName(rs.getString("name"));
				shetuan.setTeacher(rs.getString("teacher"));
				shetuan.setTelephone(rs.getString("telephone"));
				shetuan.setWechat(rs.getString("wechat"));
				shetuan.setYs(rs.getInt("ys"));
				ttt.add(shetuan);
				logger.info("add");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return ttt;

	}

    public void addshetuan(int id,String name ,String teacher,String intention,String item,String wechat,String telephone,int ys,int jg){
        String sql = "INSERT INTO shetuan(id,name,teacher,intention,item,wechat,telephone,ys,jg) VALUES(?,?,?,?,?,?,?,?,?);";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, teacher);
            st.setString(4, intention);
            st.setString(5, item);
            st.setString(6, wechat);
            st.setString(7, telephone);
            st.setInt(8, ys);
            st.setInt(9, jg);
            st.executeUpdate();

        }catch (SQLException e) {
            // TODO: handle exception
            logger.warning(e.getMessage());
        }


    }

	public shetuan get1st(int id) {
		// TODO Auto-generated method stub
		shetuan shetuan =new shetuan();
		String sql = "SELECT * FROM shetuan where id=?;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					shetuan.setId(rs.getInt("id"));
					shetuan.setIntention(rs.getString("intention"));
					shetuan.setItem(rs.getString("item"));
					shetuan.setJg(rs.getInt("jg"));
					shetuan.setName(rs.getString("name"));
					shetuan.setTeacher(rs.getString("teacher"));
					shetuan.setTelephone(rs.getString("telephone"));
					shetuan.setWechat(rs.getString("wechat"));
					shetuan.setYs(rs.getInt("ys"));
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return shetuan;
	}
	public void userst(int userid,int stid,int p){
		String sql = "INSERT INTO usershetuan(userid,stid,power) VALUES(?,?,?);";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, userid);
			logger.info(String.valueOf(userid));;
			st.setInt(2, stid);
			logger.info(String.valueOf(stid));;
			st.setInt(3, p);
			st.executeUpdate();

		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
	}
	public void updateUserss( int id,String name,String mobile, String college,String zhuanye,String password){
// TODO Auto-generated method stub
		String sql = "UPDATE users SET name=?,mobile=?,college=?,zhuanye=?,password=? WHERE id=?";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setString(1,name);
			//st.setString(2,schoolid);
			st.setString(2,mobile);
			st.setString(3,college);
			st.setString(4,zhuanye);
			st.setString(5,password);
			st.setInt(6,id );
			st.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
	}
	public List<message> amessage(int id){
		List<message> m=new ArrayList<>();

//select  name ,title,context from usermessage,users where users.id=usermessage.usertoid and usermessage.usertoid=1;
		String sql = "select  name ,title,context,time from usermessage,users where users.id=usermessage.userformid and usermessage.usertoid=?;";

		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					message mm=new message();
					mm.setUserform(rs.getString("name"));
					mm.setTitle(rs.getString("title"));
					mm.setContext(rs.getString("context"));
					mm.setTime(rs.getString("time"));
					m.add(mm);
					logger.info("add");
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return m;
	}
	public List<message> bmessage(int id){
		List<message> m=new ArrayList<>();

//select  name ,title,context from usermessage,users where users.id=usermessage.usertoid and usermessage.usertoid=1;
		String sql = "select  name ,title,context,time from usermessage,users where users.id=usermessage.usertoid and usermessage.userformid=?;";

		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					message mm=new message();
					mm.setUserform(rs.getString("name"));
					mm.setTitle(rs.getString("title"));
					mm.setContext(rs.getString("context"));
					mm.setTime(rs.getString("time"));
					m.add(mm);
					logger.info("add");
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return m;
	}
	public int selectid(String xuehao){

		int id=0;
		String sql = "SELECT id FROM users WHERE schoolid=?;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setString(1, xuehao);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					id=rs.getInt("id");
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return id;
	}
	public void addmessage( int serid,int stid,String context){
		String sql = "INSERT INTO usermessage(userformid,usertoid,context) VALUES(?,?,?);";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, serid);
			st.setInt(2, stid);
			st.setString(3, context);
			st.executeUpdate();
			logger.info("111!!!!!");
		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}


	}
	public List<shetuan> getmyjrshetuan(int id) {
		List<shetuan> ttt = new ArrayList<>();
		String sql = "select  DISTINCT stid,name,teacher,item,telephone  from shetuan,usershetuan where usershetuan.stid=shetuan.id and userid=? ;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					shetuan shetuan=new shetuan();
					shetuan.setId(rs.getInt("stid"));//

					shetuan.setItem(rs.getString("item"));//

					shetuan.setName(rs.getString("name"));//
					shetuan.setTeacher(rs.getString("teacher"));//
					shetuan.setTelephone(rs.getString("telephone"));//

					ttt.add(shetuan);
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return ttt;


	}
	public List<shetuan> getmyglshetuan(int id) {
		List<shetuan> ttt = new ArrayList<>();
		String sql = "select  DISTINCT stid,name,teacher,item,telephone,2power  from shetuan,usershetuan where usershetuan.stid=shetuan.id and userid=? and 2power=1;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					shetuan shetuan=new shetuan();
					shetuan.setId(rs.getInt("stid"));//

					shetuan.setItem(rs.getString("item"));//

					shetuan.setName(rs.getString("name"));//
					shetuan.setTeacher(rs.getString("teacher"));//
					shetuan.setTelephone(rs.getString("telephone"));//

					ttt.add(shetuan);
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return ttt;


	}
	public void deleteuserst( int userid,int stid){
		String sql = "delete from usershetuan where stid=? and userid=?;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1,stid);
			st.setInt(2,userid);
			st.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}

	}
	public   List<Usereee>  getmyjrshetuanuser(int stid)
	{
		List<Usereee> ttt = new ArrayList<>();
		String sql = "select distinct users.id,schoolid,users.name,college,zhuanye,mobile  from usershetuan,users,shetuan  where usershetuan.userid=users.id and usershetuan.stid=shetuan.id and stid=?;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, stid);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					Usereee user=new Usereee();

					user.setId(rs.getInt("id"));//
user.setUserName(rs.getString("schoolid"));
user.setName(rs.getString("name"));
user.setCollege(rs.getString("college"));
user.setZhuanye(rs.getString("zhuanye"));
user.setMobile(rs.getString("mobile"));


					ttt.add(user);
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return ttt;


	}
	public void addliuyan( int userid, int shetuanid,String context){
		String sql = "INSERT INTO shetuanbbs(userid,stid,context) VALUES(?,?,?);";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, userid);
			st.setInt(2, shetuanid);
			st.setString(3, context);
			st.executeUpdate();
			logger.info("111!!!!!");
		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}


	}
	public     List<message> getliuyan(int id){
		List<message> m=new ArrayList<>();

//select  name ,title,context from usermessage,users where users.id=usermessage.usertoid and usermessage.usertoid=1;
		String sql = "select  users.name ,time,context,shetuanbbs.id,goodid from shetuanbbs,users,shetuan where users.id=shetuanbbs.userid and shetuanbbs.stid=shetuan.id and  shetuan.id=? ORDER BY goodid DESC;";

		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1, id);
			try(ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					message mm=new message();
					mm.setUserform(rs.getString("name"));
mm.setId(rs.getInt("id"));
					mm.setContext(rs.getString("context"));
					mm.setTime(rs.getString("time"));
					mm.setGoodid(rs.getInt("goodid"));
					m.add(mm);
					logger.info("add");
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
		return m;

	}
	public void updateliuyan(int id){
//update shetuanbbs set goodid=goodid+1 where id=1;
		String sql = "update shetuanbbs set goodid=goodid+1 where id=?;";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setInt(1,id);

			st.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			logger.warning(e.getMessage());
		}
	}
    public void updateshetuan(int  id,String teacher,String item,String intention,String wechat,String telephone){
		String sql = "UPDATE shetuan SET  teacher=? ,item=?,intention=? ,wechat=? , telephone=? WHERE id=?";
		try(Connection conn = DataSourceUtils.getConnection();
			PreparedStatement st = conn.prepareStatement(sql)) {
			st.setString(1,teacher);
			st.setString(2,item);
			st.setString(3,intention);
			st.setString(4,wechat );
			st.setString(5,telephone );
			st.setInt(6,id );
			st.executeUpdate();
		}catch (SQLException e) {
			logger.warning(e.getMessage());
		}

    }




















	//以下均为模板
	@Override
	public List<XW> listUsers() {
		// TODO Auto-generated method stub
	    List<XW> students = new ArrayList<>();
	    String sql = "SELECT * FROM xw;";
	    try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
	        while (rs.next()) {
	        XW student = new XW();
	        student.setId(rs.getInt("id"));
	        student.setClazz(rs.getString("clazz"));
	        student.setName(rs.getString("name"));
	        student.setContent(rs.getString("content"));
				student.setTime(rs.getString("time"));
	        students.add(student);
	      }  
	    } catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	    return students;

	}

	@Override
	public void addUser( String clazz, String newName, String content) {
		String sql = "INSERT INTO xw(clazz,name,content,time) VALUES(?,?,?,NOW());";
	    try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
	        st.setString(1, clazz);
	        st.setString(2, newName);
	        st.setString(3, content);
	        st.executeUpdate();    
	    }catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
		
	}
	
	@Override
	public void updateUser(XW student) {
		// TODO Auto-generated method stub
	    String sql = "UPDATE xw SET  name=? ,clazz=?,content=? WHERE id=?";
	    try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
			st.setString(1,student.getName());
	        st.setString(2,student.getClazz());
	        st.setString(3,student.getContent());
			st.setInt(4,student.getId() );
	        st.executeUpdate();
	    }catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	  }

	@Override
	public XW getUser(int id) {
		// TODO Auto-generated method stub
		XW student = new XW();
	    String sql = "SELECT * FROM xw WHERE id=?;";
	    try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
	      st.setInt(1, id);
	      try(ResultSet rs = st.executeQuery()) {    
	        while (rs.next()) {
	        	student.setId(rs.getInt("id"));
	        	student.setClazz(rs.getString("clazz"));
	        	student.setName(rs.getString("name"));
	        	student.setContent(rs.getString("content"));
	        }
	      }
	    } catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	    return student;
	}

	@Override
	public void deleteUser(int delname) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM XW WHERE id=?";
	    try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
	        st.setInt(1,delname);
	        st.executeUpdate();
	    }catch (SQLException e) {
	      // TODO: handle exception
	      logger.warning(e.getMessage());
	    }
	}

}
