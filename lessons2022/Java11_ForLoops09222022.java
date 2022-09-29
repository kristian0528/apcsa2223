package lessons2022;

public class Java11_ForLoops09222022 {
    public static void main(String[] args) {
        // Loop
        /* Loops allow you to execute commands as many times as you need
           There are three types - For, While, Do while
         */

        //For loops
        //increases one by one
        for(int i=0 ; i<10 ; i++){
            //System.out.println(i);
        }
        //decreases one by one
        for(int i=10 ; i>0 ; i--){
            //System.out.println(i);
        }
        //Increases by 2 instead of one
        for(int i = 2 ; i<=6 ; i+=2){
            //System.out.println(i);
        }
        //print hello world 100 times
        for(int i = 0 ; i<=100 ; i++){
            //System.out.println("Hello world");
        }
        //Task 1 print odd numbers until 100
        for(int i = 1 ; i<=1000 ; i+=2){
            //System.out.println(i);
        }
        //Task 2 print even numbers until 1000
        for(int i = 10 ; i<=40 ; i+=2){
            //System.out.println(i);
        }
        //Task 3 print the number divided by 5, from 0-100
        for(int i = 0 ; i<=100 ; i+=5){
            //System.out.println(i);
        }
        //Task 4 print numbers divisible by 5 and 3, from 0-100 use i++ in loop
        for(int i = 3 ; i<=100 ; i++){
            if(i%3==0||i%5==0){
                //System.out.println(i);
            }
        }

        //Nested loop
        //is a loop within the another loop

        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j>10 ; j++){
                System.out.println("When i="+i+" j="+j);
            }
        }

        for(int i = 0, j = 6 ; i<100 && j<100 ; i++,j++){
            System.out.println("i= "+i+", j= "+j);
        }

        //infinitive loop
        //if you want something to run forever
        for(int i = 0 ; true ; i++){
            System.out.println("yellow world"+" iteration number "+i);
        }

    }
}
