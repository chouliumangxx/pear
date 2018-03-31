package com.buck.pear.controller;

import com.buck.pear.bean.Member;
import com.buck.pear.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class WxController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/hello")
    public String hello(){
       return "hello 测试小程序";
    }
    @RequestMapping("hello/{id}")
    public String hello1(@PathVariable Long id){
        return "hello id="+id;
    }

    @RequestMapping("/username")
    public Member username(Member member){

        member.setCreateTime(new Date());
        member.setId(123111L);
        member.setNickName("buck");
        member.setUsername("buck");

        memberService.save(member);
        return member;
    }

}
