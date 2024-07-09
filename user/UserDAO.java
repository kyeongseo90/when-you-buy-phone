package user;

import java.util.HashMap;
import java.util.Map;

public class UserDAO { // Repository
    Map<Long, User> db = new HashMap<>();
    // Generic이 기본 자료형(ex. int)을 받아주지 않고, 객체만을 받아주기 때문에 Wrapper class를 사용해야 한다.

    private static long key = 0L;

    // 회원가입
    public String save(User user){
        user.setId(++key);
        db.put(user.getId(), user);
        return user.getName();
    }

    // 회원정보 수정
    public String update(User user){
        if(db.get(user.getId()).equals(user)){
            db.put(user.getId(), user);
            return "회원정보가 변경되었습니다.";
        }
        else return "유저정보와 일치하는 유저를 찾을 수 없습니다.";
    }

    public String delete(User user) {
        if (db.get(user.getId()).equals(user)) {
            db.remove(user.getId());
            return "삭제 성공";
        }
        else {
            return "유저정보와 일치하는 유저를 찾을 수 없습니다.";
        }
    }

}
