package com.chattingRoom.bean;

import java.util.List;

import com.chattingRoom.entity.common.MsgLog;
import org.springframework.stereotype.Component;

/**
 * 消息后台管理展示类
 * @author Administrator
 *
 */
@Component
public class MsgVo {

	private String sender;//发送者
	
	private String reciever;//接受者
	
	private List<MsgLog> msgLogs;//关联消息记录

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public List<MsgLog> getMsgLogs() {
		return msgLogs;
	}

	public void setMsgLogs(List<MsgLog> msgLogs) {
		this.msgLogs = msgLogs;
	}
	
	
}
