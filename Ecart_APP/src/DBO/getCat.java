package DBO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modal.Catogery;

public class getCat {

	public static List<Catogery> get() {

		Connection cn = dbCon.initialize();
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from H_pcategory");
			List<Catogery> lc = new ArrayList<>();
			while (rs.next()) {
				Catogery c = new Catogery();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				lc.add(c);
			}

			return lc;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
