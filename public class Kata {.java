public class Kata {
    public static String noSpace (String input){
      String output = "";
      // l o k e s h
      char[] charArr = input.toCharArray();
       for (char c:charArr){ 
              if (c != ' '){
                output=output+c;
              }
           }
      return output;
         }
      }



   