package co.cjpark.newInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class InterfaceServiceImpl implements InterfaceService {
	public PreparedStatement psmt;
	public ResultSet rs;
	
	private String SELECT = "select * from countries where country_id = ?";
	
	@Override
	public List<?> allSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object select(Object o) throws SQLException {
		//DAO 사용하기 위해 초기화
		CountryDao dao = new CountryDao();
		CountryDto dto = new CountryDto();
		psmt = dao.conn.prepareStatement(SELECT);		//상속을 안받아서 dao.conn 이런식으로 결합도가 높아짐 -> 안좋은 코딩
		psmt.setString(1, (String)o);			//형변환 시켜서 object 를 받음
		rs = psmt.executeQuery();
		if(rs.next()) {
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
			
		}
		return dto;
	}

	@Override
	public int insert(Object o) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Object o)throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object o) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
