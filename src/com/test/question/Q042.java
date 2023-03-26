package com.test.question;

public class Q042 {

	public static void main(String[] args) {
		// 요구사항] 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		// 서기 1년 1월 1일은 월요일이다. 월~일의 순환은 계속
		// 조건
		// - Calendar 클래스 사용 금지
		// 2023년 2월 10일
		int result = 0;

		// 오늘 날짜 입력
		int year = 2023, month = 2, day = 10;

		final int MONTH_CNT[] = { // 0 : dummy element
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		final String[] DAY_OF_WEEK_STRING = { "일", "월", "화", "수", "목", "금", "토" };

		for (int i = 1; i <= year - 1; i++) {
			if (checkYear(i)) {
				result += 366;
			} else
				result += 365;
		}
		// 전해까지의 요일수
		// 올해 계산
		boolean isLeap = checkYear(year);

		for (int i = 1; i < month; i++) {
			result += MONTH_CNT[i];
		}

		if (isLeap && (month > 2)) { // 윤년고 현재 달이 3월이상이면 +1일 추가
			result += 1;
		}

		// 1년 1월 1일 -> 월
		// 1년 1월 2일 -> 화
		// 1년 1월 3일 -> 수
		// 1년 1월 4일 -> 목
		// 1년 1월 5일 -> 금
		// 1년 1월 6일 -> 토
		// 1년 1월 7일 -> 일
		result += day;
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다.\n", year, month, day, result,
				DAY_OF_WEEK_STRING[result % 7]);

	}

	private static boolean checkYear(int year) {
		boolean result;
		// Depth 지정해서 알고리즘 구분 > Indentation
		// a.
		if (year % 4 == 0) {
			// b.
			if (year % 100 == 0) {
				// c
				if (year % 400 == 0) {
					// 윤년 > 끝
					result = true;
				} else {
					// 평년 > 끝
					result = false;
				}
			} else {
				// "윤년" > 끝
				result = true;
			}

		} else {
			// "평년" > 끝
			result = false;
		}
		return result;
	}

}
