package jay.toy.dto.request;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BBSListRequest {
	
	private int seq;
	private String title;
	private LocalDateTime createdAt;
	
}
