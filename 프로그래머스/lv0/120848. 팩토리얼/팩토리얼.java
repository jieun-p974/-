class Solution {
    public int fac(int i){
        return (i <= 1) ? i : fac(i-1)*i;
    }
    
    public int solution(int n) {
        // 팩토리얼이 n보다 작거나 같은 선에서 최대인 값으로 만들어야함
        int answer = 0;
        
        for(int i = 0; i <= 10; i++){
            if(fac(i) <= n){
                answer = i;
            }
        }
        
        
        return answer;
    }
}