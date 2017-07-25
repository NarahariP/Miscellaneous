package Test;

public class POJO {

	private Integer id;
	private String desc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public POJO(){
	}
	
	public POJO(Integer id, String desc){
		this.id= id;
		this.desc= desc;
	}
	@Override
	public String toString() {
		return "POJO [id=" + id + ", desc=" + desc + "]";
	}
}
