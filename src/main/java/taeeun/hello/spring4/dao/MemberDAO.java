package taeeun.hello.spring4.dao;

import taeeun.hello.spring4.model.Member;

public interface MemberDAO {

    int insertMember(Member m);
    Member loginMember(Member m);
    Member selectOneMember(String userid);


}
