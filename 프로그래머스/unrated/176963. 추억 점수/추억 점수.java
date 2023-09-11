class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int res = 0;
        // photo 배열을 돌면서 name과 값을 비교하고 더하기
        for(int i = 0; i < photo.length ;i++){
            System.out.println("di");
            for(int j = 0; j <photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        res += yearning[k];
                    }
                }
            }
            answer[i] = res;
            res = 0;
        }
        
        return answer;
    }
}