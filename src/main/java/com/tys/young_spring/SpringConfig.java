package com.tys.young_spring;

import com.tys.young_spring.repository.MemberRepository;
import com.tys.young_spring.repository.MemoryMemberRepository;
import com.tys.young_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean   // 이렇게 하면 스프링 빈에서 어? 이거 스프링 빈에 넣으라는 소리네 하고 인식함
    public MemberService memberService() {

        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
