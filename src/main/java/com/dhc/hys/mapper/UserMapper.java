package com.dhc.hys.mapper;
import com.dhc.hys.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserMapper {
    //List<User> getUserByName(String name);
    User getUserById(Integer id);
    User getUserByName(String uname);
}

