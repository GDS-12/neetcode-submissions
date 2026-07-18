class Solution {

    public String encode(List<String> strs) {
        String str="";
        int n = strs.size();
        for(int i=0; i<n; i++){
            str+=strs.get(i);
            str+="é";
        }
        return str;
    }

    public List<String> decode(String str) {
        int n = str.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='é') count++;
        }
        List<String> strs = new ArrayList<>();
        String st="";
        for(char s : str.toCharArray()){
            if(s!='é') st += s;
            else{
                strs.add(st);
                st="";
            }
        }
        return strs;
    }
}
