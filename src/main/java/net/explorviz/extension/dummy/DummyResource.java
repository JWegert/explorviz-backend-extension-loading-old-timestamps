package net.explorviz.extension.dummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("extension/dummy")
public class DummyResource {
	
	@GET
	@Path("/show")
	public String show() {
		return "Hi from dummy extension";
	}
}
