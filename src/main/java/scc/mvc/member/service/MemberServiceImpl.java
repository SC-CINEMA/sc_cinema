package scc.mvc.member.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scc.mvc.member.domain.Member;
import scc.mvc.member.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public void findByName(String name) {
        memberRepository.findByMemberId(name);
    }

	@Override
	public Member login(String memberId, String password) {
		
		return memberRepository.login(memberId, password);
	}
}
