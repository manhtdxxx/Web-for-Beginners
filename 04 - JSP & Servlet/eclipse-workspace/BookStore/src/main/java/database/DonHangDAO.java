package database;

import java.util.ArrayList;

import model.DonHang;
import database.ChiTietDonHangDAO;

public class DonHangDAO {
	private ArrayList<DonHang> data = new ArrayList<DonHang>();

	public ArrayList<DonHang> selectAll() {
		return data;
	}

	public DonHang selectById(String id) {
		DonHang searched_dh = new DonHang();
		searched_dh.setMaDonHang(id);

		for (DonHang dh : data) {
			if (dh.equals(searched_dh)) {
				return dh;
			}
		}
		return null;
	}

	public int insert(DonHang dh) {
		DonHang existed_dh = this.selectById(dh.getMaDonHang());
		if (existed_dh == null) {
			data.add(dh);
			return 1;
		} else {
			return 0;
		}
	}

	public int insertAll(ArrayList<DonHang> list_dh) {
		int count = 0;
		for (DonHang dh : list_dh) {
			count += this.insert(dh);
		}
		return count;
	}

	public int delete(DonHang dh) {
		DonHang existed_dh = this.selectById(dh.getMaDonHang());
		if (existed_dh != null) {
			data.remove(dh);
			
			ChiTietDonHangDAO ctdh = new ChiTietDonHangDAO();
			ctdh.deleteAll(dh);

			return 1;
		} else {
			return 0;
		}
	}
}
