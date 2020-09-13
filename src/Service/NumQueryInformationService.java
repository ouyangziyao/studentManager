package Service;

import java.util.ArrayList;

import Dao.NumQueryInformationDao;
import Entity.StudentEntity;

public class NumQueryInformationService {
	public ArrayList<StudentEntity>  NumQueryInformationSer(int num){
		NumQueryInformationDao nqiDao = new NumQueryInformationDao();
		ArrayList<StudentEntity> list = nqiDao.NumQueryInformation(num);
		return list;
	}

}
