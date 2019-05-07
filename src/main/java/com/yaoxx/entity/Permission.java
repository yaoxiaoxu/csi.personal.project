package com.yaoxx.entity;

import java.util.Date;
import java.util.List;

import com.yaoxx.base.baseEntity.Entity;

public class Permission extends Entity{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5500354019309224949L;

	private Integer type;

    private String name;

    private String icon;

    private Long pid;

    private String url;

    private String code;

    private Date createTime;

    private Date updateTime;

    private Long createUser;
    
    /**
          * 临时变量 :子级集合
     */
    private List<Permission>childs;
    
    /**
          * 临时变量 :消息数量
     */
    private Integer infoNum;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

	public List<Permission> getChilds() {
		return childs;
	}

	public void setChilds(List<Permission> childs) {
		this.childs = childs;
	}

	public Integer getInfoNum() {
		return infoNum;
	}

	public void setInfoNum(Integer infoNum) {
		this.infoNum = infoNum;
	}
}