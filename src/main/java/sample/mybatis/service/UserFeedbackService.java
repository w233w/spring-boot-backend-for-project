package sample.mybatis.service;

import sample.mybatis.domain.UserFeedback;
import sample.mybatis.mappers.UserFeedbackMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFeedbackService {

	
	@Autowired
	private UserFeedbackMapper userFeedbackMapper;
	
	
	public int addUserFeedBack(UserFeedback feedback){return userFeedbackMapper.addUseFeedback(feedback);};
	public List<UserFeedback> readUserByUsername(String username){
		return userFeedbackMapper.selectUserFeedback(username);
	}
}
