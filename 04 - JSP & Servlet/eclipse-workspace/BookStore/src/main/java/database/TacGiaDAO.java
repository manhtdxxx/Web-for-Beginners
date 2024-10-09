package database;

import java.util.ArrayList;

import model.TacGia;

public class TacGiaDAO {
	private ArrayList<TacGia> data = new ArrayList<TacGia>();

	public ArrayList<TacGia> selectAll() {
		return data;
	}

	public TacGia selectById(String id) {
		TacGia searched_tg = new TacGia();
		searched_tg.setMaTacGia(id);
		for (TacGia tg : data) {
			if (tg.equals(searched_tg)) {
				return tg;
			}
		}
		return null;
	}

	public int insert(TacGia tg) {
		TacGia existed_tg = this.selectById(tg.getMaTacGia());
		if (existed_tg == null) {
			data.add(tg);
			return 1;
		} else {
			return 0;
		}
	}

	public int insertAll(ArrayList<TacGia> list_tg) {
		int count = 0;
		for (TacGia tg : list_tg) {
			count += this.insert(tg);
		}
		return count;
	}

	public int delete(TacGia tg) {
		TacGia existed_tg = this.selectById(tg.getMaTacGia());
		if (existed_tg != null) {
			data.remove(tg);
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

	public int update(TacGia tg) {
		TacGia existed_tg = this.selectById(tg.getMaTacGia());
		if (existed_tg != null) {
			data.remove(existed_tg);
			data.add(tg);
			return 1;
		} else {
			return 0;
		}
	}
}
