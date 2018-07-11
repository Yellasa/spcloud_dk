package com.video.cq.msprovideruser.dao;

import com.video.cq.msprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: yangting
 * @Description: 一句话描述这个类和方法
 * @Date:Created in 16:01  2018/1/25
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
}
