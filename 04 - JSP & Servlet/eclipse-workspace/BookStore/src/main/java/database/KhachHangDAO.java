package database;

import java.util.ArrayList;
import java.util.Collection;

import model.KhachHang;

public class KhachHangDAO {
	private ArrayList<KhachHang> data = new ArrayList<KhachHang>();

	public ArrayList<KhachHang> selectAll() {
		return data;
	}

	public KhachHang selectById(String id) {
		for (KhachHang kh : data) {
			if (kh.getMaKhachHang().equals(id)) {
				return kh;
			}
		}
		return null;
	}

	public int insert(KhachHang kh) {
		KhachHang existed_kh = this.selectById(kh.getMaKhachHang());
		if (existed_kh == null) {
			data.add(kh);
			return 1;
		} else {
			return 0;
		}
	}

	public int insertAll(ArrayList<KhachHang> list_kh) {
		int count = 0;
		for (KhachHang kh : list_kh) {
			count += this.insert(kh);
		}
		return count;
	}

	public int delete(KhachHang kh) {
		KhachHang existed_kh = this.selectById(kh.getMaKhachHang());
		if (existed_kh != null) {
			data.remove(kh);
			return 1;
		} else {
			return 0;
		}
	}

	public int deleteAll() {
		int count = data.size();
		data.clear();
		return count;
	}
	
	public int update(KhachHang kh) {
		KhachHang existed_kh = this.selectById(kh.getMaKhachHang());
		if (existed_kh != null) {
			data.remove(existed_kh);
			data.add(kh);
			return 1;
		} else {
			return 0;
		}
	}

}
