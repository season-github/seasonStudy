package com.season.book.other;

public class UserAction {
	/**
	 * ת��action�� chain ������ʽ����
	 * 
	 * ת��������ʹ�������൱��newһ��action ������ô�request��ȥ
	 * �ض���action  redirectAction
	 * ת��Actionʱ����request�����������ý����
	 * 
	 * ���ڿ�������Ŀ��ɾ�Ĳ飬�������ݿ�
	 * 
	 * @return
	 */
	
	/*ActionContext ac =  ActionContext.getContext();
	Map request = (Map)ac.get("request");
	request.put("msg","req1");
	Map session = (Map)ac.get("session");
	session.put("msg","session1");
	Map application = (Map)ac.get("application");
	application.put("msg","application1");*/
	
	/**
	 * �����input
	 * ���������ʹ����,ֱ�Ӳ���action,����input����,��action����Ͳ���дreturn input��
	 * 
	 * ���Կ��Դ�ֵ��������ô�request����Ϣ���ݵȲ������ԣ���request
	 * ��ת����type=redirect���ܶණ��������request����������session�ȣ� dispatch
	 * ���ֲ�дĬ��success
	 * 
	 * tuozhan:
	 * 1��action �к��� ��һ����֪����ʲô������Ŀ���Ƿֹ��������������٣���Ϊ����
	 * �򻯣�1������method�����Բ���
	 * user��login���ַ��������ز�ͬ��������ͬ��.
	 * ����ȫ����ֹ������constants ��̬���� 
	 * ��struts����дһ����ǩ
	 * 
	 * 2��ÿ��һ�������ļ���Ҫ�������������
	 * reload = true
	 * struts��domv = ����ģʽ
	 * 3��
	 * 
	 * 
	 * 
	 * ��servletAPI����
	 * �����޹�
	 * ��servletAPI���
	 * 
	 * �����ý��ʽ
	 * 
	 * 
	 * @return
	 */
}
