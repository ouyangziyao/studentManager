package Dao;

public class UpdateInformationDao {
	public boolean UpdateInformation(String sql,int num,String name,int cla,String sex,String birth) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		if(mDao.createConn()) {
			flag = mDao.update(sql, num, name, cla, sex, birth);
		}
		return flag;
	}

}
