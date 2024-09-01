package dto.response;

import java.util.List;

import domain.BBS;
import lombok.Data;

@Data
public class BBSListResponse {

	private List<BBS> bbsList;
	
	public BBSListResponse(List<BBS> bbsList) {
		this.bbsList = bbsList;
	}
}
