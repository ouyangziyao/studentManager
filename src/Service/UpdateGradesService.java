package Service;

import java.util.ArrayList;

import Dao.NumQueryGradesDao;
import Dao.UpdateGradesDao;
import Entity.StudentEntity;

public class UpdateGradesService {
	public boolean UpdateGradesSer(int num,String name,int cla,int math,int java,int english,int sport) {
		boolean flag1 = false;
		boolean flag2 = false;
		UpdateGradesDao ugDao = new UpdateGradesDao();
		NumQueryGradesDao nqgDao = new NumQueryGradesDao();
		
		String sql = "update grades set num =?,name=?,cla=?,math=?,java=?,english=?,sport=? where num=?";
		flag1 = ugDao.UpdateGrades(sql, num, name, cla, math, java, english, sport);
		ArrayList<StudentEntity> list = nqgDao.getNumGrades(num);
		
		if(list != null || list.size() > 0) {
			flag2 = true;
		}
		
		return flag1 && flag2 ;
	}

}
