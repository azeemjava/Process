package in.tritonlabs.detail.request;

public class VoteRequest {

	private long id;
	private String name;
	private long identity;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdentity() {
		return identity;
	}

	public void setIdentity(long identity) {
		this.identity = identity;
	}

}

