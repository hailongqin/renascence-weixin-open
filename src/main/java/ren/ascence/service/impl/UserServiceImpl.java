package ren.ascence.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ren.ascence.entity.User;
import ren.ascence.mapper.UserMapper;
import ren.ascence.service.IUserService;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

}