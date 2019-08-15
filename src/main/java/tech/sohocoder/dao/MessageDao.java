package tech.sohocoder.dao;

import tech.sohocoder.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao {

    int insert(MessageEntity entity);

    MessageEntity findById(Integer id);
}
