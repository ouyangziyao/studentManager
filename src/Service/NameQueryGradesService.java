package Service;

import java.util.ArrayList;

import Dao.NameQueryGradesDao;
import Entity.StudentEntity;

public class NameQueryGradesService {
	public ArrayList<StudentEntity> NameQueryService(String name){
		NameQueryGradesDao nqgdDao = new NameQueryGradesDao();
		ArrayList<StudentEntity> list =  nqgdDao.nameQueryGrades(name);
		return list;
	}

}
