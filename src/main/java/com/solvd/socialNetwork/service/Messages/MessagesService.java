package com.solvd.socialNetwork.service.Messages;

import com.solvd.socialNetwork.binary.Messages;

public interface MessagesService {
    Messages getMessageByUserId(long id);
}
