public class UserForm {
    public String username;
    public String password;

    public UserForm(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public String toString(){
        return "UserForm [username=" + username + ", password=" + password + "]";
    }
}
