package scc.mvc.member.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import scc.mvc.member.domain.Member;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryMemberRepositoryTest {

    @Autowired
    MemberRepository repository;

    @Test
    public void findByName() {

        Member member1 = new Member();
        member1.setMemberName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setMemberName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(result);

    }
}