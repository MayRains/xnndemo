package com.example.xnndemo.dao;


import com.example.xnndemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from account where name = #{username}")
    User LoginByName(@Param("username") String username);
}
