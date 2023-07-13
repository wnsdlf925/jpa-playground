package com.example.jpaplayground.controller;

import com.example.jpaplayground.domain.Member;
import com.example.jpaplayground.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {
    private final MemberServiceImpl memberService;

    @PostMapping
    public ResponseEntity<?> createMember(@RequestBody Member member) throws Exception{
        try{

            memberService.createMember(member);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }
}
