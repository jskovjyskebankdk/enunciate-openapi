package dk.jyskebank.tools.enunciate.modules.openapi.returns;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {
	
	private List<String> messages = new ArrayList<>();
	
	public List<String> getMessages() {
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public void add(String newMessage) {
		if (messages.stream().anyMatch(m -> m.equals(newMessage))) {
			return;
		}
		this.messages.add(newMessage);
	}
}
