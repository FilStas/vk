package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String domain;
    private String text;
    private int replyPostId;
    private int friendsOnly;
    private int replyOwnerId;
    private RepostsPost repostsPost;
    private CommentsPost commentsPost;
    private RepliesWrap repliesWrap;
    private LikeContent likeContent;
    private WallPostContent wallPostContent;
    private PostHeader postHeader;
    private ViewsContent viewsContent;
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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
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

    public WallPostContent getWallPostContent() {
        return wallPostContent;
    }

    public void setWallPostContent(WallPostContent wallPostContent) {
        this.wallPostContent = wallPostContent;
    }

    public PostHeader getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(PostHeader postHeader) {
        this.postHeader = postHeader;
    }

    public ViewsContent getViewsContent() {
        return viewsContent;
    }

    public void setViewsContent(ViewsContent viewsContent) {
        this.viewsContent = viewsContent;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

}
