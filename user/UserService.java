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

    public void signIn(User user) {
        System.out.println(user.getName() + "님, 로그인되었습니다.");
        loggedUsers.add(user.getId());
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
