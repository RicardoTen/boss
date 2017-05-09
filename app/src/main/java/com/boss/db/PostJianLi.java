package com.boss.db;

import android.util.Log;

import cn.bmob.v3.BmobObject;

/**
 * Created by 滕新科 on 2017/4/26.
 */

public class PostJianLi extends BmobObject{

    /**
     * 这份简历的名称
     */
    String jianliName;
    /**
     * 投递简历的人
     */
    String postJianliUserNme;
    /**
     * 投递简历的人的电话
     */
    String postJianliUserPhone;
    /**
     * 收到简历的公司
     */
    String recieveCompanyName;
    /**
     * 收到简历的职位
     */
    String recieveCompanyJob;
    /**
     * 收到简历的BOSS名字
     */
    String reCompanyBossName;
    /**
     * 收到简历的BOSS电话
     */
    String reCompanyBossPhone;


    public String getJianliName() {
        return jianliName;
    }

    public void setJianliName(String jianliName) {
        this.jianliName = jianliName;
    }

    public String getPostJianliUserNme() {
        return postJianliUserNme;
    }

    public void setPostJianliUserNme(String postJianliUserNme) {
        this.postJianliUserNme = postJianliUserNme;
        Log.e("","");
    }

    public String getPostJianliUserPhone() {
        return postJianliUserPhone;
    }

    public void setPostJianliUserPhone(String postJianliUserPhone) {
        this.postJianliUserPhone = postJianliUserPhone;
    }

    public String getRecieveCompanyName() {
        return recieveCompanyName;
    }

    public void setRecieveCompanyName(String recieveCompanyName) {
        this.recieveCompanyName = recieveCompanyName;
    }

    public String getRecieveCompanyJob() {
        return recieveCompanyJob;
    }

    public void setRecieveCompanyJob(String recieveCompanyJob) {
        this.recieveCompanyJob = recieveCompanyJob;
    }

    public String getReCompanyBossName() {
        return reCompanyBossName;
    }

    public void setReCompanyBossName(String reCompanyBossName) {
        this.reCompanyBossName = reCompanyBossName;
    }

    public String getReCompanyBossPhone() {
        return reCompanyBossPhone;
    }

    public void setReCompanyBossPhone(String reCompanyBossPhone) {
        this.reCompanyBossPhone = reCompanyBossPhone;
    }

    public PostJianLi(){
        super();
    }


    public PostJianLi(String jianliName, String postJianliUserNme, String postJianliUserPhone, String recieveCompanyName, String recieveCompanyJob, String recieveCompanyBossName, String recieveCompanyBossPhone) {
        super();
        this.jianliName = jianliName;
        this.postJianliUserNme = postJianliUserNme;
        this.postJianliUserPhone = postJianliUserPhone;
        this.recieveCompanyName = recieveCompanyName;
        this.recieveCompanyJob = recieveCompanyJob;
        this.reCompanyBossName = recieveCompanyBossName;
        this.reCompanyBossPhone = recieveCompanyBossPhone;
    }
}
