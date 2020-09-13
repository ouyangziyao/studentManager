package Service;

import java.util.ArrayList;
import java.util.List;

import Dao.AddGradesDao;
import Dao.NumQueryGradesDao;
import Entity.StudentEntity;

public class AddGradesService {
	public boolean AddGrades(int num, String name, int cla, int math, int java, int english, int sport) {
		boolean flag1 = false;
		boolean flag2 = false;
		String sql = "insert into grades(num,name,cla,math,java,english,sport)values(?,?,?,?,?,?,?)";
		AddGradesDao agDao = new AddGradesDao();
		NumQueryGradesDao nqgDao = new NumQueryGradesDao();

		flag1 = agDao.addGrades(sql, num, name, cla, math, java, english, sport);
		List<StudentEntity> list = nqgDao.getNumGrades(num);
		
		if (list == null || list.size() < 1 || !list.isEmpty()) {
			flag2 = true;
		}
		return flag1 && flag2;
	}

}
