package com.buck.pear.service.impl;

import com.buck.pear.bean.Member;
import com.buck.pear.dao.MemberDao;
import com.buck.pear.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by buck is 2018/3/31
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Integer save(Member member) {
        return memberDao.save(member);
    }
}
