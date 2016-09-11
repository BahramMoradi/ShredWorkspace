package models;

public class Item{
	private long iid;
	private String name;
	private String description;
	private List<FilePart> fotos;
	
	public Item() {}
	public Item(long iid, String name, String description,List<FilePart> fotos ) {
		this.fotos=potos;
		this.iid = iid;
		this.name = name;
		this.description = description;
	}
	

	
}