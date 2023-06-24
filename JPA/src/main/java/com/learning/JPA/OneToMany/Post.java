 package com.learning.JPA.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="post_data")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int post_id;
	
	@Column(nullable=false)
	private String post_name;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="post")
	private List<Comment> comments;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int post_id, String post_name, List<Comment> comments) {
		super();
		this.post_id = post_id;
		this.post_name = post_name;
		this.comments = comments;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_name=" + post_name + ", comments=" + comments + "]";
	}
	
	
	
	

	
	
}
