package Service;

import java.util.ArrayList;

import Dao.NumQueryGradesDao;
import Entity.StudentEntity;

public class NumQueryGradesService {
	public ArrayList<StudentEntity> NumQueryService(int num){
		NumQueryGradesDao nqfDao = new NumQueryGradesDao();
		ArrayList<StudentEntity> list = null;
		list = nqfDao.getNumGrades(num);
		return list;
	}
}
