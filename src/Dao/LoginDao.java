package Dao;

public class LoginDao {
	public boolean Valid(String uname, String pwd, int status) {
		boolean flag = false;
		MysqlDao md = new MysqlDao();
		if(md.createConn()) {
			flag = md.query(uname, pwd, status);
			md.closeCP();
			md.closeRs();
		}
		return flag;
	}
}
