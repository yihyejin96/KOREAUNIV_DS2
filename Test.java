import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test{
    public static void main(String[] args) throws IOException{
    	File dir = new File("./input/"); 
		File[] fileList = dir.listFiles(); 

		for(int i = 0 ; i < fileList.length ; i++){
			File file = fileList[i]; 
			if(file.isFile()){
				System.out.println("filename : " + file.getName());
			BufferedReader br = new BufferedReader(new FileReader(fileList[i]));
	    	RedBlackTree rbt = new RedBlackTree();
	    	while(true) {
	    		String line = br.readLine();
	    		int linenum = Integer.parseInt(line);
	    		if (linenum > 0) {
	    			rbt.testinsert(linenum);
	    		}
	    		else if (linenum < 0) {
	    			linenum = linenum * -1;
	    			rbt.testdelete(linenum);
	    		}
	    		else if (linenum == 0 || line==null) {
	    			System.out.print("total : " + rbt.nodecount + "\n");
	    			System.out.print("insert : " + rbt.insertcount + "\n");
	    			System.out.print("delete : " + rbt.deletecount + "\n");
	    			System.out.print("miss : " + rbt.deletemiss + "\n");
	    			System.out.print("nb : " + rbt.blackcount()+ "\n");
	    			System.out.print("bh : " + rbt.heightblack()+ "\n");
	    			rbt.inorder();
	    			break;
	    		}
	    	}
	    	br.close();
		}}

    	
    	
        
    }
    
   
    }
    





/*
public class Test{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    	RedBlackTree rbt = new RedBlackTree();
    	while(true) {
    		String line = br.readLine();
    		int linenum = Integer.parseInt(line);
    		if (linenum > 0) {
    			rbt.testinsert(linenum);
    		}
    		else if (linenum < 0) {
    			linenum = linenum * -1;
    			rbt.testdelete(linenum);
    		}
    		else if (linenum == 0 || line==null) {
    			System.out.print("total : " + rbt.nodecount + "\n");
    			System.out.print("insert : " + rbt.insertcount + "\n");
    			System.out.print("delete : " + rbt.deletecount + "\n");
    			System.out.print("miss : " + rbt.deletemiss + "\n");
    			System.out.print("nb : " + rbt.blackcount()+ "\n");
    			System.out.print("bh : " + rbt.heightblack()+ "\n");
    			rbt.inorder();
    			break;
    		}
    	}
    	br.close();
    	
        
    }
    
   
}
    */