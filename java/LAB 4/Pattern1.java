public class Pattern1{
    public static void main(String[] args){
        String str="stream";
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
            System.out.print(""+str.charAt(j));
        }
        System.out.println("");
        }
    }
}