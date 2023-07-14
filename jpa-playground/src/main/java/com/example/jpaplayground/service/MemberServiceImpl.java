package com.example.jpaplayground.service;

import com.example.jpaplayground.domain.Member;
import com.example.jpaplayground.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private  final MemberRepository memberRepository;
   

    @Override
    public Member CreateMember(Member member) {
        Member saveMember = memberRepository.save(member);
        System.out.println(saveMember);
        return saveMember;
    }

    @Override
    @Transactional
    public Member ModifyMember(Member member) {

        Member saveMember = memberRepository.save(member);
        System.out.println(saveMember);
        return saveMember;
    }

    @Override
    public int removeMember(int id) {
        memberRepository.delete(memberRepository.findById(id));
        return 1;
    }

    @Override
    public List<Member> ViewMember() {
        return memberRepository.findAll();
    }
}
