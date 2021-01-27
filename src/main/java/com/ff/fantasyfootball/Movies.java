package com.ff.fantasyfootball;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idmovies;
	
	@Column(name = "movie_id")
	private Integer movie_id;
	
	@Column(name = "liked", columnDefinition = "BOOL")
	private Boolean liked;
	
	@Column(name = "user_id")
	private Integer user_id;
	
	public Movies(){
    }

	public Long getIdmovies() {
		return idmovies;
	}

	public void setIdmovies(Long idmovies) {
		this.idmovies = idmovies;
	}


	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public Boolean getLiked() {
		return liked;
	}

	public void setLiked(Boolean liked) {
		this.liked = liked;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
}