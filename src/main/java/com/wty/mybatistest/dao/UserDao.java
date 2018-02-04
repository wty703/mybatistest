package com.wty.mybatistest.dao;

import com.wty.mybatistest.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

	public User get(@Param("id") int id);

	public List<User> findList();

	public int insert(User user);

	public int update(User user);

	public int delete(@Param("id") int id);
}
