package com.lee.test;

import com.lei.entity.Book;
import com.lei.entity.BookShelf;
import com.lei.entity.Loan;
import com.lei.entity.Member;

public class LoanTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//模拟书籍信息
		Book book1 = new Book("李白","山水田园诗","1-1","望庐山瀑布");
		Book book2 = new Book("李白", "友情诗", "1-2", "赠汪伦");
		Book book3 = new Book("杜甫","山水田园诗","2-1","登高");
		Book book4 = new Book("杜甫", "友情诗", "2-2", "客至");
		
		//创建人
		Member member = new Member("雷祥");
		
		//创建书架，作者为李白，类别为友情诗的书架
		BookShelf shelf = new BookShelf("李白","友情诗");
		//把四本书籍分别都放书架，匹配成功则进入书架，不成功则无法放入
		shelf.addBook(book1);
		shelf.addBook(book2);
		shelf.addBook(book3);
		shelf.addBook(book4);
		
		//人取出书架中的第一本书
		Book result = shelf.getBooks().get(0);
		if(result != null){
			//此人借出该书
			Loan loan = member.loan(result);
			//如果此书借出
			if(loan != null){
				System.out.println("借书成功 \n"+loan.toString());
			}
		}
		//模拟看书
		Thread.currentThread().sleep(2000);
		
		//此人还书
		member.Return(book2);
		
		//打印此人对这本书籍的借阅信息
		System.out.println("还书成功 \n"+member.findCourrentLoanFor(book2).toString());
		
	}

}
