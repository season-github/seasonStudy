1. @Transactional(readOnly = true)，可以提高我们查询的效率，优化查询的性能，在jdk中是这么，描述的 
> A boolean flag that can be set to true if the transaction is effectively read-only, allowing for corresponding optimizations at runtime.

2. @Transactional(readOnly = true, propagation = Propagation.REQUIRED)，默认事务，如果没有事务，则创建新的事务
> Support a current transaction, create a new one if none exists. Analogous to EJB transaction attribute of the same name.
This is the default setting of a transaction annotation.
3. qwe 
