package org.java.commend;

import org.java.dao.MemberDao;

public class SelectCommend implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ����ȸ");
		MemberDao dao = new MemberDao();
		dao.selectDo();
	}

}
