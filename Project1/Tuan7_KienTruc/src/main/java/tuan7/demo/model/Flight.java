package tuan7.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class Flight {
	@Id
	@Column(columnDefinition = "varchar(5)")
	private String macb;
	@Column(columnDefinition = "varchar(50)")
	private String gadi;
	@Column(columnDefinition = "varchar(50)")
	private String gaden;
	private Long dodai;
	private	Date giodi;
	private Date gioden;
	private Double chiphi;
	@Override
	public String toString() {
		return "Flight [macb=" + macb + ", gadi=" + gadi + ", gaden=" + gaden + ", dodai=" + dodai + ", giodi=" + giodi
				+ ", gioden=" + gioden + ", chiphi=" + chiphi + "]";
	}
	public Flight(String macb, String gadi, String gaden, Long dodai, Date giodi, Date gioden, Double chiphi) {
		super();
		this.macb = macb;
		this.gadi = gadi;
		this.gaden = gaden;
		this.dodai = dodai;
		this.giodi = giodi;
		this.gioden = gioden;
		this.chiphi = chiphi;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMacb() {
		return macb;
	}
	public void setMacb(String macb) {
		this.macb = macb;
	}
	public String getGadi() {
		return gadi;
	}
	public void setGadi(String gadi) {
		this.gadi = gadi;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public Long getDodai() {
		return dodai;
	}
	public void setDodai(Long dodai) {
		this.dodai = dodai;
	}
	public Date getGiodi() {
		return giodi;
	}
	public void setGiodi(Date giodi) {
		this.giodi = giodi;
	}
	public Date getGioden() {
		return gioden;
	}
	public void setGioden(Date gioden) {
		this.gioden = gioden;
	}
	public Double getChiphi() {
		return chiphi;
	}
	public void setChiphi(Double chiphi) {
		this.chiphi = chiphi;
	}

}
