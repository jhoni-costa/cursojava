package br.com.jhonicosta.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1l;

	private Long timestamp;
	private Integer status;
	private String error;
	private String messege;
	private String path;

	public StandardError(Long timestamp, Integer status, String error, String messege, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.messege = messege;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
