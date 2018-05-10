package xyz.eazyfree.domian;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    private String age;


    public User() {
    }

}
