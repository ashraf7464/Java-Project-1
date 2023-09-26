package controlFlowStatements;

public class Loop {

    public static void whileLoop(int initialize, int limit) {

        // i. While Loop ii. For Loop, iii. Do-While

        int a = initialize;
        while (initialize <= limit) {
            System.out.println("Value of a is: " + initialize);
            initialize++;
        }
    }

    public static void forLoop() {

        for(int i=5; i>=1; i--){
            System.out.println("The value of i is: "+i);
        }
    }

    public static void doWhileLoop(){   //it will execute first time before checking conditions

        int y = 5;
        do{
            System.out.println("The value of y :"+y);
            y++;
        }
        while (y<=10);
    }

    public static void fibonacci(){
        int n = 10;
        int a1 = 0;
        int a2 = 1;

        System.out.println(a1);
        for(int i=1; i<=n; i++){

            int sum = a1+a2;
            a1=a2;
            a2=sum;
            System.out.println(sum);
        }
    }



    public static void pyramidShape(){

        int rows = 10;

        for(int i=1; i<=rows; i++){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reversePyramidShape(){

        int rows = 1;

        for(int i=10; i>=rows; i--){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //whileLoop(1, 10);
        //forLoop();
        //doWhileLoop();
        //fibonacci();
        //pyramidShape();
        reversePyramidShape();
    }


    
}