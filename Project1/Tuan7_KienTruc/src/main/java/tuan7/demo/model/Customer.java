package tuan7.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Customer {
	@Id
	private String MaNV;
	private String Ten;
	private int Luong; 
	private String id;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String maNV, String ten, int luong, String id) {
		super();
		MaNV = maNV;
		Ten = ten;
		Luong = luong;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [MaNV=" + MaNV + ", Ten=" + Ten + ", Luong=" + Luong + ", id=" + id + "]";
	}
	
	
	
}
