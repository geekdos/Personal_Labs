package pfe.android;

import java.util.*;

class scorify{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in).useDelimiter("\\n");
		int t = Integer.parseInt(in.nextLine());
		for(int i = 0; i < t; i++){
		    String[] s = in.nextLine().split("");
		    String sp = "";
		    for (int j = 0; j < s.length ;j++){
		    	sp += "\\"+s[j];
		    }

		    int L = Integer.parseInt(in.nextLine());
		    for (int j = 0; j < L ;j++){
		        int counter = j + 1;
		        System.out.print("Line "+ counter +" :\n");
		        String data = in.nextLine();
		        String[] values = data.split(""+sp);
		        for(String str : values){
		            if(!str.equals("")){
                        System.out.println(str);
                    }else{
                        System.out.println("NULL");
                    }
		        }
		    }
		}
	}
}