package select.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import select.system.dao.UserMapper;
import select.system.dto.User;
import select.system.service.UserService;
import select.util.PageBean;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

/**
 * @author yeyuting
 * @create 2021/1/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper ;

    public User selectByName(String username) {
      return  userMapper.selectByName(username) ;
    }

    public User selectById(int id){
        return userMapper.selectById(id) ;
    }

    public List<User> selectAll(){
        return userMapper.selectAll() ;
    }

    public boolean insertOne(User user) {
        return userMapper.insertOne(user) ;
    }

    public boolean insertMany(List<User> userList) {
        return userMapper.insertMany(userList) ;
    }
    public boolean updateOne(User user){
        return userMapper.updateOne(user) ;
    }

    public boolean deleteById(int id){
        return userMapper.deleteById(id) ;
    }

    public List<User> SelectByStartIndexAndPageSize(int startIndex , int pageSize) {
        return userMapper.SelectByStartIndexAndPageSize(startIndex,pageSize) ;
    }

    public List<User> selectByMap(Map<String ,Object> map){
        return userMapper.selectByMap(map) ;
    }

    public List<User> SelectByPageBean(PageBean pageBean) {
        return userMapper.SelectByPageBean(pageBean) ;
    }

    public List<User> selectByLike(Map<String , Object> map){
        return userMapper.selectByLike(map) ;
    }



}
