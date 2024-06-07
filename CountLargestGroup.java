class CountLargestGroup {
    public int countDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,Integer> temp = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int a = countDigits(i);
            temp.put(a, temp.getOrDefault(a,0)+1);
            max = Math.max(max, temp.get(a));
        }
        int out = 0;
        for(int val : temp.values()){
            if(val==max){
                out++;
            }
        }
        return out;
    }
}
