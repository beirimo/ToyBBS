package jay.toy.dto.param;

import jay.toy.dto.request.CreateBBSRequest;
import lombok.Data;

@Data
public class CreateBBSParam {

	private String title;
	private String contents;
	
	public CreateBBSParam(CreateBBSRequest req) {
		//CreateBBSParam 이란 이름으로 객체를 만들건데 그 객체안에 CreateBBSRequest dto를 통해 데이터를 전송하기로 하고 그 매개변수 인자를 req라고 함
		this.contents = req.getContents();
		// 생성자contents 안에 클라이언트가 요청한 내용을 get으로 불러와서 답아줌
		this.title = req.getTitle();
		//클라이언트의 요청에서 받은 title값을 필드에 설정함
	}
}
