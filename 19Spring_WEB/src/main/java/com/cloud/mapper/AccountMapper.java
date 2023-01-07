package com.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 7:20
 */
@Mapper
public interface AccountMapper {

    // +
    @Update("update test.tb_account set money=money+#{money} where account_name=#{accountName}")
    public void incrMoney(@Param("accountName") String accountName, @Param("money") Integer money);

    // -
    @Update("update test.tb_account set money=money-#{money} where account_name=#{accountName}")
    public void decrMoney(@Param("accountName") String accountName, @Param("money") Integer money);

}
