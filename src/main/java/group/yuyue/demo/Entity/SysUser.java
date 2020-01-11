package group.yuyue.demo.Entity;

import lombok.Data;

/**
 * Create by lp on 2020/1/8
 */
@Data
public class SysUser {
    private long id;
    private String username;
    private String password;
    private String email;
    private String phone;
}
