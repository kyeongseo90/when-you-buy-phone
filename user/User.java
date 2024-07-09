package user;

public class User {
    private long id;
    private String loginId;
    private String halfBaked; // password
    private String name;

    public User(){}

    public User(String loginId, String halfBaked, String name){
        this.loginId = loginId;
        this.halfBaked = halfBaked;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getLoginId(){
        return loginId;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setAll(String loginId, String halfBaked, String name) {
        this.loginId = loginId;
        this.halfBaked = halfBaked;
        this.name = name;
    }
    public boolean is
}
