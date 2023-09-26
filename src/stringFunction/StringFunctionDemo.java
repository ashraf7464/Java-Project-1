package stringFunction;

import java.util.Locale;

public class StringFunctionDemo {


    public static void stringPractice(){

        String name = "Upright";
        String git = "Code from Macbook";
        String git2 = "Code from Windows";
        

        int lengthOfMyString = name.length();
        System.out.println(lengthOfMyString);
    }


    public static void changeCase(){
        String name = "Upright";
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

    }
    public static void splitString(){

        String schoolName = "Upright Tech Solution";
        System.out.println(schoolName);
        System.out.println("--------------");
        String [] arrayOfSchoolName = schoolName.split(" ");

        String a = arrayOfSchoolName[0];
        String b = arrayOfSchoolName[1];
        String c = arrayOfSchoolName[2];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String [] arrayOfSchoolName1 = schoolName.split(" ", 2);
        System.out.println("--------------------");

        String x = arrayOfSchoolName1[0];
        String y = arrayOfSchoolName1[1];

        System.out.println(x);
        System.out.println(y);
    }

    public static void stringToInt(){

        String money = "50";
        System.out.println(money+100);
        int money1 = Integer.parseInt(money);
        System.out.println(money1+100);

    }

   public static void intToString(){

        int money = 200;
        System.out.println(money);
        String money1 = String.valueOf(money);
        System.out.println(money1);
        System.out.println(200+money1);
   }

   public static void stringBufferDemo(){

        StringBuffer sb = new StringBuffer("Ashraf");//reverse, append, replace, insert, delete
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        sb.append(" Siddique");
        System.out.println(sb);

        sb.replace(0,6, "Mahbub");
        System.out.println(sb);

        sb.insert(7,6);
        System.out.println(sb);

        sb.delete(0,8);
        System.out.println(sb);
   }

   public static void reverseStringWithLoop(){

        String str = "Hellow World";
        String reverse = "";
        for(int i=str.length()-1;i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
       System.out.println("Reverse String is: "+reverse);
   }

   public static void subString(){

        String title = "Keya is presenting";
        String newTitle = title.substring(0,4); //+1
        System.out.println(newTitle);
        //return newTitle;
        if(newTitle.contains("Keya")){
            System.out.println("This conatins Keya");
        }
        else{
            System.out.println("This doesn't contain Keya");
        }
        //another way to validate
        if(newTitle.equalsIgnoreCase("Keya")){
            System.out.println("We are good");
        }
        else{
            System.out.println("Please check the String");
        }
   }

   public static void concatenationOfString(){

        String a = "Keya is in";
        String b = " the Batch 6";
        String c = a.concat(b);
        System.out.println(c);

        
   }

   public static void replaceDemo(){
        String email = "uprighttechsolution_gmail.com";
        String newEmail = email.replace("_","@");
        System.out.println(newEmail);

   }

   public static void reverse(){
        String schoolName = "UprightTechSolution";

        for( int i = schoolName.length()-1; i>=0; i--){
            System.out.print(schoolName.charAt(i));
       }
   }

   public static void palindromeDemo(){
        String str = "madam";
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }

   }

   public static void homework1(){
        String email = "uprighttechsolution@gmail.com";

        if(email.contains("@")){
            System.out.println("It is OK");
        }
        else{
            System.out.println("It is not OK");
        }
   }

   public static void homework2(){

        String name = "my name is ashraf";
        String [] splitWords = name.split(" ");

//        System.out.println(splitWords[0]);
//        System.out.println(splitWords[1]);
//        System.out.println(splitWords[2]);
//        System.out.println(splitWords[3]);

       for(String words:splitWords){
           String firstLetter = words.substring(0,1).toUpperCase();
           String remainingLetters = words.substring(1);
           String convertedWord = firstLetter+remainingLetters+" ";
           System.out.print(convertedWord);
       }



   }


    public static void main(String[] args) {
        //stringPractice();
        //changeCase();
        //splitString();
        //stringToInt();
        //intToString();
        //stringBufferDemo();
        //reverseStringWithLoop();
        //subString();
        //concatenationOfString();
        //replaceDemo();
        //reverse();
        //palindromeDemo();
        //homework1();
        homework2();
    }
}


