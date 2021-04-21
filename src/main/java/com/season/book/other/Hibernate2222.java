package com.season.book.other;

/**
 * ��Զ����


        <set 
		name="stus" ������
		table="ter_stu"> �м��
        	<key column="terid" �м��ָ��ǰ������
		></key>        	
		<many-to-many 
		class="entity.Stu" ���Ե�·��  ����.����				column="stuid"   �м��ָ�����Ե����
		></many-to-many>
        </set>
ע�����:inverse=true   cascade=��save-update/all/delete��



һ��һ����ӳ�䣺�������ӳ��
�û��������Ĺ�ϵ��һ���˶�Ӧһ�ݵ�����������һ��һ�Ĺ�ϵ
�ڵ���������һ��userid�����Ե������Ǵӱ��û���������
�ڸ������зֱ𴴽��Է�������
�ڴӱ��Ӧ��ӳ���ļ�����<many-to-one>��ӳ�䵵�����user1������
<many-to-one name="users1"  ����
        class="entity.Users1"  ���Զ�Ӧ����
        column="userid"  ���
        cascade="all"   ������ϵ
        unique="true"   ����һ��һ����
        ></many-to-one>
�������Ӧ��ӳ���ļ������<one-to-one>
<one-to-one name="resume1"  ����
        class="entity.Resume1"  ���Զ�Ӧ����
        property-ref="users1"   ��������
        ></one-to-one>
��������ӳ��
��Ϊ���ű��ж�û�����������ֻ����һ�ű�ĵ�������Ϊ������ͬʱ����Ϊ���������һ�ű���users2Ϊ�����˱�������Ϊ������ͬʱ����Ϊ���������������Ļ�����ôusers2�����˵���Ǵӱ�resume2��������
��user2�д���resume2������
��resume2�д���user2������
�������Ӧ��ӳ���ļ��У�
<one-to-one name="users2"
        class="entity.Users2"
        cascade="all"
        ></one-to-one>
�ڴӱ��Ӧ��ӳ���ļ��У�
<one-to-one name="resume2"
        class="entity.Resume2"
        cascade="all"
        constrained="true"  ��Ϊ������ͬʱ����Ϊ�������resume2�������
        ></one-to-one>






Ȼ���޸Ĵӱ���������ɲ���
<id name="userid" type="java.lang.Integer">
            <column name="userid" />
            <generator class="foreign">
            	<param name="property">resume2</param>
            </generator>
        </id>
 *
 */
public class two {

}
