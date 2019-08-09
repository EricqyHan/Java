package com.trilogyed.stwitter.util.messages;

public class CommentList {

    private String comment;
    private String poster;

    public CommentList(String comment, String poster) {
        this.comment = comment;
        this.poster = poster;
    }


    @Override
    public String toString() {
        return "CommentList{" +
                "comment='" + comment + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }

    public CommentList() {

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
