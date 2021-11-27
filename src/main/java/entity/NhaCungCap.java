/**
 * 19524791 - PHAN TAN TAI
 * NhaCungCap cung cap san pham cho shop bang cac lo xe van chuyen (nhap kho).
 */
package entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class NhaCungCap {
	@Id
	private String maNhaCungCap;
	private String tenDoiTac;
	private String quocGia;
	private String soDienThoai;
	@ElementCollection
	@CollectionTable(name = "SanPhamCungCap", joinColumns = @JoinColumn(name="maNhaCungCap"))
	private List<String> sanPhamCungCap;
	
	
	private SanPham maSanPham;

}
