package scc.mvc.member.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "MEMBERROLE_SEQ_GENERATOR")
	private Long fno;
	
	private String roleName;	
}
