package com.yiduo.love.domain;

public class WxEventMessage extends WxMessage {
	private String event;

	private String eventKey;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
