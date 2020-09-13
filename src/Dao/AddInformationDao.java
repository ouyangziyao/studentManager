package Dao;

public class AddInformationDao {
	public boolean AddInformation(String sql,int num,String name,int cla,String sex,String birth) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		if(mDao.createConn()) {
			flag = mDao.update(sql, num, name,cla,sex,birth);
			mDao.closeCP();
		}
		return flag;
		
	}
}
