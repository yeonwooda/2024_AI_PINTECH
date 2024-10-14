package exam05;

public class Ex01 {
    public static void main(String[] args) {
//        LoginService loginService = new LoginService();
//
//        LoginService loginService1 = new LoginService();
//

        LoginService loginService = LoginService.getInstance();
        LoginService loginService1 = LoginService.getInstance();

        System.out.println(loginService == loginService1);


    }
}
