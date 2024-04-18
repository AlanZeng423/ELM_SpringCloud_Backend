package com.neusoft.mapper;

import com.neusoft.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("select * from user where userId=#{userId} and password=#{password}")
    public User getUserByIdByPass(User user);

    @Select("select count(*) from user where userId=#{userId}")
    public int getUserById(String userId);

    // @Insert("insert into user values(#{userId},#{password},#{userName},#{userSex},null,1)")
    @Insert("insert into user values(#{userId},#{password},#{userName},#{userSex},null,1,0)")
    public int saveUser(User user);

    @Update("update user set point = #{point} where userId = #{userId}")
    public int updatePoint(User user);

    @Select("select point from user where userId = #{userId}")
    public double getPointById(String userId);
}