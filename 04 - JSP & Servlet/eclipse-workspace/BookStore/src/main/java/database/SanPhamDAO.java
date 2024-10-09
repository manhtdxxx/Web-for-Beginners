package database;

import java.util.ArrayList;

import model.SanPham;

public class SanPhamDAO {
	private ArrayList<SanPham> data = new ArrayList<SanPham>();

	public ArrayList<SanPham> selectAll() {
		return data;
	}

	public SanPham selectById(String id) {
		for (SanPham sp : data) {
			if (sp.getMaSanPham().equals(id)) {
				return sp;
			}
		}
		return null;
	}

	public int insert(SanPham sp) {
		SanPham existed_sp = this.selectById(sp.getMaSanPham());
		if (existed_sp == null) {
			data.add(sp);
			return 1;
		}
		return 0;
	}

	public int insertAll(ArrayList<SanPham> list_sp) {
		int count = 0;
		for (SanPham sp : list_sp) {
			count += this.insert(sp);
		}
		return count;
	}

	public int delete(SanPham sp) {
		SanPham existed_sp = this.selectById(sp.getMaSanPham());
		if (existed_sp != null) {
			data.remove(existed_sp);
			return 1;
		}
		return 0;
	}

	public int deleteAll() {
		int count = data.size();
		data.clear();
		return count;
	}

	public int update(SanPham sp) {
		SanPham existed_sp = this.selectById(sp.getMaSanPham());
		if (existed_sp != null) {
			data.remove(existed_sp);
			data.add(sp);
			return 1;
		}
		return 0;

	}
}
