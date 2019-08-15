package tech.sohocoder.service;

import tech.sohocoder.dao.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    public String getMessage(int type) {
        return messageDao.findById(type).getMessage();
    }
}
