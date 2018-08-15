package model;

import java.io.Serializable;
import java.util.Date;

public class MemberInfo implements Serializable {
    private String userKindId;

    private String userKindName;

    private Integer userKindFlag;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getUserKindId() {
        return userKindId;
    }

    public void setUserKindId(String userKindId) {
        this.userKindId = userKindId == null ? null : userKindId.trim();
    }

    public String getUserKindName() {
        return userKindName;
    }

    public void setUserKindName(String userKindName) {
        this.userKindName = userKindName == null ? null : userKindName.trim();
    }

    public Integer getUserKindFlag() {
        return userKindFlag;
    }

    public void setUserKindFlag(Integer userKindFlag) {
        this.userKindFlag = userKindFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userKindId=").append(userKindId);
        sb.append(", userKindName=").append(userKindName);
        sb.append(", userKindFlag=").append(userKindFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}