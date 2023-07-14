package com.example.jpaplayground.service;

import com.example.jpaplayground.domain.Member;

import java.util.List;

public interface MemberService {
    public Member CreateMember(Member member);
    public Member ModifyMember(Member member);
    public int removeMember(int id);
    public List<Member> ViewMember();
}
