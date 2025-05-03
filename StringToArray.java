public class StringToArray {

    public static void main(String[] args) {
     String s= "robin hood uncle";
      int lengthOfStringArr = 1;
      char[] charArr = s.toCharArray();
      for (char c:charArr){
        if(c == ' '){
          lengthOfStringArr++;
        }
      }
      String[] stringArr = new String[lengthOfStringArr];
         String temp="";
        int wordCount=0;
       for (char c:charArr){
        
        if(c == ' '){
            stringArr[wordCount]=temp;
            wordCount++;
            temp="";
        }else{
          temp = temp+c;
        }
      } 
      stringArr[wordCount] = temp;
      for (String d : stringArr) {
        System.out.println(d);
      }
    }

}
