package Service;

import Dao.LoginDao;

public class LoginService {
	public boolean isExist(String uname,String pwd,int status) {
	LoginDao ld = new LoginDao();
	boolean flag = false;
	
	if(ld.Valid(uname,pwd,status)) {
		flag = true;
	}
    return flag;
    } 
}