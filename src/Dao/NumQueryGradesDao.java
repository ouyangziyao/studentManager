package Dao;

import java.util.ArrayList;
import Entity.StudentEntity;

public class NumQueryGradesDao {

	public ArrayList<StudentEntity> getNumGrades(int num) {
		MysqlDao md = new MysqlDao();
		ArrayList<StudentEntity> list = null;
		if (md.createConn()) {
			list = md.getNumGrades(num);
			md.closeCP();
			md.closeRs();
		}
		return list;
	}
}
