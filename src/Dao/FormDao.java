package Dao;

import java.util.ArrayList;

import Entity.StudentEntity;

public class FormDao {
	public ArrayList<StudentEntity> form(int cla){
		MysqlDao mDao = new MysqlDao();
		ArrayList<StudentEntity> list = null;
		if(mDao.createConn()) {
			list = mDao.getForm(cla);
			mDao.closeCP();
			mDao.closeRs();
		}
		return list;
	}

}
