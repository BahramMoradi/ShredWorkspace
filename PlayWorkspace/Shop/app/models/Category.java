package models;

public class Category{
	private long cid;
	private String name;
	private String description;
	
	public Category() {}
	public Category(long cid, String name, String description) {
		this.cid = cid;
		this.name = name;
		this.description = description;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}