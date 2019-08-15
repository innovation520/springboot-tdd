package tech.sohocoder.dao;

import tech.sohocoder.entity.MessageEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest // 只启动DAO层进行测试,@Transactional支持测试后数据回滚
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //使用真实数据库进行操作
public class MessageDaoTest {

    @Autowired
    MessageDao messageDao;

    @Test
    public void testInsert() {
        MessageEntity entity = new MessageEntity();
        entity.setId(1);
        entity.setMessage("hello");
        messageDao.insert(entity);
        entity = messageDao.findById(entity.getId());
        assertThat(entity.getMessage()).isEqualTo("hello");
    }


}
