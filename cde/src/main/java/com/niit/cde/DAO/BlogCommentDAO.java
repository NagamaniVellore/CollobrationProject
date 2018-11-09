package com.niit.cde.DAO;
import com.niit.cde.Model.Blog;
import com.niit.cde.Model.BlogComment;

public interface BlogCommentDAO {
	public Boolean AddBlogComment(BlogComment blogcomment);
	public Boolean DeleteBlogComment(BlogComment blogcomment);
	public Boolean UpdateBlogComment(BlogComment blogcomment);
	public Blog getBlog(int BlogId);

}
