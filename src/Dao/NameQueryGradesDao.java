package Dao;
import java.util.ArrayList;
import Entity.StudentEntity;

public class NameQueryGradesDao {
	public ArrayList<StudentEntity> nameQueryGrades(String name){
		MysqlDao mDao = new MysqlDao();
		ArrayList<StudentEntity> list = null;
		if (mDao.createConn()) {
			list = mDao.getNameGrades(name);
			mDao.closeCP();
			mDao.closeRs();
		}
		return list;
	}
}
