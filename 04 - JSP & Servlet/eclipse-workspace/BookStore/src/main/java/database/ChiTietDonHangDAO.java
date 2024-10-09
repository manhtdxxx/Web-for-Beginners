package database;

import java.util.ArrayList;

import model.ChiTietDonHang;

public class ChiTietDonHangDAO {
	private ArrayList<ChiTietDonHang> data = new ArrayList<ChiTietDonHang>();

	public ArrayList<ChiTietDonHang> selectAll() {
		return data;
	}

	public ChiTietDonHang selectById(String id) {
		for (ChiTietDonHang ctdh : data) {
			if (ctdh.getMaChiTietDonHang().equals(id)) {
				return ctdh;
			}
		}
		return null;
	}

	public int insert(ChiTietDonHang ctdh) {
		ChiTietDonHang existed_ctdh = this.selectById(ctdh.getMaChiTietDonHang());
		if (existed_ctdh == null) {
			data.add(ctdh);
			return 1;
		} else {
			return 0;
		}
	}

	public int insertAll(ArrayList<ChiTietDonHang> list_ctdh) {
		int count = 0;
		for (ChiTietDonHang ctdh : list_ctdh) {
			count += this.insert(ctdh);
		}
		return count;
	}

	public int delete(ChiTietDonHang ctdh) {
		ChiTietDonHang existed_ctdh = this.selectById(ctdh.getMaChiTietDonHang());
		if (existed_ctdh != null) {
			data.remove(ctdh);
			return 1;
		} else {
			return 0;
		}
	}

	public int deleteAll(ArrayList<ChiTietDonHang> list_ctdh) {
		int count = 0;
		for (ChiTietDonHang ctdh : list_ctdh) {
			count += this.delete(ctdh);
		}
		return count;
	}

	public int update(ChiTietDonHang ctdh) {
		ChiTietDonHang existed_ctdh = this.selectById(ctdh.getMaChiTietDonHang());
		if (existed_ctdh != null) {
			data.remove(existed_ctdh);
			data.add(ctdh);
			return 1;
		} else {
			return 0;
		}
	}
}
