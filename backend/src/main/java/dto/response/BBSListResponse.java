package dto.response;

import java.util.List;

import domain.BBS;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BBSListResponse {

	private List<BBS> bbsList;
	
	public BBSListResponse(List<BBS> bbsList) {
		this.bbsList = bbsList;
	}
}
