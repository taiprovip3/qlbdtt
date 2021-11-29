package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DonMuaDao extends Remote{
	public boolean themDonMua(String maSanPham, int soLuong, float donGia) throws RemoteException;
}
