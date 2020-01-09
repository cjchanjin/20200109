package co.cjpark.newInterface;

import java.sql.SQLException;

public class MainApp {
	
	public static void main(String[] args) {
		InterfaceService service = new InterfaceServiceImpl();
		CountryDto dto = new CountryDto();
		try {
			dto = (CountryDto) service.select("CA");		//앞에서 형 변환 해서 넘어 온걸 다시 변환 시켜서 받는다.
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(dto.getCountry_id() + " ");
		System.out.println(dto.getCountry_name() + " ");
		System.out.print(dto.getRegion_id() + " ");
	}
}
