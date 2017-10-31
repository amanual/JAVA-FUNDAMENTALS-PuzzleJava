import java.util.*;
public class PuzzleJava{
//Print the sum of all numbers in the array
    public ArrayList<Integer> printSum(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList<Integer> newMyArray = new ArrayList<Integer>();        
        myArray.add(3);
        myArray.add(5);
        myArray.add(1);
        myArray.add(2);
        myArray.add(7);
        myArray.add(9);
        myArray.add(8);
        myArray.add(13);
        myArray.add(25);
        myArray.add(32);
        int sum = 0;
        for (int i = 0; i < myArray.size(); i++){
            sum += myArray.get(i);
            if( myArray.get(i) > 10){
                newMyArray.add(myArray.get(i));
            }            
        }
        System.out.println(sum);
        System.out.println(newMyArray);
        return newMyArray;
    }
//Shuffle the array and print and return an array with names that are longer than 5 characters
    public ArrayList<String> shuffleArray(){
        ArrayList<String> myArray = new ArrayList<String>();  
        ArrayList<String> newArray = new ArrayList<String>();      
        myArray.add("Nancy");
        myArray.add("Jinichi");
        myArray.add("Fujibayashi");
        myArray.add("Momochi");
        myArray.add("Ishikawa");

        Collections.shuffle(myArray);
        System.out.println("All list" + myArray);
        for(int i = 0; i < myArray.size(); i++){
            if(myArray.indexOf(myArray.get(i)) > 5){
                newArray.add(myArray.get(i));
            System.out.println("Longer than 5 characters:" + newArray);
            }
        }
        return myArray;
    }
// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
    public ArrayList<String> getAlphabet(){
        ArrayList<String> myArray = new ArrayList<String>();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for( int i = 0; i < alpha.length(); i++){
            myArray.add(Character.toString(alpha.charAt(i)));                       
        }
        Collections.shuffle(myArray);
        String lastLetter = myArray.get(myArray.size()-1);
        String firstLatter = myArray.get(0);
        System.out.println(myArray);
        System.out.println("First letter: " + firstLatter + "\nLast letter: " + lastLetter); 
        return myArray;
    }
    // Generate and return an array with 10 random numbers between 55-100.
    public int[] randomArray(){
        int[] array = new int[10];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){            
            int x = rand.nextInt(45) + 55;
            array[i] = x;
        }
        System.out.println("Array of 10 random numbers b/n 55-100: " + Arrays.toString(array));
        return array;
    }
// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
     public int[] sortedRandomArray(){        
        int[] array2 = new int[2];        
        int[] array = randomArray();
        Arrays.sort(array);
        array2[0] = array[0];
        array2[1]= array[array.length -1];
        
        System.out.println("Array of 10 random numbers b/n 55-100: " + Arrays.toString(array));        
        System.out.println("min and max: " + Arrays.toString(array2));
        
        return array;
    }
// Create a random string that is 5 characters long.
    public String randomString(){
        String word = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 5; i++){
            Random random = new Random();
            int x = random.nextInt(25) + 1;
            word += alpha.charAt(x);
        }
        System.out.println(word);
        return word;
    }
// Generate an array with 10 random strings that are each 5 characters long
    public void randomFiveString(){
        ArrayList<String> array = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            String x = randomString();
            array.add(x);
        }
        System.out.println(array);
    }
}