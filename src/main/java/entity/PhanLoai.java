/**
 * 19524791 - PHAN TAN TAI
 * Dung de phan loai cac san pham thanh ke hang hop li, tien cho viec tim kiem, thong ke
 */
package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PhanLoai {
	private int stt;
	@Id
	private String maPhanLoai;
	@Column(columnDefinition = "nvarchar(255)")
	private String tenPhanLoai;
	@Column(columnDefinition = "nvarchar(255)")
	private String moTa;
	
	@OneToMany (mappedBy = "phanLoai")
	private List<SanPham> danhSachSanPham;

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getMaPhanLoai() {
		return maPhanLoai;
	}

	public void setMaPhanLoai(String maPhanLoai) {
		this.maPhanLoai = maPhanLoai;
	}

	public String getTenPhanLoai() {
		return tenPhanLoai;
	}

	public void setTenPhanLoai(String tenPhanLoai) {
		this.tenPhanLoai = tenPhanLoai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}

	public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}

	public PhanLoai() {
		super();
	}

	public PhanLoai(int stt, String maPhanLoai, String tenPhanLoai, String moTa) {
		super();
		this.stt = stt;
		this.maPhanLoai = maPhanLoai;
		this.tenPhanLoai = tenPhanLoai;
		this.moTa = moTa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhanLoai == null) ? 0 : maPhanLoai.hashCode());
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
		PhanLoai other = (PhanLoai) obj;
		if (maPhanLoai == null) {
			if (other.maPhanLoai != null)
				return false;
		} else if (!maPhanLoai.equals(other.maPhanLoai))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhanLoai [stt=" + stt + ", maPhanLoai=" + maPhanLoai + ", tenPhanLoai=" + tenPhanLoai + ", moTa=" + moTa
				+ ", danhSachSanPham=" + danhSachSanPham + "]";
	}

	
	
	
}