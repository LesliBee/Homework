package Class13Homework;

public class Task4 {
    public static void main(String[] args) {
       // 4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

       /* StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());//this reverse method is only available for the StringBuilder
        String str=st.toString();//converting a StringBuilder to String so that we can call methods from String */

      String str="This is the sentence i want to reverse";
       String [] arr=str.split(" ");
       /* for(String word:arr){
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
          System.out.print(" ");
        for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");

            ^^This was a code so I can understand
        */
            for (String word:arr){
                System.out.print(new StringBuilder(word).reverse()+" "); //This is the BEST code to use

    }
}}
