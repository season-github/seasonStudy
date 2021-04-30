package com.season.book.other;

一 SpringJDBC
  spring对jdbc的封装，通过使用spring jdbc来访问数据库，就不在需要考虑获取连接与关闭等问题。
“封装”了常见的JDBC访问算法，提供了简介的API
  JdbcTemplate--封装了常用的CRUD操作   CRUD：增删改查

 1.如何使用spring jdbc?
   step1:导包  Spring-jdbc,DBCP,JDBC Driver与spring-webmvc,ojdbc,junit
     注：Spring-jddbc的底层依然是JDBC,离不开数据库驱动
   step2:添加配置文件
      主要是两个配置：连接池的配置和jdbcTemplate的配置
        例：
          <mvc:properties id = "db" location = "classpath:db.properties"/>
          <bean id = "datasource" class = "org.apache.commons.dbcp.BasicDataSource">
              <property name = "driverClassName" value = "#{db.driver}"/>
              <property name = "url" value = "#{db.url}"/>
              <property name = "username" value = "#{db.user}"/>
              <property name = "password" value = "#{db.password}"/>
          </bean>
           <!-- 配置使用Spring-jdbc -->
       <bean id = "jdbcTemplate" class  = "org.springframework.jdbc.core.JdbcTemplate">
       <!-- 必须注入dataSource用以连接数据库 -->
           <property name = "dataSource" ref = "dataSource"/>
       </bean>
     注：JdbcTemplate封装了常见的一些数据库操作（CRUD），需要将连接池注入到JdbcTemplate用以连接到数据库
   step3:从Spring中获取jdbcTemplate对象，调用CRUD方法即可,使用JdbcTemplate时，
         执行DML（insert update delete）方法：
           -- int update(sql,sql参数);
         执行DQL语句方法：
          -- List<对象> query(sq,sql参数，RowMapper);
           -- 对象 queryForObject(sql,sql参数，RowMapper);
           --List<Map<String,Object>> queryForList(sql);
      例：@Test
	public void testInsert(){
	  JdbcTemplate template = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
	  String sql = "insert into JSD08_t_wdd values(?,?,?,?,?)";
	  //利用JdbcTemplate执行插入语句
	  template.update(sql,8,"Mac","123","12345678","德州");
	  //update的底层封装了JDBC操作
	}
        @Test
	public void testupdate(){
	  String sql = "update JSD08_t_wdd set address = ? where id = ?";
  	  JdbcTemplate template = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
	  int n = template.update(sql,"大理",8);
	  System.out.println(n);
	}
	@Test
	public void testDelete(){
	  String sql = "delete JSD08_t_wdd where id = ?";
	  JdbcTemplate template = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
	  int n = template.update(sql,8);
	  System.out.println(n);
	} 
        @Test
	public void testQuery1(){
	  String sql = "select * from JSD08_t_wdd";
	  JdbcTemplate template = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
	  //封装将结果集的一行如何映射为一个User对象
	  RowMapper<User> rsToUser = new RowMapper<User>(){
		public User mapRow(ResultSet rs, int index) throws SQLException {
	    	  User user = new User();
	    	  user.setAddress(rs.getString("address"));
	    	  user.setId(rs.getInt("id"));
	    	  user.setMobile(rs.getString("mobile"));
	    	  user.setPassword(rs.getString("password"));
	    	  user.setUsername(rs.getString("username"));
	    	  return user;
	    }
	};
	List<User> list = template.query(sql, rsToUser);
	for(User user:list){
	  System.out.println(user);
	}
	//当RowMapper被重用时，代码就会大大简化
	//执行登录SQL
	String sql1 = "select * from JSD08_t_wdd where username = ?";
	String[] name = {"tom"};
	User user = template.queryForObject(sql1, name, rsToUser);
	System.out.println(user);
	//多参数查询
	sql = "select * from JSD08_t_wdd where username = ? and password = ?";
	//可以是任何类型参数，但参数的次序与个数必须与SQL中的？一致
	Object[] params = {"tom","123"};
	List<User> users = template.query(sql, params, rsToUser);
	for(User u:users){
		System.out.println(u);
	}
	//多参数参数（like）
	sql = "select * from JSD08_t_wdd where username like ? or mobile like ?";
	params = new Object[]{"%o%","%1%"};
	users = template.query(sql, params, rsToUser);
	for(User u:users){
		System.out.println(u);
	}
}
   
   
   
   
   
   
   
   
   
