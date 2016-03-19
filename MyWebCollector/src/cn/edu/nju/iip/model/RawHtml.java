package cn.edu.nju.iip.model;

import java.util.Date;

/**
 * 
 * @author mrpod2g
 *
 */
public class RawHtml {
	
	private int id;
	
	private String url;
	
	private String content;
	
	private Date crawltime;
	
	private String source;
	//政府监管还是新闻媒体
	private String type;
	//附件内容
	private String attachment;
	
	

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCrawltime() {
		return crawltime;
	}

	public void setCrawltime(Date crawltime) {
		this.crawltime = crawltime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}