package Entity;
public class StudentEntity {
	private int num = 0;
	private String name=null;
	private String sex=null;
	private String birth=null;
	private int math=0;
	private int java=0;
	private int english=0;
	private int sport=0;
	private int cla=0;
	
	private int sum= 0;
	private int ranking = 0;
	
	public StudentEntity() {}
	public StudentEntity(int num,String name,int cla,int math,int java,int english,int sport) {
		this.num=num;
		this.name=name;
		this.cla=cla;
		this.math=math;
		this.java=java;
		this.english=english;
		this.sport=sport;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getSport() {
		return sport;
	}
	public void setSport(int sport) {
		this.sport = sport;
	}
	public int getCla() {
		return cla;
	}
	public void setCla(int cla) {
		this.cla = cla;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}

