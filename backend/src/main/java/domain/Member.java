package domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Member {
	private String id;
	private String pwd;
	private String name;
	private String email;
	
}
