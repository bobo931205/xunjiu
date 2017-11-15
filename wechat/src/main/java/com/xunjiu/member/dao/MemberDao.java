package com.xunjiu.member.dao;

import com.xunjiu.member.model.Member;
import org.springframework.stereotype.Service;

/**
 * Created by wangqb on 2017/10/30.
 */
public interface MemberDao {

    Member findMember();
}
