package Service;

import Dao.UpdateInformationDao;

public class UpdateInformationService {
	public boolean UpdateInformationSer(int num,String name,int cla,String sex,String birth) {
		UpdateInformationDao uiDao = new UpdateInformationDao();
		boolean flag = false;
		String sql = "update information set num =?,name=?,cla=?,sex=?,birth=? where num=?";
		flag = uiDao.UpdateInformation(sql, num, name, cla, sex, birth);
		return flag;
	}

}
