package com.season.book.other;
/**
 * ���ʻ�,����Ҫglobal resource properties
 * @author ����
 * message_zh_CN.properties
 * ��Ҫд����,������myeclipse��æ��
 * 
 * ���չʾ��?   Key��һ���� message_en_US.properties message_zh_CN.properties
 * 
 * i18n
 * 
 * struts.xml  �Լ����������д
 * 
 * ��ʾ�ط�  
 * 1.jsp  ��ǩ��
 * 
 * ��form���õ���key ����lable
 * 
 * 1.��<s:text�� �� name="login.page.title"
 * 
 * 2.key="login.page.title"
 * 
 * 3.value="%{getText('login.page.title')}"
 * 
 * aaa 
 * 4.<s:i18n name="aaa.message1">		.��ʾ��ι�ϵ
 * 			<s:text  name="login.page.title"></s:text>
 * 	 </s:i18n>
 * 
 * action �д�����Ϣ,Ҳ�ð��չ��ʻ���
 * 
 * ��action����Ϣʧ��:		msg=getText("login.error.msg");(action ��д�� )
 * 
 * 1.getText()�� actionsupport�Դ���
 * 2.action������,������getText��ȡ
 * 
 * ������֤,У��
 * 
 * request���׳�����,����ֱ�Ӵ�session�оͺ�
 * 
 * ��struts2��֤���,Ҳ�� ���ʻ���  
 * <message>���벻Ϊ��</message>
 * <message key="login.password.emptyError"/>
 * ��֤�ļ��Ĺ��ʻ�,message��key
 * 
 * -----------------------------------------------------------------------------------
 * ����ת��:
 * ��Ӣ�Ķ���
 * ȫ������ת�� ����һ����ʾ
 * xwork.default.invalid.fieldvalue=�ֶ�{0}ת��ʧ��    // ռλ�������ſؼ���
 * ���Ͼͺ�ʹ,�ÿ�����ȥ��
 * 
 * 
 * �ֲ�����װ��,��action�İ���
 * UsersAction.java
 * UsersAction-convertion.properties
 * 
 * UsersAction_zh_CN.properties
 * UsersAction_en_US.properties
 * 
 * ������д
 * invalid.fieldvalue.xxx=
 * invalid.fieldvalue.user.born=born convert error
 * ������,�ֲ����ȫ�ֵĸǵ�
 * 
 * �ֲ�д��action����
 * ȫ��д��src��
 * 
 * �ֲ�ռ��
 * 
 * ������Լ�����ҳ�� ������������
 * 
 * setLocal()���������ĵ�����
 * 
 * д��ʱ��һ��Ҫ��ϸ��,������дgettersetter����
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


public class International {

}
