package com.forum.pojo;

public class Floor {
    private int floorId;
    private int postId;
    private String content;
    private String userName;

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public int getFloorId() {
        return floorId;
    }

    public String getContent() {
        return content;
    }

    public int getPostId() {
        return postId;
    }

    public String getUserName() {
        return userName;
    }

    public Floor(int floorId, int postId, String content, String userName) {
        this.floorId = floorId;
        this.postId = postId;
        this.content = content;
        this.userName = userName;
    }

    public Floor() {
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorId=" + floorId +
                ", postId=" + postId +
                ", content='" + content + '\'' +
                ", user=" + userName +
                '}';
    }
}
