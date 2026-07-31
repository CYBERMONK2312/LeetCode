class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int count = 0, sum = 0;
        
        if(map.size() <= 8) return word.length();
        else{
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
            for (Map.Entry<Character, Integer> entry : list) {
                sum+= entry.getValue()*(count/8 + 1);
                count++;
            }
        }

        System.out.print(map.size());
        return sum;
    }
}