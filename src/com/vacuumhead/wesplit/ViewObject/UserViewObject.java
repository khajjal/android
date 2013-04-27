package com.vacuumhead.wesplit.ViewObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: pratyushverma
 * Date: 20/04/13
 * Time: 1:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserViewObject {

    private Integer userId;
    private String username;
    private List<Integer> groupMemberList = new ArrayList<Integer>();
    private List<Integer> groupAdminList = new ArrayList<Integer>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Integer> getGroupMemberList() {
        return groupMemberList;
    }

    public void setGroupMemberList(List<Integer> groupMemberList) {
        this.groupMemberList = groupMemberList;
    }

    public List<Integer> getGroupAdminList() {
        return groupAdminList;
    }

    public void setGroupAdminList(List<Integer> groupAdminList) {
        this.groupAdminList = groupAdminList;
    }
}
