package scc.mvc.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scc.mvc.member.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
