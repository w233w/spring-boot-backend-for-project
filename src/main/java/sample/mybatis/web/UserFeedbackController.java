package sample.mybatis.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sample.mybatis.domain.UserFeedback;
import sample.mybatis.service.UserFeedbackService;


@RestController
public class UserFeedbackController {

	@Autowired
	UserFeedbackService userFeedbackService;

	@RequestMapping(value="/list",method=RequestMethod.POST)
	public List<UserFeedback> list(@RequestBody UserFeedback feedback){
		List<UserFeedback> list = new ArrayList();
		list=userFeedbackService.readUserByUsername(feedback.getUsername());
		return list;
	}


	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String readUserInfo(@RequestBody UserFeedback feedback){
		feedback.setTms(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		int result=userFeedbackService.addUserFeedBack(feedback);
		if(result<=0){
			return "failed";
		}
		else{
			return "succeed";
		}
	}
}
