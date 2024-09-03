package dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 파라미터 없는 기본 생성자 생성
@AllArgsConstructor // 모든 필드 파라미터로 받는 생성자 생성
public class BBSListRequest {
	
	private int seq;
	private String title;
	private LocalDateTime createdAt;

}
