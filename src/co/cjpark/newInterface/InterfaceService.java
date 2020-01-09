package co.cjpark.newInterface;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceService {
	default void run () {		//인터페이스에서 몸체(구현된 것)를 가질 수 있다. (default 키워드)
		System.out.println("인터페이스가 가지고 있는 메소드");
	}
	
	List<?> allSelect () throws SQLException;
	Object select(Object o)throws SQLException;
	int insert(Object o)throws SQLException;
	int update(Object o)throws SQLException;
	int delete(Object o)throws SQLException;
	//인터페이스 안에서 범위 지시자를 안쓰면 기본이 public으로 들어감 -> 일반에서는 안쓰면 protected형
	//인터페이스 -> thrw exception,  일반 클래스 -> try & catch 쓰는게 좋다
}
