package hello.core.member;

public interface MemberRepository {

    // 회원 저장
    void save(Member member);

    // 회원의 아이디로 회원찾기
    Member findById(Long memberId);

}
