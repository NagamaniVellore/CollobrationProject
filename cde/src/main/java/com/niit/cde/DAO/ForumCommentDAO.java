package com.niit.cde.DAO;
import java.awt.List;

import com.niit.cde.Model.ForumComment;

public interface ForumCommentDAO {
	public Boolean AddForumComment(ForumComment forumcomment);
	public Boolean DeleteForumComment(ForumComment forumcomment);
	public Boolean UpdateForumComment(ForumComment forumcomment);
	public ForumComment getBlog(int CommentId);
}
