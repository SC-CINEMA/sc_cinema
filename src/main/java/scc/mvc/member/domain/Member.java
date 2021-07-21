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
	private Long memberNumber; // 식별아이디
	private String memberId; // 아이디
	private String password;
	private String memberName; //성명
	private String birth;
	private String email;
	
	@CreationTimestamp
	private LocalDateTime regdate;
	
	@OneToMany
	@JoinColumn(name ="member")
	private List<MemberRole> roles;

	
	
	public Member(Long memberNumber, String memberId, String password, String memberName, String birth, String email,
			LocalDateTime regdate, List<MemberRole> roles) {
		super();
		this.memberNumber = memberNumber;
		this.memberId = memberId;
		this.password = password;
		this.memberName = memberName;
		this.birth = birth;
		this.email = email;
		this.regdate = regdate;
		this.roles = roles;
	}

	public Long getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(Long memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDateTime regdate) {
		this.regdate = regdate;
	}

	public List<MemberRole> getRoles() {
		return roles;
	}

	public void setRoles(List<MemberRole> roles) {
		this.roles = roles;
	}
}
