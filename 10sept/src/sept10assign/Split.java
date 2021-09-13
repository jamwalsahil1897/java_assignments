package sept10assign;

public class Split {
	public static void main(String args[]) {
        String string = "sahil,jamwal";
        String[] arrayOfString= string.split("," );
  
        for (String array :arrayOfString )
            System.out.println(array);
    }

}
