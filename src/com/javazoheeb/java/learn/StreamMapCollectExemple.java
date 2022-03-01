package com.javazoheeb.java.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExemple {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Ramesh", "secrete", "ramesh@gmail.com"));
        users.add(new User(2, "Santosh", "secrete", "santosh@gmail.com"));
        users.add(new User(3, "Sanjay", "secrete", "sanjay@gmail.com"));
        users.add(new User(4, "Pramod", "secrete", "pramod@gmail.com"));
//        System.out.println("--");
//        System.out.println("Without Stream");
//        //Without Stream
//        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
//        for (User user : users) {
//            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
//        }
//
//        for (UserDTO dto : usersDTO) {
//            System.out.println(dto);
//        }

        System.out.println("--");
        System.out.println("using stream().map()");
        //using stream().map()
        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        });

        System.out.println("--");
        System.out.println("using stream().map() lambda expression");
        //using stream().map() lambda expression
        users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail())).forEach(userdto -> {
            System.out.println(userdto);
        });

        System.out.println("--");
        System.out.println("using stream().map() newList");
        //using stream().map() in new list
        List<UserDTO> usersDTOList = users.stream()
                .map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
                usersDTOList.forEach(System.out::println);

    }
}

class UserDTO {
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class User {
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

