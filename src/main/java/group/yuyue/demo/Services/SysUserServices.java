package group.yuyue.demo.Services;

import group.yuyue.demo.Entity.SysUser;
import group.yuyue.demo.Mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by lp on 2020/1/9
 */
@Service
public class SysUserServices {
    @Autowired
    SysUserMapper sysUserMapper;

    @Transactional
    public boolean regeisterUser(String user, String pwd, String email, String phone) {
        if (sysUserMapper.findUser(user) != null) {
            return false;
        }
        SysUser sysUser = new SysUser();
        sysUser.setUsername(user);
        sysUser.setPassword(pwd);
        sysUser.setEmail(email);
        sysUser.setPhone(phone);
        sysUserMapper.insertUser(sysUser);
        return true;
    }


    public boolean loginUser(String user, String pwd) {
        SysUser sysUser = sysUserMapper.findUser(user);
        if (sysUser.getPassword().equals(pwd))
            return true;
        else return false;

    }

    public boolean findUser(String user) {
        if (sysUserMapper.findUser(user) == null)
            return true;
        else
            return false;


    }


}
