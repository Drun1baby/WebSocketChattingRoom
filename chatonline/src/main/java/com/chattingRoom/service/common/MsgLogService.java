package com.chattingRoom.service.common;

import java.util.List;

import com.chattingRoom.dao.common.MsgLogDao;
import com.chattingRoom.entity.common.MsgLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息记录管理service
 * @author Administrator
 *
 */
@Service
public class MsgLogService {

	@Autowired
	private MsgLogDao msgLogDao;
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public MsgLog find(Long id){
		return msgLogDao.find(id);
	}
	
	
	/**
	 * 添加/编辑操作
	 * @param account
	 * @return
	 */
	public MsgLog save(MsgLog msgLog){
		return msgLogDao.save(msgLog);
	}
	
	/**
	 * 获取指定用户的指定状态消息
	 * @param accountId
	 * @param status
	 * @return
	 */
	public List<MsgLog> findByAccountIdAndStatus(Long accountId,int status){
		return msgLogDao.findByAccountIdAndStatus(accountId, status);
	}
	
	/**
	 * 根据消息内容查询关联记录
	 * @param msgContentId
	 * @return
	 */
	public List<MsgLog> findByMsgContentId(Long msgContentId){
		return msgLogDao.findByMsgContentId(msgContentId);
	}
	
	/**
	 * 返回总数
	 * @return
	 */
	public long total(){
		return msgLogDao.count();
	}
}
