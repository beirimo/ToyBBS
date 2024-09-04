package jay.toy.dto.param;

import jay.toy.dto.request.BBSListRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BBSListParam {
	
	private int seq;
	private String title;
	private String createdAt;
	
	public BBSListParam(BBSListRequest req) {
		
	}

}
