package jay.toy.domain;


//학습용 - 지워질 것
public class Student {
	
	//필드 정의 
	String name;
	String grade;
	int age;
	
	//기본생성자 
	
	public Student() {
		
	}
	public Student(String name, String grade, int age) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
	}
	//이름과 나이만 초기화하는 생성자
	
	public Student(String name, int age) {
		this.name = name;
		this.age  = age;
		this.grade = "미정"; //학년은 미정으로 설정
	}
	
	@Override
	public String toString() {
		return "Student [name=" +name + ", grade =" +grade + ",age =" + age+"}";
	}

	//메인 메서드에서 테스트 
//	public Static void main[]
}





