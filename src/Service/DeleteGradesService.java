package Service;

import java.util.ArrayList;

import Dao.DeleteGradesDao;
import Dao.NumQueryGradesDao;
import Entity.StudentEntity;

public class DeleteGradesService {
	public boolean DeleteGrades(int num){
		boolean flag1 = false;
		boolean flag2 = false;
		NumQueryGradesDao nqgDao = new NumQueryGradesDao();
		DeleteGradesDao dgDao = new DeleteGradesDao();
		ArrayList<StudentEntity> list = nqgDao.getNumGrades(num);
		flag1 = dgDao.DeleteGrades(num);
		if(list.size()>0 || !list.isEmpty()) {
			flag2 = true;
		}
		
		return flag1 && flag2;
	}
}
