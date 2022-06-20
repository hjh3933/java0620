package org.java.commend;

import org.java.dao.MemberDao;

public class InsertCommend implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원가입");
		MemberDao dao = new MemberDao();
		dao.insertDo();
	}

}
