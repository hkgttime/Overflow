package org.oj.entity;

import java.io.Serializable;
import java.util.Date;

public class UserBase implements Serializable {

    private String uuid;
    private String name;
    private String password;
    private String emails;
    private String motto;
    private int commitTotal;
    private int acceptedTotal;
    private int status;
    private int score;
    private String avatar;
    private Date creatDate;

    public UserBase() {
    }

    public String getUuid() {
        return uuid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmails() {
        return emails;
    }


    public String getMotto() {
        return motto;
    }

    public int getCommitTotal() {
        return commitTotal;
    }

    public int getAcceptedTotal() {
        return acceptedTotal;
    }

    public int getStatus() {
        return status;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }


    public void setMotto(String motto) {
        this.motto = motto;
    }

    public void setCommitTotal(int commitTotal) {
        this.commitTotal = commitTotal;
    }

    public void setAcceptedTotal(int acceptedTotal) {
        this.acceptedTotal = acceptedTotal;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

}
