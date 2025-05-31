package BackEnd.Model;

public abstract class User 
{
    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) 
    {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

     public int getId(int id) {return this.id = id;}

}
