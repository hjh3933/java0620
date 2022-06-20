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
			System.out.println("�������� �Է��ϼ��� (insert, select, update, delete) ����: exit");
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
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("������ �Է� ����");
			}
		}
		
		scn.close();
	}
}
