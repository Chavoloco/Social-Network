package com.solvd.socialNetwork.service.user;

import com.solvd.socialNetwork.binary.User;

public interface UserService {

    User loadByUserName( String username);

}
