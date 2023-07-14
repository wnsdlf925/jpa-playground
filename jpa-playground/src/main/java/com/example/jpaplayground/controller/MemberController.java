package com.example.jpaplayground.controller;

import com.example.jpaplayground.domain.Member;
import com.example.jpaplayground.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor

@RequestMapping("/member")
@RestController
public class MemberController {
    private final MemberServiceImpl memberService;

    @PostMapping
    public ResponseEntity<?> CreateMember(@RequestBody Member member) throws Exception{
        try{

            memberService.CreateMember(member);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }

    @PatchMapping
    public ResponseEntity<?> ModifyMember(@RequestBody Member member){
        try {
            member = memberService.ModifyMember(member);
            return new ResponseEntity<>(member,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }


    }
    @DeleteMapping
    public ResponseEntity<?> RemoveMember(@RequestBody ConcurrentHashMap<String, Integer> map) {
        try {
            memberService.removeMember(map.get("id"));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> ViewMember() {
        try {
            return new ResponseEntity<>( memberService.ViewMember(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
