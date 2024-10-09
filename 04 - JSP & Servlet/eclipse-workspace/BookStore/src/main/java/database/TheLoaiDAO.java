package database;

import java.util.ArrayList;

import model.TheLoai;

public class TheLoaiDAO {
	private ArrayList<TheLoai> data = new ArrayList<TheLoai>();

	public ArrayList<TheLoai> selectAll() {
		return data;
	}

	public TheLoai selectById(String id) {
		for (TheLoai tl : data) {
			if (tl.getMaTheLoai().equals(id)) {
				return tl;
			}
		}
		return null;
	}

	public int insert(TheLoai tl) {
		TheLoai existed_tl = this.selectById(tl.getMaTheLoai());
		if (existed_tl == null) {
			data.add(tl);
			return 1;
		}
		return 0;
	}

	public int insertAll(ArrayList<TheLoai> list_tl) {
		int count = 0;
		for (TheLoai tl : list_tl) {
			count += this.insert(tl);
		}
		return count;
	}

	public int delete(TheLoai tl) {
		TheLoai existed_tl = this.selectById(tl.getMaTheLoai());
		if (existed_tl != null) {
			data.remove(tl);
			return 1;
		}
		return 0;
	}

	public int deleteAll() {
		int count = data.size();
		data.clear();
		return count;
	}

	public int update(TheLoai tl) {
		TheLoai existed_tl = this.selectById(tl.getMaTheLoai());
		if (existed_tl != null) {
			data.remove(existed_tl);
			data.add(tl);
			return 1;
		}
		return 0;
	}
}
