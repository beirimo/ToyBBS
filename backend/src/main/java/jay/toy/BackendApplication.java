package jay.toy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.Student;

@MapperScan("dao")
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) { 
		SpringApplication.run(BackendApplication.class, args);
//	
//		//기본생성자 사용
//		Student student1 = new Student();
//	
//		//모든 필드를 초기화하는 생성자 사용
//		Student student2 = new Student("철수", "고등학교 1학년", 16);
//		
//		//이름과 나이만 초기화하는 생성자 사용
//		Student studnet3 = new Student("영희", 14);
//		
//		
//		//출력해서 확인
//		
//		System.out.println("student1  - 이름 : " + student1.n);
	}

}
