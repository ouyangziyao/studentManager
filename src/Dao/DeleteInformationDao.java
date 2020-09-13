package Dao;

public class DeleteInformationDao {
	public boolean DeleteInformation(String sql,int num) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		if(mDao.createConn()) {
			mDao.delete(sql, num);
			flag = true;
			mDao.closeCP();
		}
		return flag;
	}

}
