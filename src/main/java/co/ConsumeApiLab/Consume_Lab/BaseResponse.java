package co.ConsumeApiLab.Consume_Lab;

import java.util.List;

public class BaseResponse {

	private List<Tiny> tiny;
	private List<Complete> complete;

	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}

	public List<Tiny> getTiny() {
		return this.tiny;
	}

	public List<Complete> getComplete() {
		return this.complete;
	}

}
