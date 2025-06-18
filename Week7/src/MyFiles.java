import java.io.File;

public class MyFiles {
    public static void main(String[] args){
        File dir = new File("NewFolder");

        if(dir.exists()){
            System.out.println("Yippy skippy, we have a directory!");
        }else {
            System.out.println("We are lost in space, don't know where that directory is.");
        }
    }
}
