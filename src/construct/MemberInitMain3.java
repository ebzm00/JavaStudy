package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1",15,90);

        MemberInit m2 = new MemberInit();
        m2.initMember("user2",16,80);


        MemberInit [] members = {m1,m2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }
}
