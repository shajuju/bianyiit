package com.rw.dao;

import com.rw.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user values(null,#{name},#{age},#{address})")
    void saveUser(User user);

    @Delete("delete table where id=#{id}")
    void deleteUser(Integer id);

}
