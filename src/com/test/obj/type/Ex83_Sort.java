package com.test.obj.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex83_Sort {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		
	}

	private static void m7() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(4);
		nums.add(2);
		nums.add(1);
		nums.add(3);
		
//		Collections.sort(nums, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		});
//		System.out.println(nums);

		nums.sort(new Comparator<Integer>() { ///////////////
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		}); ///"ArrayList같은거 이런 객체 자체도 sort를 가지고 있다."///
		System.out.println(nums);
		
	}

	private static void m6() {
		Student[] list = new Student[5];
		// 명확한 기준이 필요하다.
		list[0] = new Student("가가가", 100, 90, 80);
		list[1] = new Student("나나나", 99, 98, 88);
		list[2] = new Student("다다다", 87, 89, 79);
		list[3] = new Student("라라라", 65, 67, 87);
		list[4] = new Student("마마마", 76, 79, 68);
		
		Arrays.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// return o1.getKor() - o2.getKor(); 
				// 첫번쨰 인자가 앞에오면 오름차순, 뒤에오면 내림차순이다.
				 return (o1.getKor()+o1.getEng()+o1.getMath()) - (o2.getKor() + o2.getEng() + o2.getMath());
			}
		});
		
		System.out.println(Arrays.toString(list));
	}

	private static void m5() {
		
		String[] names = {"홍길동","아무개", 
				"하하하", "가가가", "나나나", "김민", "남궁재민"};
		
		// 가나다순 > 오름차순
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//내림차순
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); //String에는 compareTo가 있음 
			}
		});
		// 글자수 순으로...
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}			
		}); // 이게 편하다.
		
		System.out.println(Arrays.toString(names)); // 이름 글자수 개수 만큼
		
		
	}

	private static void m4() {
		Integer[] nums = {1, 5, 4, 2, 3};
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(nums));
	}

	private static void m3() {
		Integer[] nums = {1, 5, 4, 2, 3};
		
		// 오로지 정렬할 때만 쓰는 애다.
		Comparator<Integer> my= new Comparator<Integer>() { // 얘가 태어난 이유 정렬에 넣을라고.
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		}; // 껍데기 만듬
		Arrays.sort(nums, my);
		System.out.println(Arrays.toString(nums));
	}

	private static void m2() {
		Integer[] nums = {1, 5, 4, 2, 3};
//		MyComparator my = new MyComparator();
		Arrays.sort(nums, new MyComparator()); // 이렇게 정렬하는데 들어가는 비용치고 많다.
		System.out.println(Arrays.toString(nums));
	}

	private static void m1() {
		int[] nums = {1, 5, 3, 4, 2};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		System.out.println(nums2);
		
		Collections.sort(nums2);
		
		System.out.println(nums2);
		System.out.println();
		// 얘네가 우리가 쓰기에는 좀 모자라다. > 내림차순이 없다.
		
		Student[] list = new Student[5];
		
		// 명확한 기준이 필요하다.
		list[0] = new Student("가가가", 100, 90, 80);
		list[1] = new Student("나나나", 99, 98, 88);
		list[2] = new Student("다다다", 87, 89, 79);
		list[3] = new Student("라라라", 65, 67, 87);
		list[4] = new Student("마마마", 76, 79, 68);
		
		// Exception in thread "main" java.lang.ClassCastException: // 얘는 정렬을 안시켜준다.
		// class com.test.obj.type.Student cannot be cast to class java.lang.Comparable
		// Arrays.sort(list);
		
		
		for(int i=0 ; i<list.length-1 ; i++) {
			for(int j=0; j<list.length-1-i ; j++) {
				//if(list[j].getKor() > list[j+1].getKor()) {
				// 3개의 합 기준으로 정렬 가능하다. 
				if(list[j].getKor() + list[j].getEng() + list[j].getMath() 
						< list[j+1].getKor() +list[j+1].getEng() + list[j+1].getMath()) {
					Student temp = list[j]; // 
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	
		System.out.println(Arrays.toString(list));
	}
}
							 // 제네릭 타입이 붙는다.  
class MyComparator implements Comparator<Integer>{
	
	// 정렬할 때 비교를 담당하는 코드 
	// o1 vs o2
	// - 오름차순             // - 연산 
	// - o1크면 > 양수반환
	// - o2크면 > 음수반환
	// - 같으면 > 0반환
	
	// - 내림차순            // -를 뒤집은거
	// - o1크면 > 음수반환
	// - o2크면 > 음수반환
	// - 같으면 > 0반환
	
	// 이렇게 Integer붙으면 아래에 자동완성으로 Integer를 붙여주는구나
	@Override 
	public int compare(Integer o1, Integer o2) {
//		if(o1 > o2 ) {
//			return 1;
//		} else if(o1 < o2) {
//			return -1;
//		} else {
//			return 0;
//		}
		return o1 - o2;
	} // 정려할 배열의 요소타입을 넣어준다. 
}

class Student implements Comparable{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	

}