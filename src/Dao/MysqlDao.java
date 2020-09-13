package Dao;

import java.sql.*;
import java.util.ArrayList;
import Entity.StudentEntity;

public class MysqlDao {
	private String drv = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/student";
	private String usr = "root";
	private String pwd = "YES";
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public String getDrv() {
		return drv;
	}

	public void setDrv(String drv) {
		this.drv = drv;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public PreparedStatement getPstmt() {
		return pstmt;
	}

	public void setStm(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public boolean createConn() {
		boolean b = false;
		try {
			Class.forName(drv);
			conn = DriverManager.getConnection(url, usr, pwd);
			b = true;
		} catch (SQLException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public boolean delete(String sql, int num) {
		boolean b = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			b = true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public boolean add(String sql, int num, String name, int cla, int math, int java, int english, int sport) {
		boolean b = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setInt(3, cla);
			pstmt.setInt(4, math);
			pstmt.setInt(5, java);
			pstmt.setInt(6, english);
			pstmt.setInt(7, sport);
			pstmt.executeUpdate();
			b = true;
		} catch (Exception e) {
			b=false;
		}
		return b;
	}
	
	public boolean update(String sql, int num, String name, int cla, int math, int java, int english, int sport) {
		boolean b = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setInt(3, cla);
			pstmt.setInt(4, math);
			pstmt.setInt(5, java);
			pstmt.setInt(6, english);
			pstmt.setInt(7, sport);
			pstmt.setInt(8, num);
			pstmt.executeUpdate();
			b = true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public boolean update(String sql, int num, String name, int cla, String sex, String birth) {
		boolean b = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setInt(3, cla);
			pstmt.setString(4, sex);
			pstmt.setString(5, birth);
			pstmt.executeUpdate();
			b = true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public boolean query(String name, String pwd, int status1) {
		boolean flag = false;
		try {
			String sql = "select status from login where userid=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			int status2 = 0;
			while(rs.next()) {
				status2 = rs.getInt("status");
			}
			if (status1 == status2) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return flag;
	}

	public boolean next() {
		boolean b = false;
		try {
			if (rs.next())
				b = true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public ArrayList<StudentEntity> getNumGrades(int num) {
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		try {
			String sql = "select * from grades where num =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentEntity student = new StudentEntity();

				student.setNum(rs.getInt("num"));
				student.setName(rs.getString("name"));
				student.setCla(rs.getInt("cla"));
				student.setMath(rs.getInt("math"));
				student.setJava(rs.getInt("java"));
				student.setEnglish(rs.getInt("english"));
				student.setSport(rs.getInt("sport"));
				list.add(student);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

	public ArrayList<StudentEntity> getNumInformation(int num) {
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		try {
			String sql = "select * from information where num =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentEntity student = new StudentEntity();

				student.setNum(rs.getInt("num"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirth(rs.getString("birth"));
				student.setCla(rs.getInt("cla"));
				list.add(student);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

	public ArrayList<StudentEntity> getNameGrades(String name) {
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		try {
			String sql = "select * from grades where name like '%" + name + "%'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentEntity student = new StudentEntity();

				System.out.println(rs.getString("name"));

				student.setNum(rs.getInt("num"));
				student.setName(rs.getString("name"));
				student.setCla(rs.getInt("cla"));
				student.setMath(rs.getInt("math"));
				student.setJava(rs.getInt("java"));
				student.setEnglish(rs.getInt("english"));
				student.setSport(rs.getInt("sport"));
				list.add(student);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

	public ArrayList<StudentEntity> getForm(int cla) {
		ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
		try {
			String sql1 = "SELECT a.num,a.name,a.cla,a.math,a.java,a.english,a.sport ,a.sum ,(@ranking:=@ranking+1) as\r\n"
					+ " ranking FROM (select num,grades.name,cla,math,java,english,sport ,(math+java+english+sport) as sum from `grades` where cla = ?)\r\n"
					+ " a,(select @ranking:=0) b order by a.sum desc;";
//			String sql2 = "select sort((math+java+english+sport)) as sum from grades where cla = ? group by"
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, cla);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentEntity student = new StudentEntity();

				student.setNum(rs.getInt("num"));
				student.setName(rs.getString("name"));
				student.setCla(rs.getInt("cla"));
				student.setMath(rs.getInt("math"));
				student.setJava(rs.getInt("java"));
				student.setEnglish(rs.getInt("english"));
				student.setSport(rs.getInt("sport"));
				student.setSum(rs.getInt("sum"));
				student.setRanking(rs.getInt("ranking"));
				list.add(student);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

	public void closeCP() {
		try {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

	public void closeRs() {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}
