package cn.com.fovsoft.common.service;

import cn.com.fovsoft.common.bean.SysUser;
import cn.com.fovsoft.common.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("SysUserService")
public class SysUserService {


    @Resource
    private SysUserDao sysUserDao;


    public SysUser findByUserName(String userName) {

        SysUser sysUser = new SysUser();
        return sysUser;

    }

    public SysUser findByUserNameAndPwd(String username,String password){
        return sysUserDao.findByUserNameAndPwd(username,password);
    }


    public int updateUserZjdlip(String zjdlip, String userName){
        return sysUserDao.updateUserZjdlip(zjdlip,userName);
    }

}
