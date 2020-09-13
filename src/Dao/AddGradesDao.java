package Dao;

public class AddGradesDao {
	public boolean addGrades(String sql,int num,String name,int cla,int math,int java,int english,int sport) {
		boolean flag = false;
		MysqlDao mDao = new MysqlDao();
		if(mDao.createConn()) {
			flag = mDao.add(sql, num, name, cla, math, java, english, sport);
			mDao.closeCP();
		}
		return flag;
	}

}
