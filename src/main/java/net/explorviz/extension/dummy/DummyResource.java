package net.explorviz.extension.dummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.svenjacobs.loremipsum.LoremIpsum;

@Path("extension/dummy")
public class DummyResource {
	
	@GET
	@Path("/show")
	public String show() {
		
		// Note the dependency in the respective build.gradle
		final LoremIpsum loremIpsum = new LoremIpsum();
		
		return "Hi from dummy extension: " + loremIpsum.getParagraphs(1);
	}
}
