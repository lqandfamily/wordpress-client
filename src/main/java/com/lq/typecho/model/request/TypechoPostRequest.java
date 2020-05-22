package com.lq.typecho.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lq.typecho.enums.CommentStatus;
import com.lq.typecho.enums.PingStatus;
import com.lq.typecho.enums.PostStatus;
import com.lq.typecho.enums.PostType;
import com.lq.typecho.model.interval.Enclosure;
import org.apache.commons.lang.StringUtils;

import java.util.Date;
import java.util.List;

import static org.chobit.wp.enums.PostType.POST;

/**
 * @author robin
 */
public class TypechoPostRequest extends Request {

    @JsonProperty("post_type")
    private String postType = POST.type;

    @JsonProperty("post_status")
    private PostStatus postStatus = PostStatus.PUBLISH;

    @JsonProperty("title")
    private String title;

    @JsonProperty("post_author")
    private Integer postAuthor;
    @JsonProperty("post_excerpt")
    private String postExcerpt;

    @JsonProperty("mt_text_more")
    private String text;

    @JsonProperty("dateCreated")
    private Date dateCreated;

    @JsonProperty("post_format")
    private String postFormat;
    @JsonProperty("post_name")
    private String postName;

    @JsonProperty("wp_password")
    private String accessPassword;

    @JsonProperty("mt_allow_comments")
    private CommentStatus allowComments = CommentStatus.OPEN;


    @JsonProperty("mt_allow_pings")
    private PingStatus allowPings = PingStatus.OPEN;


    private Integer sticky;
    @JsonProperty("post_thumbnail")
    private Integer postThumbnail;

    @JsonProperty("postId")
    private Integer postId;

    @JsonProperty("custom_fields")
    private List<CustomField> customFields;
    private Enclosure enclosure;

    @JsonProperty("mt_keywords")
    //这是请求时用的格式
    private String transTags;

    private String[] tags;

    @JsonProperty("categories")
    private String[] categories;

    public TypechoPostRequest() {
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType.type;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Integer postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateCreated(long postTime) {
        this.setDateCreated(new Date(postTime));
    }

    public String getPostFormat() {
        return postFormat;
    }

    public void setPostFormat(String postFormat) {
        this.postFormat = postFormat;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getAccessPassword() {
        return accessPassword;
    }

    public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }

    public CommentStatus getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(CommentStatus allowComments) {
        this.allowComments = allowComments;
    }

    public PingStatus getAllowPings() {
        return allowPings;
    }

    public void setAllowPings(PingStatus allowPings) {
        this.allowPings = allowPings;
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public Integer getPostThumbnail() {
        return postThumbnail;
    }

    public void setPostThumbnail(Integer postThumbnail) {
        this.postThumbnail = postThumbnail;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String... tags) {
        if (tags.length != 0) {
            this.tags = tags;
            this.transTags = StringUtils.join(tags, ',');
        }
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String... categories) {
        if (categories.length != 0) {
            this.categories = categories;
        }
    }

    public static class CustomField {

        private String key;

        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
