package com.solvd.socialNetwork.service.basicInfo;

import com.solvd.socialNetwork.binary.BasicInfo;
import com.solvd.socialNetwork.binary.Jobs;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.School;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.util.List;

public interface BasicInfoService {

    void save(BasicInfo basicInfo);

    BasicInfo getById(long id);

    void delete(BasicInfo basicInfo);

    List<BasicInfo> getAll();

    MyLinkedList<Location> getRelatedLocationByFriendId(long id);

    MyLinkedList<School> getRelatedSchoolByFriendId(long id);

    MyLinkedList<Jobs> getRelatedJobByFriendId(long id);
}
