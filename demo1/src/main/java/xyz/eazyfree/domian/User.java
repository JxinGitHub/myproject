package xyz.eazyfree.domian;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Entity
@Data
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Integer userId;

    private String userName;

    private String password;

    private String email;


    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
