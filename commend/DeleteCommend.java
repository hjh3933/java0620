package org.java.commend;

import org.java.dao.MemberDao;

public class DeleteCommend implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ��Ż��");
		MemberDao dao = new MemberDao();
		dao.deleteDo();
	}

}
