package edu.tcu.gadu.cytoscape;

public class ResourcePOJO implements Comparable<ResourcePOJO>{
	protected int id;
	protected String name;
	protected ResourcePOJO group = null;


	public ResourcePOJO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.group = null;
	}
	
	public ResourcePOJO(int id, String name, ResourcePOJO group) {
		this(id, name);
		this.group = group;
	}
	
	public String getGroupId(){
		if(this.group != null){
			return "\"" + this.group.id + "\"";
		} else{
			return "\"\"";
		}
	}
	
	@Override
	public boolean equals(Object other){
		if(((ResourcePOJO)other).id == id){
			if(((ResourcePOJO)other).name.equals(name)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(ResourcePOJO arg0) {
		if(id > arg0.id ){
			return 1;
		}
		if(arg0.id == id){
			return arg0.name.compareTo(name);
		}
		if(id < arg0.id ){
			return -1;
		}
		return 0;
	}
	
	
}
