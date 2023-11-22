import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

public class LoginService {
    private LoginRepository loginRepository = new LoginRepository();
    private List<String> usersLogged = new ArrayList<>();

    public boolean login(UserForm userForm) throws LoginException {
        System.out.println("LoginService.login " + userForm);
        checkForm(userForm);
        String username = userForm.getUsername();
        if (usersLogged.contains(username)){
            throw new LoginException(username + " already logged");
        }
        boolean login = loginRepository.login(userForm);
        if (login){
            usersLogged.add(username);
        }
        return login;
    }
    public boolean logout(UserForm userForm) throws LoginException {
        System.out.println("LoginService.logout " + userForm);
        checkForm(userForm);
        String username = userForm.getUsername();
        if (!usersLogged.contains(username)){
            throw new LoginException(username + " not logged");
        }
        usersLogged.remove(username);
    }
    public int getUserLoggedCount(){
        return usersLogged.size();
    }
    private void checkForm(UserForm userForm){
        assert userForm != null;
        assert userForm.getUsername() != null;
        assert userForm.getPassword() != null;
    }

}
