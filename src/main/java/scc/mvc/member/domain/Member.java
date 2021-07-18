package scc.mvc.member.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
			generator = "MEMBER_SEQ_GENERATOR")
	private Long memberNumber;
	private String memberId;
	private String password;
	private String memberName;
	private String birth;
	private String email;
	
	@CreationTimestamp
	private LocalDateTime regdate;
	
	@OneToMany
	@JoinColumn(name ="member")
	private List<MemberRole> roles;
	
}
