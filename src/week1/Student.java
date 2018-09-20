package week1;

public class Student {
	private String name , id, group, email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInfo() {
		System.out.println("ten sv : "+name);
		System.out.println("ma sv : "+id );
		System.out.println("lop : "+group);
		System.out.println("email sv : "+ email);
		return null;
	}
	public Student(){
		name="Student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em) {
		name=n;
		id=sid;
		email=em;
		group="INT22041";
	}
	public Student(String n, String id, String group, String email) {
		this.name=n;
		this.id=id;
		this.group=group;
		this.email=email;
	}
	public Student(Student s){
		this.name=s.name;
		this.id=s.id;
		this.group=s.group;
		this.email=s.email;
	}

}
