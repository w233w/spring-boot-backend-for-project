package sample.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import sample.mybatis.domain.UserFeedback;

import java.util.List;

@Mapper
public interface UserFeedbackMapper {

	List<UserFeedback> selectUserFeedback(String username);
	int addUseFeedback(UserFeedback feedback);
}
