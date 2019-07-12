package com.service;

import com.entity.*;

import java.util.List;

public interface UserService {
	public void addUsers(String schoolid);
	//添加用户
	public List<tongzhi> listtongzhi();
	public List<shetuan> getshetuan() ;
	public List<shetuan> getshetuan2() ;
	public List<shetuan> getshetuan3() ;
	public shetuan get1st(int id);
	public List<message> amessage(int id);
	public int selectid(String xuehao);
	public void addmessage( int serid,int stid,String context);
	public List<message> bmessage(int id);
	public void updateUserss( int id,String name ,String mobile, String college,String zhuanye,String password);
	public List<shetuan> getmyjrshetuan(int userid) ;
	public List<shetuan> getmyglshetuan(int userid) ;
	public void updateshetuan(int  id,String teacher,String item,String intention,String wechat,String telephone);
	public void updateliuyan(int id);
	public     List<message> getliuyan(int id);
	public void addliuyan( int userid, int shetuanid,String context);
	public   List<Usereee> getmyjrshetuanuser(int stid);
	public void deleteuserst( int userid,int stid);
	public void userst(int userid,int stid,int p);
	public void addshetuan(int id,String name ,String teacher,String intention,String item,String wechat,String telephone,int ys,int jg);
	/**
	 * 查询全部用户
	 * @return
	 */
	public List<XW> listUsers();
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(String clazz, String newName, String content);
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public void updateUser(XW student);

	/**
	 * 基于ID获取指定用户
	 * @param id
	 * @return
	 */
	public XW getUser(int id);
	
	public void deleteUser(int delname);


}
