package org.java.commend;

import org.java.dao.MemberDao;

public class DeleteCommend implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("È¸¿øÅ»Åð");
		MemberDao dao = new MemberDao();
		dao.deleteDo();
	}

}
