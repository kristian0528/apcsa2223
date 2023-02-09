package warmUps;

public class WarmUp11292022 {
    public static void main(String[] args) {
        String[] names = {"Kris","Trent","Alex","Nathaniel","Ethan"};
        String[] dobs = {"1/1/2000","2/2/2000","3/3/2000","4/4/2000","5/5/2000"};

        for(int i = 0; i<names.length; i+=1){
            System.out.println(names[i]+" born in "+dobs[i]);
        }
    }
}
