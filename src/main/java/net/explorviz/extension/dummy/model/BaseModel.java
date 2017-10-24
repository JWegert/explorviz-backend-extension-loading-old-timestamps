package net.explorviz.extension.dummy.model;

import java.util.concurrent.atomic.AtomicLong;

import com.github.jasminb.jsonapi.annotations.Id;

public class BaseModel {

	private static final AtomicLong ID_GENERATOR = new AtomicLong();

	@Id
	private long id;

	public BaseModel() {
		id = ID_GENERATOR.incrementAndGet();
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

}
