package com.video.cq.msconsumer.pojo;

import java.math.BigDecimal;

/**
 * @Author: yangting
 * @Description: 一句话描述这个类和方法
 * @Date:Created in 20:23  2018/1/25
 **/
public class User
{

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;

    public User()
    {
    }

    public User(Long id, String username, String name, Integer age, BigDecimal balance)
    {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void setBalance(BigDecimal balance)
    {
        this.balance = balance;
    }
}
