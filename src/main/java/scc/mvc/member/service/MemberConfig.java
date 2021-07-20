package scc.mvc.member.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import scc.mvc.member.repository.MemberRepository;
import scc.mvc.member.repository.MemoryMemberRepository;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class MemberConfig {

    private EntityManager em;
    private DataSource dataSource;
    private final MemberRepository memberRepository;

    public MemberConfig(DataSource dataSource, EntityManager em, MemberRepository memberRepository) {
        this.dataSource = dataSource;
        this.em = em;
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();

    };
}
