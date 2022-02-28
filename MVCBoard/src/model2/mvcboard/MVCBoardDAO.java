package model2.mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;
import common.DBConnPool;

public class MVCBoardDAO extends DBConnPool  {
	public MVCBoardDAO() {
		super();
	}
	
	//[��Ϻ���]
	// �˻� ���ǿ� �´� �Խù��� ������ ��ȯ�մϴ�.
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		//������ �غ�
		String query = "SELECT COUNT(*) FROM mvcboard ";
		//�˻������� �ִٸ� where���� �߰�
		if(map.get("searchWord") != null) {
			query += " where " + map.get("searchField") + " "
					+ " Like '%" + map.get("searchWord") + "%'";
		}
		try {
			stmt = con.createStatement(); //����������
			rs = stmt.executeQuery(query); //����������
			rs.next();
			totalCount = rs.getInt(1); //�˻��� �Խù� ���� ����
		}
		catch(Exception e) {
			System.out.println("�Խù� ī��Ʈ �� ���� �߻�");
			e.printStackTrace();
		}
		return totalCount;
	}
	
	//[��Ϻ���]
	// �˻� ���ǿ� �´� �Խù��� ����� ��ȯ�մϴ�(����¡ ��� ����).
	public List<MVCBoardDTO> selectListPage(Map<String, Object> map){
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>();
		String query = " SELECT * FROM ( "
				     + " SELECT Tb.*, ROWNUM rNum FROM ( "
				     + "    select * from mvcboard ";
		if (map.get("searchWord") != null)
		{
			query += " where " + map.get("searchField")
				  + " Like '%" + map.get("searchWord") + "%' ";
		}
		
		query   += "  order by idx desc "
				+  "  )Tb "
				+  "  ) "
				+  " where rNum between ? and ? ";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			
			// ��ȯ�� �Խù� ����� List�÷��ǿ� �߰�
			while (rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("�Խù� ��ȸ �� ���� �߻�");
			e.printStackTrace();
		}
		return board;
	}
}









