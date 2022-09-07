package com.tys.young_spring;

import com.tys.young_spring.repository.*;
import com.tys.young_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //@@@@@@@@@@@@@@@
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }
//@@@@@@@@@@@@@@@@@@@위,아래 다른것
//    private DataSource dataSource;
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Bean   // 이렇게 하면 스프링 빈에서 어? 이거 스프링 빈에 넣으라는 소리네 하고 인식함
    public MemberService memberService() {

        return new MemberService(memberRepository); //생성자() 지우고 바꿈
    }

 //   @Bean
  //  public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
        //
//        return new JpaMemberRepository(em);

  //  }

}
