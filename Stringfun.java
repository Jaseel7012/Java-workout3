public class Stringfun {
    public static void main(String[] args) {
        String f="fun";
        for (int i=0;i<f.length();i++){
            for (int j=i+1;j<f.length()+1;j++){
                System.out.println(f.substring(i,j));
            }
        }
    }
}
