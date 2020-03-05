package org.oj.mapper;

import org.apache.ibatis.annotations.*;
import org.oj.entity.UserBase;

import java.util.List;

@Mapper
public interface UserDataMapper {

    @Insert("INSERT INTO USERS (uuid, name, password, emails, creatDate, status) VALUES (#{uuid}, #{name}, #{password}, #{email}, NOW(), #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "uuid")
    String insertUser(UserBase user);

    @Select("SELECT * FROM USERS WHERE emails=#{email} AND password=#{password}")
    UserBase findUser(@Param("email") String email, @Param("password") String password);

    @Delete("DELETE FROM USERS WHERE uuid = #{uuid}")
    int delUser(String uuid);

    @Select("SELECT COUNT(email) FROM USERS WHERE email = #{email}")
    int findEmail(String email);

    @Select("SELECT * FROM USERS LIMIT #{start},40 ORDER BY score DESC")
    List<UserBase> findByPage(int start);

    @Select("SELECT * FROM USERS WHERE uuid = #{uuid}")
    UserBase findUserById(String uuid);
}
