package group.yuyue.demo.Controller.Login;

import group.yuyue.demo.Entity.SysUser;
import group.yuyue.demo.Services.SysUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by lp on 2020/1/9
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    SysUserServices sysUserServices;

    @GetMapping("/")
    public String home() {
        return "site/index";
    }

    //   负责页面跳转
    @GetMapping("/login")
    public String login() {
        return "site/login/login";
    }

    @GetMapping("/regist")
    public String regist() {
        return "site/login/regist";
    }

    //用户登录，注册的检验

    @GetMapping("login/check")
    @ResponseBody
    public int loginCheck(@RequestParam("user") String user, @RequestParam("pwd") String pwd) {
        int status;
        boolean flag = sysUserServices.loginUser(user, pwd);
        return status = flag ? 1 : 0;

    }

    @GetMapping("regist/check")
    @ResponseBody
    public int registCheck(@RequestParam("user") String user,
                           @RequestParam("email") String email,
                           @RequestParam("phone") String phone,
                           @RequestParam("pwd") String pwd) {
        int status;
        boolean flag = sysUserServices.regeisterUser(user, pwd, email, phone);
        return status = flag ? 1 : 0;
    }

    @GetMapping("regist/checkUser")
    @ResponseBody
    public int checkUser(@RequestParam("user") String user) {
        int status;
        return status = sysUserServices.findUser(user) ? 1 : 0;
    }


}
