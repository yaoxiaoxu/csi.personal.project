package com.yaoxx.entity;

import com.yaoxx.base.baseEntity.Entity;

public class Iuser extends Entity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4652280502138624215L;


    private String name;

    private Integer age;

    private Byte sex;

    private String signature;

    private String nickname;

    private String headImg;
    
    private Integer type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}