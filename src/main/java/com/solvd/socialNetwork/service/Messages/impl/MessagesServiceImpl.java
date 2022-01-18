package com.solvd.socialNetwork.service.Messages.impl;

import com.solvd.socialNetwork.binary.Messages;
import com.solvd.socialNetwork.dao.interfaces.IMessagesDAO;
import com.solvd.socialNetwork.dao.myBatis.MyBatisDAOFactory;
import com.solvd.socialNetwork.dao.mySQLImpl.MessagesDaoImpl;
import com.solvd.socialNetwork.service.Messages.MessagesService;
import org.apache.ibatis.session.SqlSession;

public class MessagesServiceImpl implements MessagesService {
    MessagesDaoImpl messagesDao;
    Messages messages;
    @Override
    public Messages getMessageByUserId(long id) {
        try(SqlSession sqlSession = MyBatisDAOFactory.getSessionFactory().openSession()){
            MessagesDaoImpl mapper = (MessagesDaoImpl) sqlSession.getMapper(IMessagesDAO.class);
            messages = mapper.getById(id);
        }
        return messages;
    }
}
