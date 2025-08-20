package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
        // 코드 작성
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);

    }

    public Member findByName(String name) {
        for (Map.Entry<String, Member> stringMemberEntry : memberMap.entrySet()) {
            if (stringMemberEntry.getValue().getName().equals(name)) {
                return stringMemberEntry.getValue();
            }
        }
        return null;
    }
}
/*
findMember1 = Member{id='id1', name='회원1'}
findMember3 = Member{id='id3', name='회원3'}
removedMember1 = null
 */