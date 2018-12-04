package com.jinan.www.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.jinan.www.dao.AccountDao;

public class AccountServiceImpl implements AccountService {

	private AccountDao ad;
	private TransactionTemplate tt;
	
	
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		// TODO Auto-generated method stub
		//��Ǯ
		ad.decreaseMoney(from, money);
	
		//ģ���쳣
		int i=1/0;
		
		//��Ǯ
		ad.increaseMoney(to, money);
	}
	/*
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		
		tt.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				//��Ǯ
				ad.decreaseMoney(from, money);
			
				//ģ���쳣
//				int i=1/0;
				
				//��Ǯ
				ad.increaseMoney(to, money);
			}
		});
		//1.������
		//2.����doInTransactionWithoutResult����
		//3.�ύ����
	}*/

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}
	
	

}