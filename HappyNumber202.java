class Solution {
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<Integer>();
        while(!set.contains(n) && n != 1) {
            set.add(n);
            n = sum(n);
        }
        return n == 1;
    }
    
    public int sum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
