package org.java.controller;

import java.util.Scanner;

import org.java.commend.DeleteCommend;
import org.java.commend.ExcuteCommend;
import org.java.commend.InsertCommend;
import org.java.commend.SelectCommend;
import org.java.commend.UpdateCommend;

public class MemberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExcuteCommend commend;
		
		while(true) {
			System.out.println("쿼리문을 입력하세요 (insert, select, update, delete) 종료: exit");
			String query = scn.next();
			if(query.equals("insert")) {
				commend = new InsertCommend();
				commend.excuteQuery();
			} else if(query.equals("select")) {
				commend = new SelectCommend();
				commend.excuteQuery();
			} else if(query.equals("update")) {
				commend = new UpdateCommend();
				commend.excuteQuery();
			} else if(query.equals("delete")) {
				commend = new DeleteCommend();
				commend.excuteQuery();
			} else if(query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("쿼리문 입력 오류");
			}
		}
		
		scn.close();
	}
}
