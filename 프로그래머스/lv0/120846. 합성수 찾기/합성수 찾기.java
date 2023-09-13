class Solution {
    public int getCount(int s){
        int count = 0; // 약수의 개수
        
        for(int i =1; i <= s; i++){
            if(s % i == 0) count++;
        }
        
        return count;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        // 약수 개수가 3개 이상이면 합성수
        // n이 매개변수로 주어질때 n이하의 합성수 개수를 return
        for(int i = 0; i <= n; i++){
            if(getCount(i) >= 3) answer++;
        }
        
        return answer;
    }
}