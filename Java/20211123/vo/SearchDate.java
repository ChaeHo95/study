package vo;

public class SearchDate {
	private String searchCondition;// 검색 조건을 받을 변수
	private String searchValue;// 검색 값을 받을 변수

	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

}
