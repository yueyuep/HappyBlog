package group.yuyue.demo.Mapper;

import group.yuyue.demo.Entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Create by lp on 2020/1/8
 * 登录注册的相关操作
 */
@Mapper
@Repository
public interface SysUserMapper {
    //用户登录
    public SysUser findUser(String username);

    //用户注册
    public void insertUser(SysUser sysUser);


}
