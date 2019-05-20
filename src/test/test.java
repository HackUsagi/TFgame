package test;

import java.io.IOException;

public class Key {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	       int  i;
	       System.out.println( "問題1");
	       System.out.print( "リンゴは英語でAppleである:");
	       try{
	           i = System.in.read();
	           
	           //正解
	           if (i==84 || i==116) {
	        	   System.out.println("正解");
	           }
	           
	           //不正解
	           if (i==70 || i==102) {
	        	   System.out.println("不正解");
	           }
	           
	       }
	       catch(IOException e){
	           System.err.println( "入力エラー" );
	       }
	}

}
