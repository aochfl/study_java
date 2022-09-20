package _0919;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;

	public Board(int bno, String title, String content, String writer, Date date) {
		this.setBno(bno);
		this.setTitle(title);
		this.setContent(content);
		this.setWriter(writer);
		this.setDate(date);
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
