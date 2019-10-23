package com.skd.pojo;
 
 
public class Review {
    private String content;
    private String createDate;
    private int id;
    private int uid;
    private String uname;
    private int pid;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String string) {
		this.createDate = string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Review [content=" + content + ", createDate=" + createDate + ", id=" + id + ", uid=" + uid + ", uname="
				+ uname + ", pid=" + pid + "]";
	}
	
    
   
}
