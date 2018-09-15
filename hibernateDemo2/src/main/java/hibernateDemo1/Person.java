package hibernateDemo1;

import java.util.Date;

/**
 * ID ��Ϊ�־û���ʶ��
 * �÷�װ��,����������Ĭ��ֵ����������
 * �־û����ֶ�����޲����Ĺ��������в����Ƿ�����еģ�
 * ����ͨ���ṩget,set����
 * �־û��಻��final��
 * @author asu
 *
 */
public class Person {
	private Integer id;
	private String name;
	private int password;
	private Date birthday;
	private String address;

	public Person(){}

	public Person(String name, int password, Date birthday) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
