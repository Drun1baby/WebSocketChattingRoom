package com.chattingRoom.service.common;

import java.util.List;

import com.chattingRoom.dao.common.FriendDao;
import com.chattingRoom.entity.common.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 好友service
 * @author Administrator
 *
 */
@Service
public class FriendService {

	@Autowired
	private FriendDao friendDao;
	
	/**
	 * 更新或新增
	 * @param addressBook
	 * @return
	 */
	public Friend save(Friend friend){
		return friendDao.save(friend);
	}
	
	/**
	 * 根据id查找
	 * @param account
	 * @return
	 */
	public Friend find(Long id){
		return friendDao.find(id);
	}
	
	/**
	 * 获取我的好友列表
	 * @return
	 */
	public List<Friend> findMyFriendList(Long id){
		return friendDao.findByAccountId(id);
	}
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Long id){
		friendDao.deleteById(id);
	}
}
