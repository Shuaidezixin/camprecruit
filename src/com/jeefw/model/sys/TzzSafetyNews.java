package com.jeefw.model.sys;



import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 
import javax.persistence.Table; 
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties; 
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.Cache; 
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.base.Objects; 
import com.jeefw.model.sys.param.TzzSafetyNewsParameter;

import core.support.DateTimeSerializer;

   /**
    * TzzSafetyNews 实体类
    * Fri Sep 18 10:05:34 CST 2015  tudou
    */ 
@Entity
@Table(name ="tzz_safetyNews" )
@Cache(region = "all", usage = CacheConcurrencyStrategy.READ_WRITE)
@JsonIgnoreProperties(value = { "maxResults", "firstResult", "topCount", "sortColumns", "cmd","queryDynamicConditions", "sortedConditions", "dynamicProperties", "success", "message", "sortColumnsString", "flag" })
public class TzzSafetyNews extends  TzzSafetyNewsParameter{


// 各个字段的含义请查阅文档的数据库结构部分	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name", length = 60 )
	private String name;

	@Column(name = "brief", length = 255 )
	private String brief;

	@Column(name = "content", length = 255 )
	private String content;

	@Column(name = "type", length = 20 )
	private int type;
	
	@Column(name = "origin", length = 20 )
	private int origin;

	 
	@Column(name = "istop", length = 1 )
	private int istop;
	
	@Column(name = "ispublish", length = 1 )
	private int ispublish;
	
	@Column(name = "isdelete", length = 1 )
	private int isdelete;
	
	@Column(name = "publishtime")
	@Temporal(TemporalType.TIMESTAMP) 
	private Date publishtime;

	@Column(name = "creattime")
	@Temporal(TemporalType.TIMESTAMP) 
	private Date creattime;

	@Column(name = "creater", length = 255 )
	private String creater;

	@Column(name = "img", length = 255 )
	private String img;

	
	public TzzSafetyNews(){	
	}
	
	public TzzSafetyNews(String name,String brief,String content,int type,int origin,int istop,int ispublish,Date publishtime,String img){	
		this.name = name;
		this.brief = brief;
		this.content = content;
		this.type = type;
		this.origin = origin;
		this.istop = istop;
		this.ispublish = ispublish;
		this.publishtime = publishtime;
		this.img= img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public int getIstop() {
		return istop;
	}

	public void setIstop(int istop) {
		this.istop = istop;
	}

	public int getIspublish() {
		return ispublish;
	}

	public void setIspublish(int ispublish) {
		this.ispublish = ispublish;
	}

	public int getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}
	@JsonSerialize(using = DateTimeSerializer.class)  
	public Date getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}
	@JsonSerialize(using = DateTimeSerializer.class)  
	public Date getCreattime() {
		return creattime;
	}

	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TzzSafetyNews other = (TzzSafetyNews) obj;
		return Objects.equal(this.id, other.id)  && Objects.equal(this.name, other.name) && Objects.equal(this.brief, other.brief) && Objects.equal(this.content, other.content);
	}
	


	public int hashCode() {
		return Objects.hashCode(this.id,this.name,this.brief,this.content);
	}
}

