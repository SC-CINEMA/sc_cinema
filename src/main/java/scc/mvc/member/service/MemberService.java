package scc.mvc.member.service;

import scc.mvc.member.domain.Member;

import java.util.Optional;

public interface MemberService {
    void findByName(String name);
}
