public class BoolToString {
    public static void main(String[] args) {
        boolean boolValue = false;
        String strValue = "";

        for (int i = 0; i < 1; i++) { 
            if (boolValue) {
                strValue = "true";}
            else {
                strValue = "false";
            
            }
        }
        System.out.println(strValue);

}
}