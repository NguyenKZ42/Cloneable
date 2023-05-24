package Advance.dev;

public class Student implements Cloneable{
	private String name;
	private int age;
	private String address;
	private String phone;
	private double score;
	
	public Student(String name, int age, String address, String phone, double score) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone=phone;
		this.score=score;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", score=" + score +
                '}';
	}

}
