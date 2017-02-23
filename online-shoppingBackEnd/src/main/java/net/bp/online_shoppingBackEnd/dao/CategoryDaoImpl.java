package net.bp.online_shoppingBackEnd.dao;

import java.util.ArrayList;
import java.util.List;

import net.bp.online_shoppingBackEnd.dto.Category;

public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<Category>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Western Dresses");
		category.setImageUrl("");
		category.setDescription("Various types of westerns are available");

		categories.add(category);

		
		category.setId(2);
		category.setName("Indian Dresses");
		category.setImageUrl("");
		category.setDescription("Various types of indian dresses are available");

		categories.add(category);
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
