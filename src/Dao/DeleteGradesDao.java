package Dao;

public class DeleteGradesDao {
	public boolean DeleteGrades(int num) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		String sql = "delete from grades where num = ?";
		if(mDao.createConn()) {
			flag = mDao.delete(sql, num);
		}
		return flag;
	}

}
