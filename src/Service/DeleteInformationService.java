package Service;

import java.util.ArrayList;

import Dao.DeleteInformationDao;
import Dao.NumQueryInformationDao;
import Entity.StudentEntity;

public class DeleteInformationService {
	public boolean DeleteInformatinSer(int num) {
		boolean flag1 = false;
		boolean flag2 = false;
		NumQueryInformationDao nqiDao = new NumQueryInformationDao();
		DeleteInformationDao diDao = new DeleteInformationDao();
		ArrayList<StudentEntity> list = nqiDao.NumQueryInformation(num);
		String sql = "delete from information where num = ?";
		if(list!=null || list.size() > 0) {
			flag1 = true;
			flag2 = diDao.DeleteInformation(sql, num);
		}
		return flag1 && flag2;
	}
}
