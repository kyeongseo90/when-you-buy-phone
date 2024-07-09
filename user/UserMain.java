package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        UserService userService = new UserService();

        User user = new User();

        boolean flag = true;
        while (flag) {
            System.out.println("1: 회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료");
            System.out.print("입력: ");

            String loginId = "";
            String halfBaked = "";
            String name = "";
            st = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(st.nextToken());

            switch (choice) {
                case 1: // 회원가입
                    st = new StringTokenizer(br.readLine());
                    loginId = st.nextToken();
                    halfBaked = st.nextToken();
                    name = st.nextToken();

                    user.setAll(loginId, halfBaked, name);
                    userService.signUp(user);
                    break;
                case 2: // 로그인
                    st = new StringTokenizer(br.readLine());
                    loginId = st.nextToken();
                    halfBaked = st.nextToken();

                    userService.signIn(loginId, halfBaked);
                    break;
                case 3: // 회원정보 수정

                    halfBaked = st.nextToken();
                    name = st.nextToken();
                    userService.updateUser(user);
                    break;
                case 4: // 회원 탈퇴
                    userService.leaveUser(user);
                    break;
                case 0:
                    flag = false;
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        }
    }
}
