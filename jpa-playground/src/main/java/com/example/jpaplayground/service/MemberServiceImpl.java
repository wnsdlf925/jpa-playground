package com.example.jpaplayground.service;

import com.example.jpaplayground.domain.Member;
import com.example.jpaplayground.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private  final MemberRepository memberRepository;
   

    @Override
    public Member CreateMember(Member member) {
        Member saveMember = memberRepository.save(member);
        System.out.println(saveMember);
        return saveMember;
    }
}
