package xyz.eazyfree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import xyz.eazyfree.domian.User;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
