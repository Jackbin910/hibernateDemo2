package hibernateDemo1;

import java.util.Date;

/**
 * ID ��Ϊ�־û���ʶ�� �÷�װ��,����������Ĭ��ֵ���������� �־û����ֶ�����޲����Ĺ��������в����Ƿ�����еģ� ����ͨ���ṩget,set����
 * �־û��಻��final��
 * 
 * @author asu
 *
 */
public class Address {
	private Integer id;
	private String descs;
	private int code;

	public Address() {
	}

	public Address(String descs, int code) {
		super();
		this.descs = descs;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", descs=" + descs + ", code=" + code + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
