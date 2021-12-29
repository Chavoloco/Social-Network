package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.*;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

public interface IBasicInfoDAO extends IEntityDAO<BasicInfo>{

    MyLinkedList<Location> getRelatedLocationByFriendId(long id);

    MyLinkedList<School> getRelatedSchoolByFriendId(long id);

    MyLinkedList<Jobs> getRelatedJobByFriendId(long id);
}
