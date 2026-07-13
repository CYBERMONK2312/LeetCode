class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        int n = str.length();
        for(int size=2; size<=n; size++){
            for(int j=0 ; j<=n-size; j++){
                String temp = str.substring(j, j+size);
                if(Integer.parseInt(temp) >= low && Integer.parseInt(temp) <= high){
                    list.add(Integer.parseInt(temp));
                }
            }
        }
        return list;
    }    
}