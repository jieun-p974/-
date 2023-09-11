class Solution {
    public int[] solution(String[] park, String[] routes) {
        int sx = 0;
        int sy = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        // park를 하나씩 잘라서 2차원 배열 arr에 추가
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            
            // 시작점이 있는 줄일 경우 해당 행과 열을 sy와 sx에 추가
            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }
    
        // routes 배열을 하나씩 돌면서
        for(String st : routes){
            // way에는 방향을 저장, len에는 가야하는 거리를 저장
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            
            int nx = sx;
            int ny = sy;
            
            // 가야하는 거리만큼 nx 또는 ny에 한 칸씩 추가/삭제
            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                // 연산 도중 nx또는 ny가 여유가 있는 상태에서 X를 만나면 연산을 중단, 범위 내면서 장애물을 만나지 않는다면 sx = nx, sy = ny
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                    
                    if(i == len-1){
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }       
        // 최종적으로 산출된 sy와 sx의 값을 answer 배열에 추가하고 출력
        int[] answer = {sy, sx};
        return answer;
    }
}