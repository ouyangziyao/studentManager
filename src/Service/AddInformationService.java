package Service;

import java.util.ArrayList;
import Dao.AddInformationDao;
import Dao.NumQueryInformationDao;
import Entity.StudentEntity;

public class AddInformationService {
	public boolean AddInformation(int num,String name,int cla,String sex,String birth) {
		boolean flag1 = false;
		boolean flag2 = false;
		String sql = "insert into information(num,name,cla,sex,birth)values(?,?,?,?,?)";
		AddInformationDao aiDao = new AddInformationDao();
		NumQueryInformationDao nqiDao = new NumQueryInformationDao();
		
		flag1 = aiDao.AddInformation(sql, num, name, cla, sex,birth);
		ArrayList<StudentEntity> list = nqiDao.NumQueryInformation(num);
		if(list == null || list.size() < 1 || !list.isEmpty()) {
			flag2 = true;
		}
		return flag1 && flag2;
	}
}
