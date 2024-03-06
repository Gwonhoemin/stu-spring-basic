package hello.core.member;

public class Member {
    private Long id;
    private String password;
    private Grade grade;

    public Member(Long id, String password, Grade grade) {
        this.id = id;
        this.password = password;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
