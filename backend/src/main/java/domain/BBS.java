package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data   //@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequireArggs Constructor 모두 포함
//@NoArgsConstructor  //파라미터 없는 기본 생성자 생성
//@AllArgsConstructor //모든 필드 파라미터로 받는 생성자 생성
public class BBS {

	//필드 정의 
	private int seq;
	private String title;
	private String contents;
	
	//기본 생성자
	public BBS() {
		
	}
	
	public BBS(int seq, String title, String contents) {
		this.seq = seq;
		this.title = title;
		this.contents = contents;
	}
	
}
