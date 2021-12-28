package com.solvd.socialNetwork.service;

import com.solvd.socialNetwork.binary.User;

public interface UserService {

    User loadByUserName( String username);

}
