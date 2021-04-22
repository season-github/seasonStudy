package com.season.book.other;

public class Info01 {
/**
	1.jar��
	2.mybatis�����ļ�	������:������, ���ݿ������ļ� mapper
	3.����ʵ����
	4.����ʵ�����Ӧ��ӳ���ļ�	��Ҫ��С���������д��һ��dao���� , ��˾���resource��������һ��� 
	5.��д���������

	mapper �ļ��� , �õ�һ��ʵ�����һ���������� ,�õ���#{}

	��ʵ�������������������һ�£�Ҫ��resultMap
			<resultMap type="entity.Dept" id="dept">
				<id property="deptno" column="deptno"/>
				<result property="dname" column="dname"/>
				<result property="deptloc" column="loc"/>
			</resultMap>
	�ڶ�Ӧ�Ĳ�ѯ������resultMap="id��"   ����

	mybatis������sql���ƴ�ӣ�
		if:ֻҪ��������������ƴ��sql���
						<select id="dao.IDeptDao.byCondition" resultMap="dept" parameterType="entity.Dept">
							     	select * from dept
							     	<where>
								     	<if test="deptno!=null">
								     	 	deptno>#{deptno}
								     	</if>
								     	<if test="dname!=null">
								     		and dname like #{dname}
								     	</if>
								     	<if test="deptloc!=null">
								     		and loc like #{deptloc}
								     	</if>
							     	</where>
					     </select>
		choose���൱��switch��ֻҪ��һ���������㣬�Ͳ���ʣ�µ���
						<select id="dao.IDeptDao.byCondition2" resultMap="dept" parameterType="entity.Dept">
					     	select * from dept where 1=1
					     	<choose>
					     		<when test="deptno!=null">
					     			and deptno > #{deptno}
					     		</when>
					     		<when test="dname!=null">
					     			and dname like #{dname}
					     		</when>
					     		<when test="deptloc!=null">
					     			and loc like #{deptloc}
					     		</when>
					     		<otherwise></otherwise>
					     	</choose>
					     </select>

set������ƴ�Ӹ��ĵ�sql��䣬��Ҫ���Ǻ���Ķ���
<update id="dao.IDeptDao.update2" parameterType="entity.Dept">
     	update dept
     	<set>
     	<if test="dname!=null">
     		dname=#{dname},//��Ҫ���Ǻ���Ķ���
     	
     	</if>
     	<if test="deptloc!=null">
     		loc=#{deptloc},//��Ҫ���Ǻ���Ķ���
     	</if>
     	</set>
     	<where>
     	deptno=#{deptno}
     	</where>
     </update>




	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
