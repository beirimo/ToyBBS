package domain;

import lombok.Data;


@Data
public class BBS {

	private int bid;
	private String title;
	private String contents;
	private String member_id;
}
