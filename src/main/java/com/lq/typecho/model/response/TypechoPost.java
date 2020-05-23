package com.lq.typecho.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypechoPost {

    /**
     * wp_author : admin
     * permaLink : http://test.lqandfamily.xyz/index.php/archives/30/
     * mt_text_more :
     * wp_slug : 30
     * mt_allow_comments : 1
     * custom_fields : []
     * link : http://test.lqandfamily.xyz/index.php/archives/30/
     * description : 测试标题2
     * date_created_gmt : 2020-05-22 15:21:00
     * postid : 30
     * title : 测试标题2
     * userid : 1
     * mt_allow_pings : 1
     * wp_author_display_name : admin
     * dateCreated : 2020-05-22 23:21:00
     * sticky : 0
     * mt_keywords : 猫, 狗
     * categories : ["默认分类","测试分类"]
     * post_status : publish
     * mt_excerpt : 测试标题2
     * wp_password :
     * wp_author_id : 1
     */

    @JsonProperty("wp_author")
    private String wpAuthor;
    @JsonProperty("permaLink")
    private String permaLink;
    @JsonProperty("mt_text_more")
    private String text;
    @JsonProperty("wp_slug")
    private String wpSlug;
    @JsonProperty("mt_allow_comments")
    private int mtAllowComments;
    @JsonProperty("link")
    private String link;
    @JsonProperty("description")
    private String description;
    @JsonProperty("date_created_gmt")
    private String dateCreatedGmt;
    @JsonProperty("postid")
    private String postid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("mt_allow_pings")
    private int mtAllowPings;
    @JsonProperty("wp_author_display_name")
    private String wpAuthorDisplayName;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("sticky")
    private int sticky;
    @JsonProperty("mt_keywords")
    private String mtKeywords;
    @JsonProperty("post_status")
    private String postStatus;
    @JsonProperty("mt_excerpt")
    private String mtExcerpt;
    @JsonProperty("wp_password")
    private String wpPassword;
    @JsonProperty("wp_author_id")
    private String wpAuthorId;
    @JsonProperty("custom_fields")
    private List<?> customFields;
    @JsonProperty("categories")
    private List<String> categories;

    public String getWpAuthor() {
        return wpAuthor;
    }

    public void setWpAuthor(String wpAuthor) {
        this.wpAuthor = wpAuthor;
    }

    public String getPermaLink() {
        return permaLink;
    }

    public void setPermaLink(String permaLink) {
        this.permaLink = permaLink;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWpSlug() {
        return wpSlug;
    }

    public void setWpSlug(String wpSlug) {
        this.wpSlug = wpSlug;
    }

    public int getMtAllowComments() {
        return mtAllowComments;
    }

    public void setMtAllowComments(int mtAllowComments) {
        this.mtAllowComments = mtAllowComments;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreatedGmt() {
        return dateCreatedGmt;
    }

    public void setDateCreatedGmt(String dateCreatedGmt) {
        this.dateCreatedGmt = dateCreatedGmt;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getMtAllowPings() {
        return mtAllowPings;
    }

    public void setMtAllowPings(int mtAllowPings) {
        this.mtAllowPings = mtAllowPings;
    }

    public String getWpAuthorDisplayName() {
        return wpAuthorDisplayName;
    }

    public void setWpAuthorDisplayName(String wpAuthorDisplayName) {
        this.wpAuthorDisplayName = wpAuthorDisplayName;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getSticky() {
        return sticky;
    }

    public void setSticky(int sticky) {
        this.sticky = sticky;
    }

    public String getMtKeywords() {
        return mtKeywords;
    }

    public void setMtKeywords(String mtKeywords) {
        this.mtKeywords = mtKeywords;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getMtExcerpt() {
        return mtExcerpt;
    }

    public void setMtExcerpt(String mtExcerpt) {
        this.mtExcerpt = mtExcerpt;
    }

    public String getWpPassword() {
        return wpPassword;
    }

    public void setWpPassword(String wpPassword) {
        this.wpPassword = wpPassword;
    }

    public String getWpAuthorId() {
        return wpAuthorId;
    }

    public void setWpAuthorId(String wpAuthorId) {
        this.wpAuthorId = wpAuthorId;
    }

    public List<?> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<?> customFields) {
        this.customFields = customFields;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "TypechoPost{" +
                "wpAuthor='" + wpAuthor + '\'' +
                ", permaLink='" + permaLink + '\'' +
                ", mtTextMore='" + text + '\'' +
                ", wpSlug='" + wpSlug + '\'' +
                ", mtAllowComments=" + mtAllowComments +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", dateCreatedGmt='" + dateCreatedGmt + '\'' +
                ", postid='" + postid + '\'' +
                ", title='" + title + '\'' +
                ", userid='" + userid + '\'' +
                ", mtAllowPings=" + mtAllowPings +
                ", wpAuthorDisplayName='" + wpAuthorDisplayName + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", sticky=" + sticky +
                ", mtKeywords='" + mtKeywords + '\'' +
                ", postStatus='" + postStatus + '\'' +
                ", mtExcerpt='" + mtExcerpt + '\'' +
                ", wpPassword='" + wpPassword + '\'' +
                ", wpAuthorId='" + wpAuthorId + '\'' +
                ", customFields=" + customFields +
                ", categories=" + categories +
                '}';
    }
}
