package xyz.eazyfree.application.domian;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
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

    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 8, message = "姓名长度必须大于 2 且小于 20 字")
    private String userName;

    private String password;

    private String email;


    private String birthday;

    @Min(value = 18,message = "年龄必须要大于18岁")
    private String age;


    public User() {
    }

    public User(String userName, String password, String email, String birthday, String age) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
