package xyz.eazyfree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import xyz.eazyfree.domian.User;

/**
 * 用户持久层操作接口
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
