package database;

import java.util.ArrayList;

import model.TacGia;

public class TacGiaDAO {
	private ArrayList<TacGia> data = new ArrayList<TacGia>();

	private ArrayList<TacGia> selectAll() {
		return data;
	}
	
	private TacGia selectById(String id) {
		TacGia result = new TacGia();
		result.setMaTacGia(id);
		
		for (TacGia tacGia: data) {
			if (tacGia.equals(result)) {
				return tacGia
			}
		}
		return null;
	}
	
	private boolean 
}
