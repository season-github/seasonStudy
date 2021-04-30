package com.season.book.framework.entity;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * 学科- gs oa
 */
@Repository
public class DeanSubjectEntity implements Serializable {
    private static final long serialVersionUID = 1958640913200476495L;
    /**
     * 主键
     */
    private String subId;
    /**
     * 科目名称
     */
    private String subName;
    /**
     * 科目描述
     */
    private String subDesc;
    /**
     * 年级名称
     */
    private String gradeName;
    /**
     * 科目分类
     */
    private Integer subjectClassify;
    /**
     * 是否删除 (0=否，1=是)
     */
    private Boolean delFlag;

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubDesc() {
        return subDesc;
    }

    public void setSubDesc(String subDesc) {
        this.subDesc = subDesc;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getSubjectClassify() {
        return subjectClassify;
    }

    public void setSubjectClassify(Integer subjectClassify) {
        this.subjectClassify = subjectClassify;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "DeanSubject{" +
                "subId='" + subId + '\'' +
                ", subName='" + subName + '\'' +
                ", subDesc='" + subDesc + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", subjectClassify=" + subjectClassify +
                ", delFlag=" + delFlag +
                '}';
    }
}