public class main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for(int i = 1; i < 100; i++){

        String message = "";

        if(i%3==0){
        message+="Fizz";
        }

        if(i%5==0){
        message+="Buzz";
        }

        if(i%7==0){
        message+="Woof";
        }

        if(message.length() == 0){
        message = Integer.toString(i);
        }

        System.out.println(message);

        }
    }
}