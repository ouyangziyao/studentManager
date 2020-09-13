package Service;

import java.util.ArrayList;
import Dao.FormDao;
import Entity.StudentEntity;

public class FormService {
	public ArrayList<StudentEntity> FormSer(int cla){
		ArrayList<StudentEntity> list = null;
		FormDao fDao = new FormDao();
		list = fDao.form(cla);
		return list;
	}

}
