package com.season.book.other;

public class Test {
	/**
	 * struts2��һ����ܣ������ܺܺõĽ���˺ܶ�����
	 * ��Ҫ����6������������myeclipse�����Դ���
	 * ��Ҫ���õ���struts.xml�ļ���
	 * ��һ��xml�ļ�һ����һ��һ����
	 * struts package action result
	 * action �� name��form�ύ��
	 * 			class�Ƕ�Ӧ��action   ����+����
	 * 			method��Ӧ�� ���еķ���
	 * result�� ��Ӧ action�෵�ص��ַ�����
	 * 			����name�Ƿ��ص��ַ�������ǩ�����Ƕ�Ӧ����תҳ��
	 */
	
	/**
	 * 
	 * close �������Ŀ
	 * 
	 * web.xml
	 * struts.xml
	 * package ��
	 * namespace���з��ʵ�ַ��ǰ׺��ͷ 
	 * extends �̳�
	 * action �Ű���
	 * ���ñ�ǩ
	 * ���������й�
	 * 
	 * ע�������ĵ���������д���ã�ע��淶��д�������ĵ���ʹ��������ֻ�����Լ����棬��ȥ�ܺõ�д�����ĵ���д�����һ�㣩
	 * ��sturts˵����д��
	 * 
	 * ��ͼ��Ӱ���ַ
	 * 
	 * �Ű������Ҫ
	 * 
	 * ������1�ֹ�����
	 * struts2 core 	ռȫ��50%
	 * xwork������webwork�����ģ���struts1û��ϵ��
	 * ���ʽ	ognl(��el��̫��������֮������������struts��ǩ��)
	 * freemarkerʶͼ��
	 * Commons-fileuploads
	 * Commons-io
	 * Commons-logging
	 * ��Щ�͹���
	 * �ֹ�������web.xml�м��������
	 * 
	 * 2��myeclipse project ....ѡ��/*��struts1  ��do��
	 * 
	 * fielterdispatcher
	 * ig.filter �°汾������������
	 * 
	 * 1����д�Ķ�д��
	 * ÿдһ��ʵ�������������л�Serializable( interface )
	 * ����дgetset��������Ϊstruts��ȡ�����ݣ���ȡ��action������ʹ�õ�gettersetter������
	 * ��user�����action������
	 * ���ַ����ܺã���һ��Ҫ�õ���ʵ���൱��һ�����Խ��з�װ��ֱ�ӵ��ã�
	 * ��Ϊ��action��Ҫ�ö�Ӧ��user��Ϊʲô����һ��user����һ���Լ��������أ�
	 * 
	 */
	
	/**
	 * 2��struts package action result
	 * result /�����Ŀ¼
	 * package ��������ֲ�Ҫ��org struts action ��࣬�������֣�Ҫ�ܻ䡣������
	 * packageΪ�˷��������javase��ϵ����
	 * 
	 * package Ҫд extends struts-default�Ǹ�xml
	 * �������кܶ�Ҫ�õ���  �Լ�ûдrequest��response ������д������servletconfig
	 * �̳и��࣬�����Լ�ʵ��
	 * 
	 * ��action��ǩ����ʵ�ֵ�
	 * �Ҵ��������Լ����ᣬֻҪ��Ǯ�ͺã���Ҫ��ȫ���Լ�ʵ�֣���Щ����������ȥʵ��
	 * 
	 * �������������һ�£���Ϊ��һһ��Ӧ��
	 * 
	 * һ������һ��action
	 * ת�䣺
	 * �������һ��action ��method�мӷŵ���������
	 * form �е�ַ��СдҪ��ʵ����һ��
	 * 
	 * ���չ�ϵ
	 * action name == form action
	 * class == action��ĵ�ַ
	 * method == action��ķ���
	 * 
	 * result
	 * name ����ֵ    ��ת��ַ
	 * ��ʵ���õ���set get����  ���Դ�Сдһ��
	 * 
	 * ��action ��дmsg 
	 * el�õ�get��getter����������ֵ
	 * ���Դ�request��ȡ����
	 * 1������дҲ���Է�
	 * 2����ת��
	 * @author ����
	 *
	 *
	 *
	 * 
	 * 
	 * struts2��Ĳ���
	 * action����ŵ�ַ��Ȼ���أ��Ϳ�ʼ����web.xml���е�ַӰ�����
	 * org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
	 * Ȼ�����struts.xml���ҵ���Ӧ��ϵ
	 * ����struts package action result ˳����ң����ǽ�����д��
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ���������������
	 * ȡ����
	 * getproxy
	 * getconfig�õ�����
	 * 
	 * ai.getProxy().getConfig()   ���Եõ�request��
	 * 
	 * ��ҵ��
	 * 4��������
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 */

}
