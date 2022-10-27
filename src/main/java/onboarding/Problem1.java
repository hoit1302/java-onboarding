package onboarding;

import java.util.List;

/**
 * 기능 목록
 * 1. 책 페이지가 유효하게 입력되었는지 확인하는 함수
 * 2. 한 사람의 가장 큰 점수를 계산하는 함수
 * 3. 승자 결과를 반환하는 함수
 * 4. 1-3의 기능을 활용해 문제에서 원하는 출력을 리턴하는 함수
 */
class Problem1 {
    static final int BOOK_START = 1;
    static final int BOOK_END = 400;

    static Boolean isValid(List<Integer> list) {
        int front = list.get(0);
        int back = list.get(1);
        if (front != back - 1) {
            return false;
        }
        return (BOOK_START < front) && (back < BOOK_END);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}