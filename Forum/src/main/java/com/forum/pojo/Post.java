package com.forum.pojo;

public class Post {
    private int postId;
    private String headLine;
    private String content;
    private String creator;

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", headLine='" + headLine + '\'' +
                ", content='" + content + '\'' +
                ", creator=" + creator +
                '}';
    }

    public Post() {
    }

    public Post(int postId, String headLine, String content, String creator) {
        this.postId = postId;
        this.headLine = headLine;
        this.content = content;
        this.creator = creator;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getPostId() {
        return postId;
    }

    public String getHeadLine() {
        return headLine;
    }

    public String getContent() {
        return content;
    }

    public String getCreator() {
        return creator;
    }
}
