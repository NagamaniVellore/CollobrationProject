package com.niit.cde.DAOImpl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.cde.DAO.BlogDAO;
import com.niit.cde.Model.Blog;

import junit.framework.TestCase;


public class BlogTestcase extends TestCase {
	@Autowired
	BlogDAO blogDAO;

	@Autowired
	Blog blog;

	AnnotationConfigApplicationContext context;

		@Before
		public void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		blogDAO = (BlogDAO) context.getBean("blogDAO");
		blog = (Blog) context.getBean("blog");
		}
	/*@Test

	public void categoryListTestCase()
	{

		List<Blog> list = (List<Blog>) blogDAO.listBlog();
		int rowCount = list.size();
		
		assertEquals("Blog List Test Case",rowCount,4);
		
	}

	@Test
	public void deleteTestCaseBlog()
	{
	blog.setId(001);
	boolean flag = blogDAO.DeleteBlog(blog);
	 assertEquals("deleteBlogTestCase",  flag, false);
		
	}*/

	@Test
	public void addBlogTestCase()
	{
		blog.setId(5001);
		blog.setName("samsung");
		blog.setDesc("This is samsung phone ");
		blogDAO.UpdateBlog(blog);
		boolean flag=blogDAO.AddBlog(blog);
		assertTrue(true);
		
	}

	/*@Test
	public void updateBlogTestCase()
	{
		blog.setId(6001);
		blog.setName("samsung");
		assertTrue(true);
		
	}

	@Test
	public void listBlogTestCase()
	{
		assertEquals("addProductTestCase",blogDAO.listBlog().size(), 4);
	}
	@Test
	public void getBlogTestCase()
	{
		assertEquals("updateProductTestCase",blogDAO.getBlog(001), null);
	}
*/


	}



