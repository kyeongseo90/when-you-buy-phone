package user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final UserDAO dao = new UserDAO();
    private final List<Long> loggedUsers = new ArrayList<>(); // user의 key로 로그인 상태 관리

    public void signUp(User user){
        String userName = dao.save(user);
        System.out.println(userName + "님, 가입을 환영합니다.");
    }

    public void signIn(Long loginId, String halfBaked) {
        if (loggedUsers.contains(loginId)) {
            System.out.println("이미 로그인되어 있습니다.");
        } else if (!dao.checkLogin(loginId, halfBaked)) {
            System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
        } else {
            System.out.println(user.getName() + "님, 로그인되었습니다.");
            loggedUsers.add(user.getId());
        }
    }

    public void logout(User user) {
        System.out.println(user.getName() + "님, 로그아웃되었습니다.");
        loggedUsers.remove(user.getId());
    }

    public void updateUser(User user) {
        System.out.println(dao.update(user));
    }

    public void leaveUser(User user) {
        System.out.println(dao.delete(user));
    }
}
