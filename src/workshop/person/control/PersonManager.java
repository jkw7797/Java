package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public PersonManager() {

	}

//	4) main() : PersonEntity[ ] 객체들을 생성하여 화면에 출력한다.
	public static void main(String[] args) {
//		a. main() 메서드는 static 메서드 이므로 static이 아닌 메서드를 사용하기 위해 PersonManager 
//		pManager = new PersonManager() 객체를 생성한다.
		PersonManager pManager = new PersonManager();
		PersonEntity per = new PersonEntity();

//		b. printTitle(String Title) , printTitleLine()을 이용해서 타이틀을 출력한다.
		pManager.printTitle("@@@ 인물 정보 조회 시스템 @@@");
		pManager.printTitleLine();

//		c. PersonEntity[ ] persons = new PersonEntity[10]; 으로 PersonEntity 배열을 선언한다.
		PersonEntity[] persons = new PersonEntity[10];

//		d. fillPersons(PersonEntity[] persons)을 호출하여 persons에 정보를 set 한다.
		pManager.fillPersons(persons);

//		e. showPerson(PersonEntity[] persons)을 호출하여 전체 persons 정보를 display 한다.
		pManager.showPerson(persons);

//		f. findByGender(PesonEntity[] persons, char gender)를 호출하여 persons 객체 정보 중 해당 gender
//		의 인원수를 return 받는다. 이때 조건은 ‘여’ 라는 성별로 검색한다.
		pManager.findByGender(persons, '여');
//		g. showPerson(PersonEntity[] persons, String name)을 호출하여 특정 person의 상세정보를 display 
//		한다. 이때 이름 정보는 “김하늘” 로 한다
		pManager.showPerson(persons, "김하늘");
	}

	public void printTitle(String printTitle) {
		System.out.println("\n" + printTitle);
	}

	public void printTitleLine() {
		System.out.println("============================================================");
	}

	public void printItemLine() {
		System.out.println("------------------------------------------------------------");
	}

	public void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("이성호", "7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘", "7302132363217", "서울 강동구", "02-362-1932");
		persons[2] = new PersonEntity("박영수", "7503111233201", "서울 성북구", "02-887-1542");
		persons[3] = new PersonEntity("나인수", "7312041038988", "대전 유성구", "032-384-2223");
		persons[4] = new PersonEntity("홍정수", "7606221021341", "서울 양천구", "02-158-7333");
		persons[5] = new PersonEntity("이미숙", "7502142021321", "서울 강서구", "02-323-1934");
		persons[6] = new PersonEntity("박성구", "7402061023101", "서울 종로구", "02-308-0932");
		persons[7] = new PersonEntity("유성미", "7103282025101", "서울 은평구", "02-452-0939");
		persons[8] = new PersonEntity("황재현", "7806231031101", "인천 중구", "032-327-2202");
		persons[9] = new PersonEntity("최철수", "7601211025101", "인천 계양구", "032-122-7832");

	}

	public void showPerson(PersonEntity[] persons) {
		for (PersonEntity i : persons) {
			System.out.printf("[이름] %s\t[성별] %c\t[전화번호] %s\t\n", i.getName(), i.getGender(), i.getPhone());
			printItemLine();

		}
	}

	public void findByGender(PersonEntity[] persons, char gender) {
		int count = 0;
		for (PersonEntity i : persons) {
			if (i.getGender() == gender) {
				count++;
			}

		}
		System.out.printf("성별: \'%c\'은(는) %d명 입니다.\n", gender, count);
		
	}

	public void showPerson(PersonEntity[] persons, String name) {
		printTitleLine();
		System.out.printf("-- 이름 : \' %s \' (으)로 찾기 결과입니다. --\n", name);
		printItemLine();
		for (PersonEntity i : persons) {
			if (name.equals(i.getName())) {
				System.out.println("[이름] \t\t" + i.getName());
				System.out.println("[성별] \t\t" + i.getGender());
				System.out.println("[전화번호]\t" + i.getPhone());
				System.out.println("[주소] \t\t" + i.getAddress());

			}
		}
	}

}
