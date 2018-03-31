package com.buck.pear.dao.impl;

import com.buck.pear.bean.Member;
import com.buck.pear.dao.MemberDao;
import org.springframework.stereotype.Repository;

/**
 * create by buck is 2018/3/31
 */
@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

    @Override
    public Integer save(Member member) {
        return null;
    }
}
