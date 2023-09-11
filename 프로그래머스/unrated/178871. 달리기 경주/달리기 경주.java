import java.util.*;

// hashmap에 players순서대로 이름을 key 값을 순위로 put
// callings for문 돌려서 key가 나오면 앞에 순서랑 자리 변경
// hashmap의 값을 순서에 맞춰 answer에 추가

class Solution {
    public String[] solution(String[] players, String[] callings) {
        /* 내가 푼 방법 시간 초과 뜸
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> hm = new HashMap();
        
        for(int i = 0; i < players.length; i++){
            hm.put(players[i],i);
        }
        
        for(int i = 0; i < callings.length; i++){
            for(String key : hm.keySet()){
                if(callings[i].equals(key)){
                    hm.put(key, hm.get(key)-1);
                    
                    for(String key2 : hm.keySet()){
                        if(hm.get(key2) == hm.get(key)){
                            if(!key.equals(key2)){
                                hm.put(key2, hm.get(key)+1);
                            }  
                        }
                    }
                }
            }
        }
        
        for(int j = 0; j < answer.length; j++){
            for(String key : hm.keySet()){
                if(hm.get(key) == j){
                    answer[j] = key;
                }
            }
        }
        
        return answer;
        */

        // 다른 사람 풀이 : 배열 내 위치를 계속해서 저장할 수 있는 map 생성
        Map<String, Integer> rankMap = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            rankMap.put(players[i], i);
        }
        
        // callings배열 돌면서 자리 변경
        for(String a : callings){
            // 등수를 nowRank에 저장
            int nowRank = rankMap.get(a);
            // 앞등수 사람을 beforeP에 저장
            String beforeP = players[nowRank-1];
            
            // 자리 변경
            players[nowRank-1] = a;
            players[nowRank] = beforeP;
            
            // rankMap값 변경
            rankMap.put(a, nowRank-1);
            rankMap.put(beforeP, nowRank);
        } 
        return players;
    }
}