package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int date;
    private int countLike;
    private int countViews;
    private String domain;
    private String text;
    private boolean friendsOnly;
    private RepostsPost repostsPost;
    private CommentsPost commentsPost;
    private RepliesWrap repliesWrap;
    private LikeContent likeContent;
    private Geo geo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public int getCountViews() {
        return countViews;
    }

    public void setCountViews(int countViews) {
        this.countViews = countViews;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public RepostsPost getRepostsPost() {
        return repostsPost;
    }

    public void setRepostsPost(RepostsPost repostsPost) {
        this.repostsPost = repostsPost;
    }

    public CommentsPost getCommentsPost() {
        return commentsPost;
    }

    public void setCommentsPost(CommentsPost commentsPost) {
        this.commentsPost = commentsPost;
    }

    public RepliesWrap getRepliesWrap() {
        return repliesWrap;
    }

    public void setRepliesWrap(RepliesWrap repliesWrap) {
        this.repliesWrap = repliesWrap;
    }

    public LikeContent getLikeContent() {
        return likeContent;
    }

    public void setLikeContent(LikeContent likeContent) {
        this.likeContent = likeContent;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
