class Solution {
    public String solution(String new_id) {
        //대문자를 소문자로 치환
        String answer = new_id.toLowerCase();

        //허용되지 않는 문자 제거 (알파벳 소문자, 숫자, -, _, .만 남김)
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        //마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("\\.{2,}", ".");

        //마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");

        //빈 문자열이라면 "a"를 대입
        if (answer.isEmpty()) {
            answer = "a";
        }

        //길이가 16자 이상이면, 첫 15자만 남기고 나머지 제거
        //제거 후 마침표가 끝에 위치한다면 마침표도 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            // 끝에 마침표 제거
            answer = answer.replaceAll("\\.$", "");
        }

        //길이가 2자 이하라면 마지막 문자를 반복해서 
        //길이가 3이 될 때까지 붙이기
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
