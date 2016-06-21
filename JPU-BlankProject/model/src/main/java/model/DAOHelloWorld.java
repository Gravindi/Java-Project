package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOHelloWorld extends DAOEntity<HelloWorld> {
	private int map;
	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOHelloWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	/* @Override
	public HelloWorld find(final int id) {
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call helloworldById(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				helloWorld = new HelloWorld(id, resultSet.getString("key"), resultSet.getString("message"));
			}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	/* @Override
	public HelloWorld find(final String key) {
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call helloworldByKey(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, key);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				helloWorld = new HelloWorld(resultSet.getInt("id"), key, resultSet.getString("message"));
			}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	@Override
	public HelloWorld find() {
		String type_element = null;
		int pos_x = 0;
		int pos_y = 0;
		HelloWorld helloWorld = new HelloWorld(type_element, pos_x, pos_y);

		try {
			final String sql = "{call createmap2()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				type_element = resultSet.getString("type_element");
				pos_x = resultSet.getInt("pos_x");
				pos_y = resultSet.getInt("pos_y");
				do{
					helloWorld = new HelloWorld(resultSet.getString("type_element"), resultSet.getInt("pos_x"), resultSet.getInt("pos_y"));
				}while(resultSet.next());
			}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
