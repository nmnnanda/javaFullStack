 package com.creationalDesignPattern.singleton;

public class DB {
	private static DB db;

	private DB() {
	}

	public static DB getDB() {
		if (db == null) {
			db = new DB();
			System.out.println("from DB " + db.hashCode());
			return db;
		}
		System.out.println("from DB " + db.hashCode());
		return db;

	}

	public String getUserName() {
		return "admin";
	}

	public String getPassword() {
		return "admin";
	}
}
