package users.Modules;

public class users {

    private String login ;
    private String pass ;


    public users (String login,String pass){
        this.login=login;
        this.pass=pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String toString(){
        return "Login :"+login+" and password is : "+pass ;
    }
}
