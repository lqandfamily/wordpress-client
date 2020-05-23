package com.lq.typecho.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize
public class TypechoUserBlog {

    /**
     * wp_author : admin
     * permaLink : http://test.lqandfamily.xyz/index.php/archives/30/
     * wp_post_format : standard
     * wp_slug : 30
     * link : http://test.lqandfamily.xyz/index.php/archives/30/
     * wp_more_text :
     * description : 测试标题2
     * postid : 30
     * title : 测试标题2
     * userid : 1
     * wp_author_display_name : admin
     * dateCreated : 2020-05-22 23:21:00
     * categories : ["默认分类","测试分类"]
     * post_status : publish
     * wp_password :
     * date_modified_gmt : 2020-05-22 17:04:21
     * mt_text_more :
     * mt_allow_comments : 1
     * custom_fields : []
     * date_created_gmt : 2020-05-22 15:21:00
     * mt_allow_pings : 1
     * date_modified : 2020-05-23 01:04:21
     * sticky : 0
     * mt_keywords : 猫, 狗
     * wp_post_thumbnail :
     * mt_excerpt : 测试标题2
     * wp_author_id : 1
     */

    @JsonProperty("wp_author")
    private String wpAuthor;
    @JsonProperty("permaLink")
    private String permaLink;
    @JsonProperty("wp_post_format")
    private String wpPostFormat;
    @JsonProperty("wp_slug")
    private String wpSlug;
    @JsonProperty("link")
    private String link;
    @JsonProperty("wp_more_text")
    private String wpMoreText;
    @JsonProperty("description")
    private String description;
    @JsonProperty("postid")
    private String postid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("wp_author_display_name")
    private String wpAuthorDisplayName;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("post_status")
    private String postStatus;
    @JsonProperty("wp_password")
    private String wpPassword;
    @JsonProperty("date_modified_gmt")
    private String dateModifiedGmt;
    @JsonProperty("mt_text_more")
    private String mtTextMore;
    @JsonProperty("mt_allow_comments")
    private int mtAllowComments;
    @JsonProperty("date_created_gmt")
    private String dateCreatedGmt;
    @JsonProperty("mt_allow_pings")
    private int mtAllowPings;
    @JsonProperty("date_modified")
    private String dateModified;
    @JsonProperty("sticky")
    private int sticky;
    @JsonProperty("mt_keywords")
    private String mtKeywords;
    @JsonProperty("wp_post_thumbnail")
    private String wpPostThumbnail;
    @JsonProperty("mt_excerpt")
    private String mtExcerpt;
    @JsonProperty("wp_author_id")
    private String wpAuthorId;
    @JsonProperty("categories")
    private List<String> categories;
    @JsonProperty("custom_fields")
    private List<?> customFields;

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

    public String getWpPostFormat() {
        return wpPostFormat;
    }

    public void setWpPostFormat(String wpPostFormat) {
        this.wpPostFormat = wpPostFormat;
    }

    public String getWpSlug() {
        return wpSlug;
    }

    public void setWpSlug(String wpSlug) {
        this.wpSlug = wpSlug;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getWpMoreText() {
        return wpMoreText;
    }

    public void setWpMoreText(String wpMoreText) {
        this.wpMoreText = wpMoreText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostId() {
        return postid;
    }

    public void setPostId(String postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userid;
    }

    public void setUserId(String userid) {
        this.userid = userid;
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

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getWpPassword() {
        return wpPassword;
    }

    public void setWpPassword(String wpPassword) {
        this.wpPassword = wpPassword;
    }

    public String getDateModifiedGmt() {
        return dateModifiedGmt;
    }

    public void setDateModifiedGmt(String dateModifiedGmt) {
        this.dateModifiedGmt = dateModifiedGmt;
    }

    public String getMtTextMore() {
        return mtTextMore;
    }

    public void setMtTextMore(String mtTextMore) {
        this.mtTextMore = mtTextMore;
    }

    public int getMtAllowComments() {
        return mtAllowComments;
    }

    public void setMtAllowComments(int mtAllowComments) {
        this.mtAllowComments = mtAllowComments;
    }

    public String getDateCreatedGmt() {
        return dateCreatedGmt;
    }

    public void setDateCreatedGmt(String dateCreatedGmt) {
        this.dateCreatedGmt = dateCreatedGmt;
    }

    public int getMtAllowPings() {
        return mtAllowPings;
    }

    public void setMtAllowPings(int mtAllowPings) {
        this.mtAllowPings = mtAllowPings;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
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

    public String getWpPostThumbnail() {
        return wpPostThumbnail;
    }

    public void setWpPostThumbnail(String wpPostThumbnail) {
        this.wpPostThumbnail = wpPostThumbnail;
    }

    public String getMtExcerpt() {
        return mtExcerpt;
    }

    public void setMtExcerpt(String mtExcerpt) {
        this.mtExcerpt = mtExcerpt;
    }

    public String getWpAuthorId() {
        return wpAuthorId;
    }

    public void setWpAuthorId(String wpAuthorId) {
        this.wpAuthorId = wpAuthorId;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<?> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<?> customFields) {
        this.customFields = customFields;
    }

    @Override
    public String toString() {
        return "TypechoUserBlog{" +
                "wpAuthor='" + wpAuthor + '\'' +
                ", permaLink='" + permaLink + '\'' +
                ", wpPostFormat='" + wpPostFormat + '\'' +
                ", wpSlug='" + wpSlug + '\'' +
                ", link='" + link + '\'' +
                ", wpMoreText='" + wpMoreText + '\'' +
                ", description='" + description + '\'' +
                ", postid='" + postid + '\'' +
                ", title='" + title + '\'' +
                ", userid='" + userid + '\'' +
                ", wpAuthorDisplayName='" + wpAuthorDisplayName + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", postStatus='" + postStatus + '\'' +
                ", wpPassword='" + wpPassword + '\'' +
                ", dateModifiedGmt='" + dateModifiedGmt + '\'' +
                ", mtTextMore='" + mtTextMore + '\'' +
                ", mtAllowComments=" + mtAllowComments +
                ", dateCreatedGmt='" + dateCreatedGmt + '\'' +
                ", mtAllowPings=" + mtAllowPings +
                ", dateModified='" + dateModified + '\'' +
                ", sticky=" + sticky +
                ", mtKeywords='" + mtKeywords + '\'' +
                ", wpPostThumbnail='" + wpPostThumbnail + '\'' +
                ", mtExcerpt='" + mtExcerpt + '\'' +
                ", wpAuthorId='" + wpAuthorId + '\'' +
                ", categories=" + categories +
                ", customFields=" + customFields +
                '}';
    }
}
