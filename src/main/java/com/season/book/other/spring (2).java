package com.season.book.other;	spring的IOC容器负责bean的管理，当实例化一个bean是，spring保证该Bean所依赖的其他bean已经初始化。一般情况下，用<ref>元素建立对其他bean的依赖关系。
		比如：
			<bean id="a"   class="com.yanln.spring.bean.A">   </bean>  
			<bean id="b" class="com.yanln.spring.bean.B" p:a-ref="a"> </bean>
			
		但在某些情况下，这种bean之间的依赖关系并不那么明显。
			举个例子：
			某个论坛系统拥有很多系统参数（如会话过期时间、缓存更新时间等），这些系统参数用于控制系统的运行逻辑。
			比如：
				public class SystemSettings{  
		           //缓存更新时间  
		           public static int REFRESH_CYCLE = 60;  
		           ......  
				}  
 
			在SystemSettings中为每一个系统参数提供了默认值，但对于一个灵活的论坛是需要提供一个管理后台的，在管理后台中可以调整这些系统参数并保存到后台数据库中，而在系统启动时，初始化程序从数据库后台加载这些系统参数的值来覆盖系统默认值。比如：
				public class SystemInit{  
          			public SystemInit(){//模拟从数据库中加载的系统参数配置值  
						SystemSettings.REFRESH_CYCLE=100;  
						......  
					}  
				}  

			假设论坛系统有一个缓存刷新管理器，它需要根据系统参数SystemSettings.REFRESH_CYCLE创建缓存刷新定时任务：
				public class CacheManager{  
					public CacheManager(){  
						Timer t = new Timer();  
						TimerTask cacheTask = new CacheTask();                      
						//缓存刷新定时处理  
						t.schedule(cacheTask,0,SystemSettings.REFRESH_CYCLE);  
					}  
					......  
				}  
 
			在以上的实例中，CacheManager类需要用到SystemSetting类的值,而SystemSettings的值有SystemInit负责初始化，虽然CacheManager不直接依赖SystemInit，但从逻辑上看，CacheManager希望在SystemInit加载并完成系统参数设置后再启动，以获得最新的系统参数值。
			如果这三个bean都在spring配置文件中定义，我们如何保证SystemInit在CacheManager之前进行初始化呢？
 
			spring允许用户通过depends-on属性指定bean前置依赖的bean,前置依赖的bean会在本bean实例化之前创建好：

				<bean id="sysinit" class="SystemInit">  
				<bean id="manager" class="CacheManager"  depends-on="sysinit"/>  
 
			如果前置依赖于多个 Bean，则可以通过分号，逗号或空格的方式配置 Bean 的名称。
		


YEAR(ss.scheduleDate) &gt;= '${@com.goldenstone.oaSystemCommon.utils.DateUtils@getYear(model.beginDate)}'



<!-- 当为查询时，可定义 read-only="true"   可以提高我们查询的效率，优化查询的性能-->
<tx:method name="get*" read-only="true" />
<!-- propagation="REQUIRED"  当存在一个事务的事务支持当前事务，如果当前方法没有事务就开启一个新的事务 -->