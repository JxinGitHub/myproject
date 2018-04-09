package xyz.eazyfree.domian;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    private String userName;

    private String password;

    private String email;
}
