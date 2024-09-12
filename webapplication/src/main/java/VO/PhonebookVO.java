package VO;
public class PhonebookVO {
    // 필드 선언
    private int id;             // 전화번호 리스트 시퀀스 증가
    private String name;        // 이름
    private String hp;          // 전화번호
    private String memo;        // 메모

    // 기본 생성자
    public PhonebookVO() {
    }

    // 필드 생성자
    public PhonebookVO(int id, String name, String hp, String memo) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.memo = memo;
    }

    // Getter 및 Setter 메서드
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

	@Override
	public String toString() {
		return "PhonebookVO [id=" + id + ", name=" + name + ", hp=" + hp + ", memo=" + memo + "]";
	}

   
}
