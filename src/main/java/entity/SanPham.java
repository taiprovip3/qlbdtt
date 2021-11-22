/**
 * 19524791 - PHAN TAN TAI
 * Dung de luu tru cac thuoc tinh cua Dung Cu The Thao, dung de tham chieu, ket tap thanh lop khac.
 */
package entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SanPham {
	@Id
	private String maSanPham;
	private String tenSanPham;
	private int soLuongTon;
	private float donGia;
	@ElementCollection
	@CollectionTable(name = "DanhSachMonTheThao", joinColumns = @JoinColumn(name="maSanPham"))
	@Column(nullable = false)
	private List<String> chuyenTheThao;
	private String moTa;
	@ManyToOne
	@JoinColumn(name="maNhaCungCap")
	private NhaCungCap nhaCungCap;
	@ManyToOne
	@JoinColumn(name="maPhanLoai")
	private PhanLoai phanLoai;
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public List<String> getChuyenTheThao() {
		return chuyenTheThao;
	}
	public void setChuyenTheThao(List<String> chuyenTheThao) {
		this.chuyenTheThao = chuyenTheThao;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public PhanLoai getPhanLoai() {
		return phanLoai;
	}
	public void setPhanLoai(PhanLoai phanLoai) {
		this.phanLoai = phanLoai;
	}
	public SanPham() {
		super();
	}
	public SanPham(String maSanPham, String tenSanPham, int soLuongTon, float donGia, List<String> chuyenTheThao,
			String moTa, NhaCungCap nhaCungCap, PhanLoai phanLoai) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
		this.chuyenTheThao = chuyenTheThao;
		this.moTa = moTa;
		this.nhaCungCap = nhaCungCap;
		this.phanLoai = phanLoai;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuongTon=" + soLuongTon
				+ ", donGia=" + donGia + ", chuyenTheThao=" + chuyenTheThao + ", moTa=" + moTa + ", nhaCungCap="
				+ nhaCungCap + ", phanLoai=" + phanLoai + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSanPham == null) ? 0 : maSanPham.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		if (maSanPham == null) {
			if (other.maSanPham != null)
				return false;
		} else if (!maSanPham.equals(other.maSanPham))
			return false;
		return true;
	}
	
	
}
