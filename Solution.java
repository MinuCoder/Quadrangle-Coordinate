/**
 * Created by 민우 on 2017-07-20.
 */
class Solution {
    public int[] solution(int[][] v) {
        int[] answer = {};
        int x=0;
        int y=0;

        for (int i=0; i<2; i++){
            for (int j=1; j<3; j++) {
                if (v[i][0] / v[j][0]!=1){
                    x=v[j][0];
                }
                if (v[0][i] / v[0][j]!=1){
                    y=v[0][j];
                }
            }
        }
        answer= new int[]{x, y};
        return answer;
    }
    public static void main(String args[]){
        Solution s1 = new Solution();

        s1.solution(new int[][]{{1,4},{3,4},{3,10}});
        s1.solution(new int[][]{{1,1},{2,2},{1,2}});
    }
}