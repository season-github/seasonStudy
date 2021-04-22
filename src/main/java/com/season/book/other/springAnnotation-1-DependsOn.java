package com.season.book.other;	spring��IOC��������bean�Ĺ�����ʵ����һ��bean�ǣ�spring��֤��Bean������������bean�Ѿ���ʼ����һ������£���<ref>Ԫ�ؽ���������bean��������ϵ��
		���磺
			<bean id="a"   class="com.yanln.spring.bean.A">   </bean>  
			<bean id="b" class="com.yanln.spring.bean.B" p:a-ref="a"> </bean>
			
		����ĳЩ����£�����bean֮���������ϵ������ô���ԡ�
			�ٸ����ӣ�
			ĳ����̳ϵͳӵ�кܶ�ϵͳ��������Ự����ʱ�䡢�������ʱ��ȣ�����Щϵͳ�������ڿ���ϵͳ�������߼���
			���磺
				public class SystemSettings{  
		           //�������ʱ��  
		           public static int REFRESH_CYCLE = 60;  
		           ......  
				}  
 
			��SystemSettings��Ϊÿһ��ϵͳ�����ṩ��Ĭ��ֵ��������һ��������̳����Ҫ�ṩһ�������̨�ģ��ڹ����̨�п��Ե�����Щϵͳ���������浽��̨���ݿ��У�����ϵͳ����ʱ����ʼ����������ݿ��̨������Щϵͳ������ֵ������ϵͳĬ��ֵ�����磺
				public class SystemInit{  
          			public SystemInit(){//ģ������ݿ��м��ص�ϵͳ��������ֵ  
						SystemSettings.REFRESH_CYCLE=100;  
						......  
					}  
				}  

			������̳ϵͳ��һ������ˢ�¹�����������Ҫ����ϵͳ����SystemSettings.REFRESH_CYCLE��������ˢ�¶�ʱ����
				public class CacheManager{  
					public CacheManager(){  
						Timer t = new Timer();  
						TimerTask cacheTask = new CacheTask();                      
						//����ˢ�¶�ʱ����  
						t.schedule(cacheTask,0,SystemSettings.REFRESH_CYCLE);  
					}  
					......  
				}  
 
			�����ϵ�ʵ���У�CacheManager����Ҫ�õ�SystemSetting���ֵ,��SystemSettings��ֵ��SystemInit�����ʼ������ȻCacheManager��ֱ������SystemInit�������߼��Ͽ���CacheManagerϣ����SystemInit���ز����ϵͳ�������ú����������Ի�����µ�ϵͳ����ֵ��
			���������bean����spring�����ļ��ж��壬������α�֤SystemInit��CacheManager֮ǰ���г�ʼ���أ�
 
			spring�����û�ͨ��depends-on����ָ��beanǰ��������bean,ǰ��������bean���ڱ�beanʵ����֮ǰ�����ã�

				<bean id="sysinit" class="SystemInit">  
				<bean id="manager" class="CacheManager"  depends-on="sysinit"/>  
 
			���ǰ�������ڶ�� Bean�������ͨ���ֺţ����Ż�ո�ķ�ʽ���� Bean �����ơ�