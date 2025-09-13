public class recursion {
    static int count=0; // global variable
    public static void recurse(){
    if(count==4) return; //base condition
    System.out.println(count);
    count++;
    recurse(); // function calls itself
    }
    public static void main(String[] args) {
        recurse();
    }
}