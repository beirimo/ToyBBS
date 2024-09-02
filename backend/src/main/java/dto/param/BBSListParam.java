package dto.param;

import domain.BBS;
import dto.request.BBSListRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data

//@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequireArggs Constructor 모두 포함
@NoArgsConstructor  //파라미터 없는 기본 생성자 생성
@AllArgsConstructor //모든 필드 파라미터로 받는 생성자 생성
public class BBSListParam {
	
	
	private int seq;
	private String title;
	private String createdAt;
	
	
	public BBSListParam(BBSListRequest req) {
		
		
	}

}
