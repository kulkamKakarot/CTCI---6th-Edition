public class coins {

    public static int make_change(int amount, int[] denoms,int index, int[][] map) {
        if(map[amount][index] > 0) return map[amount][index];

        if(index >= denoms.length - 1) return 1;

        int denom_amount = denoms[index];
        int ways = 0;
        for(int i = 0; i*denom_amount <= amount; i++){
            int amount_remaining = amount-i*denom_amount;
            ways += make_change(amount_remaining, denoms, index+1, map);
        }
        map[amount][index] = ways;
        return ways;
    }

    public static int no_of_ways(int n) {
        int[] denoms = {25,10,5,1};
        int[][] map = new int[n+1][denoms.length];
        return make_change(n,denoms,0,map);
    }
    public static void main(String[] args) {
        int n = no_of_ways(25);
        System.out.println(n);
    }
}