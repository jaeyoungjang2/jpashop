package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;
    @Test
    @Transactional
    public void testMember() throws Exception {
        // given
        Member member = new Member();
        member.setUsername("memberA");

        // when
        Long compareMemberId = memberRepository.save(member);
        Member compareMember = memberRepository.find(compareMemberId);

        // then
        Assertions.assertThat(compareMemberId).isEqualTo(member.getId());
        Assertions.assertThat(compareMember.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(compareMember).isEqualTo(member);
    }
}