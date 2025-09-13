public class recursion {
    static int count=0;
    public static void recurse(){
    if(count==4) return;
    System.out.println(count);
    count++;
    recurse();
    }
    public static void main(String[] args) {
        recurse();
    }
}