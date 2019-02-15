package com.example.factory.modle.api.group;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 91319
 * @Title: GroupMemberAddModel
 * @ProjectName cocaChat
 * @Description:
 * @date 2019/2/15
 */
public class GroupMemberAddModel {

    private Set<String> users = new HashSet<>();

    public Set<String> getUsers() {
        return users;
    }

    public void setUsers(Set<String> users) {
        this.users = users;
    }

}
