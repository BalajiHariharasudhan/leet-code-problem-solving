/*
Leetcode:Greatest English Letter in Upper and Lower Case
  */
class Solution {
    public String greatestLetter(String s) {
        ArrayList<Character>liu=new ArrayList<>();
        ArrayList<Character>lil=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                liu.add(ch);
            }
            else{
                lil.add(ch);
            }
        }
        char[] arr=new char[liu.size()];
        for(int i=0;i<liu.size();i++){
            arr[i]=liu.get(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            char c=Character.toLowerCase(arr[i]);
            if(lil.contains(c)){
                String str=String.valueOf(Character.toUpperCase(arr[i]));
                System.out.print(str);
                return str;
            }

        }
        return "";
    }
}
