package dto.param;

import dto.request.BBSListRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BBSListParam {
	
	
	private String seq;
	private String title;
	private String text;
	
	
	public BBSListParam(BBSListRequest req) {
		
		
	}

}
