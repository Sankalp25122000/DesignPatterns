package com.aurionpro.model;

public class XMLDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if (type.equalsIgnoreCase("employee")) {
			return new XMLEmpDao();
		}
		if (type.equalsIgnoreCase("department")) {

			return new XMLDepDao();
		}
		return null;
	}
}
