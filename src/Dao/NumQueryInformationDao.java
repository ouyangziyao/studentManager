package Dao;

import java.util.ArrayList;

import Entity.StudentEntity;

public class NumQueryInformationDao {
	public ArrayList<StudentEntity> NumQueryInformation(int num){
		MysqlDao mDao = new MysqlDao();
		ArrayList<StudentEntity> list = null;
		if(mDao.createConn()) {
			list = mDao.getNumInformation(num);
			mDao.closeCP();
			mDao.closeRs();
		}
		return list;
		
	}
}
