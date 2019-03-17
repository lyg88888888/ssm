package com.lyg.ssm.mapper;


import com.lyg.ssm.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository("accountMapper")
public interface IAccountMapper {

    /**
     * 根据id查询单个用户
     * @param id
     * @return
     */
    @Select("select id,name,money from account where id=#{id}")
    Account findById(Integer id);


    /**
     * 根据id更新账户余额
     *
     */
    @Update("update account set money=#{money} where id=#{id}")
    void update(Account account);
}
