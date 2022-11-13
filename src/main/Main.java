package main;

public class Main {
    public static void main(String[] args) {
    User user=new User(
            1,
            1,
            "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        user.setUserId(2);
       System.out.println(user.getUserId());
       System.out.println(user);

       User_2 user_2=new User_2(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
       user_2.setName("Max");
       System.out.println(user_2);
    }
}
