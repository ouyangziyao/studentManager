package Dao;

public class UpdateGradesDao {
	public boolean UpdateGrades(String sql,int num,String name,int cla,int math,int java,int english,int sport) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		if(mDao.createConn()) {
			mDao.update(sql, num, name, cla, math, java, english, sport);
			flag = true;
		}
		mDao.closeCP();
		return flag;
		
	}
}
