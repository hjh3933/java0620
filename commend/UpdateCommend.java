package org.java.commend;

import org.java.dao.MemberDao;

public class UpdateCommend implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원수정");
		MemberDao dao = new MemberDao();
		dao.updateDo();
	}

}
