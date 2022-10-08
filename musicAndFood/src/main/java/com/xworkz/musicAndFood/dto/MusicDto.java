package com.xworkz.musicAndFood.dto;

public class MusicDto{

	private String name;
	private String singer;
	private String duration;
	private String producer;
	private String lyrics;
	private String lang;
	private String type;
	
	public MusicDto() {
		System.out.println("MusicDto constructor");
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MusicDto [name=" + name + ", singer=" + singer + ", duration=" + duration + ", producer=" + producer
				+ ", lyrics=" + lyrics + ", lang=" + lang + ", type=" + type + "]";
	}

	
	
}
