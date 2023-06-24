 package com.learning.JPA.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment_data")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int comment_id;
	private String username;
	private String comment_desc;
	
	@ManyToOne
	@JoinColumn(name="post_id")
	private Post post;
	

	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Comment(int comment_id, String username, String comment_desc, Post post) {
		super();
		this.comment_id = comment_id;
		this.username = username;
		this.comment_desc = comment_desc;
		this.post = post;
	}
	public String getComment_desc() {
		return comment_desc;
	}
	public void setComment_desc(String comment_desc) {
		this.comment_desc = comment_desc;
	}
	public Comment(int comment_id, String username, String comment_desc) {
		super();
		this.comment_id = comment_id;
		this.username = username;
		this.comment_desc = comment_desc;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int comment_id, String username) {
		super();
		this.comment_id = comment_id;
		this.username = username;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", username=" + username + "]";
	}
	
	
	
	

}
