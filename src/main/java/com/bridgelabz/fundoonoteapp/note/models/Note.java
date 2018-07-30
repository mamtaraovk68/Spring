package com.bridgelabz.fundoonoteapp.note.models;

import org.springframework.data.elasticsearch.annotations.Document;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

@Document(indexName = "noteelasticsearch", type = "note")
//@Document(collection = "note")
//@org.springframework.data.elasticsearch.annotations.Document(indexName = "noteelasticsearch")
//@org.springframework.data.mongodb.core.mapping.Document(collection = "note")
public class Note {

	@Id
	private String id;
	private String userId;
	private String title;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	private Date reminder;
	private boolean isTrashed;
	private String color;
	private boolean isPin;
	private boolean isArchive;
	private List<LabelDTO> labels;

	public String getNoteId() {
		return id;
	}

	public void setNoteId(String noteId) {
		this.id = noteId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getReminder() {
		return reminder;
	}

	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}

	public boolean isTrashed() {
		return isTrashed;
	}

	public void setTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPin() {
		return isPin;
	}

	public void setPin(boolean isPin) {
		this.isPin = isPin;
	}

	public boolean isArchive() {
		return isArchive;
	}

	public void setArchive(boolean isArchive) {
		this.isArchive = isArchive;
	}

	public List<LabelDTO> getLabels() {
		return labels;
	}

	public void setLabels(List<LabelDTO> labels) {
		this.labels = labels;
	}

}
